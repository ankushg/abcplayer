package grammar;

import grammar.ABCMusicParser.FractionContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import music.Accidental;
import music.AccidentalType;
import music.Chord;
import music.ChordSequence;
import music.ChordSequenceList;
import music.Fraction;
import music.KeySignature;
import music.KeyType;
import music.Measure;
import music.Note;
import music.Song;
import music.Syllable;
import music.Tuplet;
import music.Voice;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import sound.Pitch;

public class Listener extends ABCMusicBaseListener {
    private String trackNumber;
    private String title;
    private String composer;
    private Fraction meter;
    private Fraction defaultLength;
    private Fraction fracTempo;
    private int tempo;
    private KeySignature keySignature;
    private Song song;

    private List<Note> notes = new ArrayList<Note>();
    private Fraction chordDuration = null;
    private Map<String, List<ChordSequence>> map = new HashMap<>();
    private Deque<Object> chordsAndBars = new LinkedList<>();
    private Map<String, List<Object>> chordsAndBarsByVoice = new HashMap<>();
    private Deque<Object> lyricsAndBars = new LinkedList<>();
    private Map<String, List<Object>> lyricsAndBarsByVoice = new HashMap<>();

    private String currentVoice = "";
    private Set<String> voiceNames = new HashSet<>();
    private int tupletLength = 0;

    public Song getSong() {
        return song;
    }

    @Override
    public void enterAbc_music(ABCMusicParser.Abc_musicContext ctx) {
    }

    @Override
    public void exitAbc_music(ABCMusicParser.Abc_musicContext ctx) {
        List<Voice> voices = new ArrayList<Voice>();
        for (String voiceName : voiceNames) {
            List<Object> chordsAndBars = chordsAndBarsByVoice.get(voiceName);
            List<Object> lyricsAndBars = lyricsAndBarsByVoice.get(voiceName);

            List<Object> flattenedChordsAndBars = new ArrayList<>();
            for (Object o : chordsAndBars) {
                if (o instanceof ChordSequence) {
                    flattenedChordsAndBars.addAll(((ChordSequence) o).getChords());
                } else {
                    flattenedChordsAndBars.add(o);
                }
            }

            Iterator<Object> lyricsIterator = lyricsAndBars.iterator();
            Iterator<Object> chordsIterator = flattenedChordsAndBars.iterator();
            int count = 0;
            List<List<Syllable>> lyrics = new ArrayList<>();

            // TODO these loops have indexing errors
            if (lyricsIterator.hasNext()) {
                List<Syllable> currentMeasure = new ArrayList<>();
                Object c, s = lyricsIterator.next();
                while (chordsIterator.hasNext()) {
                    if (s instanceof Syllable && count == 0) {
                        count = ((Syllable) s).length;
                        currentMeasure.add((Syllable) s);
                        s = lyricsIterator.next();
                    }
                    c = chordsIterator.next();
                    if (c instanceof Chord) {
                        count--;
                    } else {
                        if (s instanceof BarLine) {
                            s = lyricsIterator.next();
                        }
                        lyrics.add(currentMeasure);
                        currentMeasure = new ArrayList<>();
                    }
                }
            }

            System.out.println("LYRICS " + lyrics);
            Iterator<List<Syllable>> lyricsMeasureIterator = lyrics.iterator();
            List<Object> measuresAndBars = new ArrayList<>();
            List<ChordSequence> currentMeasureChords = new ArrayList<>();
            for (Object o : chordsAndBars) {
                if (o instanceof ChordSequence) {
                    currentMeasureChords.add((ChordSequence) o);
                } else {
                    measuresAndBars.add(new Measure(keySignature,
                            lyricsMeasureIterator.hasNext() ? lyricsMeasureIterator.next() : new ArrayList<Syllable>(),
                            currentMeasureChords));
                    if (o != BarLine.MEASURE) {
                        measuresAndBars.add(o);
                    }
                    currentMeasureChords = new ArrayList<>();
                }
            }

            // TODO deal with repeats

            voices.add(new Voice(new ChordSequenceList(measuresAndBars)));
        }

        if (meter == null) {
            meter = new Fraction(4, 4);
        }
        if (composer == null) {
            composer = "Unknown";
        }
        if (defaultLength == null) {
            if (meter.numerator * 4 < 3 * meter.denominator) {
                defaultLength = new Fraction(1, 16);
            } else {
                defaultLength = new Fraction(1, 8);
            }
        }
        if (fracTempo == null) {
            fracTempo = defaultLength;
            tempo = 100;
        }

        song = new Song(voices, trackNumber, title, composer, meter, defaultLength, fracTempo, keySignature, tempo);
        System.out.println(lyricsAndBarsByVoice);
        System.out.println(chordsAndBarsByVoice);
    }

    @Override
    public void enterVoice(ABCMusicParser.VoiceContext ctx) {
    }

    @Override
    public void exitVoice(ABCMusicParser.VoiceContext ctx) {
        voiceNames.add(currentVoice);
        if (!chordsAndBarsByVoice.containsKey(currentVoice)) {
            chordsAndBarsByVoice.put(currentVoice, new ArrayList<>());
        }
        chordsAndBarsByVoice.get(currentVoice).addAll(chordsAndBars);
        chordsAndBars.clear();
        if (!lyricsAndBarsByVoice.containsKey(currentVoice)) {
            lyricsAndBarsByVoice.put(currentVoice, new ArrayList<>());
        }
        lyricsAndBarsByVoice.get(currentVoice).addAll(lyricsAndBars);
        lyricsAndBars.clear();
    }

    @Override
    public void enterDuplet(ABCMusicParser.DupletContext ctx) {
        tupletLength = 2;
    }

    @Override
    public void exitDuplet(ABCMusicParser.DupletContext ctx) {
    }

    @Override
    public void enterQuadruplet(ABCMusicParser.QuadrupletContext ctx) {
        tupletLength = 4;
    }

    @Override
    public void exitQuadruplet(ABCMusicParser.QuadrupletContext ctx) {
    }

    @Override
    public void enterAbc_header(ABCMusicParser.Abc_headerContext ctx) {
    }

    @Override
    public void exitAbc_header(ABCMusicParser.Abc_headerContext ctx) {
    }

    @Override
    public void enterTempo(ABCMusicParser.TempoContext ctx) {
    }

    @Override
    public void exitTempo(ABCMusicParser.TempoContext ctx) {
        fracTempo = buildFraction(ctx.fraction());
        tempo = Integer.parseInt(ctx.INTEGER().getText());
    }

    @Override
    public void enterBar_line(ABCMusicParser.Bar_lineContext ctx) {
    }

    @Override
    public void exitBar_line(ABCMusicParser.Bar_lineContext ctx) {
        chordsAndBars.add(BarLine.getBarLine(ctx.getText()));
    }

    @Override
    public void enterField_optional(ABCMusicParser.Field_optionalContext ctx) {
    }

    @Override
    public void exitField_optional(ABCMusicParser.Field_optionalContext ctx) {
    }

    @Override
    public void enterAbc_tune(ABCMusicParser.Abc_tuneContext ctx) {
    }

    @Override
    public void exitAbc_tune(ABCMusicParser.Abc_tuneContext ctx) {
    }

    @Override
    public void enterChord(ABCMusicParser.ChordContext ctx) {

    }

    @Override
    public void exitChord(ABCMusicParser.ChordContext ctx) {
        Chord chord = new Chord(chordDuration, notes);
        chordDuration = null;
        notes.clear();
        chordsAndBars.add(chord);
    }

    @Override
    public void enterField_key(ABCMusicParser.Field_keyContext ctx) {
    }

    @Override
    public void exitField_key(ABCMusicParser.Field_keyContext ctx) {
    }

    @Override
    public void enterEol(ABCMusicParser.EolContext ctx) {
    }

    @Override
    public void exitEol(ABCMusicParser.EolContext ctx) {
    }

    @Override
    public void enterAccidental(ABCMusicParser.AccidentalContext ctx) {
    }

    @Override
    public void exitAccidental(ABCMusicParser.AccidentalContext ctx) {
    }

    @Override
    public void enterNote(ABCMusicParser.NoteContext ctx) {
    }

    @Override
    public void exitNote(ABCMusicParser.NoteContext ctx) {
        Note n;
        String note;
        Pitch pitch;
        Fraction duration;
        if (ctx.fraction() != null) {
            duration = buildFraction(ctx.fraction());
        } else if (ctx.INTEGER() != null) {
            int numerator = Integer.parseInt(ctx.INTEGER().getText());
            duration = new Fraction(numerator, 1);
        } else {
            duration = new Fraction(1, 1);
        }
        if (chordDuration == null) {
            chordDuration = duration;
        }
        if (ctx.pitch() != null) {
            note = ctx.pitch().BASE().getText();
            if (Character.isLowerCase(note.charAt(0))) {
                pitch = new Pitch(Character.toUpperCase(note.charAt(0)));
                pitch = pitch.octaveTranspose(1);
            } else {
                pitch = new Pitch(note.charAt(0));
            }

            // Add in octaves.
            if (ctx.pitch().OCTAVE() != null) {
                for (char c : ctx.pitch().OCTAVE().getText().toCharArray()) {
                    if (c == '\'') {
                        pitch = pitch.octaveTranspose(1);
                    } else if (c == ',') {
                        pitch = pitch.octaveTranspose(-1);
                    }
                }
            }

            // Add in accidental.
            Accidental accidental = new Accidental(AccidentalType.NONE, 0);
            if (ctx.pitch().accidental() != null) {
                if (ctx.pitch().accidental().getText().equals("=")) {
                    accidental = new Accidental(AccidentalType.NATURAL, 0);
                } else {
                    int sharps = 0;
                    for (char c : ctx.pitch().accidental().getText().toCharArray()) {
                        if (c == '^') {
                            sharps++;
                        } else if (c == '_') {
                            sharps--;
                        }
                    }
                    accidental = new Accidental(AccidentalType.SHARP, sharps);
                }
            }
            n = new Note(pitch, duration, accidental);

            notes.add(n);
        }
    }

    @Override
    public void enterField_tempo(ABCMusicParser.Field_tempoContext ctx) {

    }

    @Override
    public void exitField_tempo(ABCMusicParser.Field_tempoContext ctx) {
    }

    @Override
    public void enterFraction(ABCMusicParser.FractionContext ctx) {
    }

    @Override
    public void exitFraction(ABCMusicParser.FractionContext ctx) {
    }

    @Override
    public void enterTune(ABCMusicParser.TuneContext ctx) {
    }

    @Override
    public void exitTune(ABCMusicParser.TuneContext ctx) {

    }

    @Override
    public void enterField_composer(ABCMusicParser.Field_composerContext ctx) {
    }

    @Override
    public void exitField_composer(ABCMusicParser.Field_composerContext ctx) {
    }

    @Override
    public void enterKey_signature(ABCMusicParser.Key_signatureContext ctx) {
    }

    @Override
    public void exitKey_signature(ABCMusicParser.Key_signatureContext ctx) {
        keySignature = new KeySignature(KeyType.getKeyType(ctx.getText()));
    }

    @Override
    public void enterSyllable(ABCMusicParser.SyllableContext ctx) {
    }

    @Override
    public void exitSyllable(ABCMusicParser.SyllableContext ctx) {
        String syl = ctx.getText();
        int length = 1;
        while (syl.endsWith("_")) {
            syl = syl.substring(0, syl.length() - 1);
            length++;
        }
        lyricsAndBars.add(new Syllable(syl, length));
    }

    @Override
    public void enterLyric_barline(ABCMusicParser.Lyric_barlineContext ctx) {
    }

    @Override
    public void exitLyric_barline(ABCMusicParser.Lyric_barlineContext ctx) {
        lyricsAndBars.add(BarLine.LYRIC_BARLINE);
    }

    @Override
    public void enterLyric(ABCMusicParser.LyricContext ctx) {
    }

    @Override
    public void exitLyric(ABCMusicParser.LyricContext ctx) {
    }

    @Override
    public void enterField_default_length(ABCMusicParser.Field_default_lengthContext ctx) {
    }

    @Override
    public void exitField_default_length(ABCMusicParser.Field_default_lengthContext ctx) {
        defaultLength = buildFraction(ctx.fraction());
    }

    @Override
    public void enterField_track_number(ABCMusicParser.Field_track_numberContext ctx) {
    }

    @Override
    public void exitField_track_number(ABCMusicParser.Field_track_numberContext ctx) {
        trackNumber = ctx.INTEGER().getText();
    }

    @Override
    public void enterString(ABCMusicParser.StringContext ctx) {
    }

    @Override
    public void exitString(ABCMusicParser.StringContext ctx) {
    }

    @Override
    public void enterField_meter(ABCMusicParser.Field_meterContext ctx) {
    }

    @Override
    public void exitField_meter(ABCMusicParser.Field_meterContext ctx) {
        if (ctx.NON_FRACTION_METER() != null) {
            if (ctx.NON_FRACTION_METER().getText().equals("C")) {
                meter = new Fraction(4, 4);
            } else if (ctx.NON_FRACTION_METER().getText().equals("C|")) {
                meter = new Fraction(2, 2);
            }
        } else {
            meter = buildFraction(ctx.fraction());
        }
    }

    @Override
    public void enterTriplet(ABCMusicParser.TripletContext ctx) {
        tupletLength = 3;
    }

    @Override
    public void exitTriplet(ABCMusicParser.TripletContext ctx) {
    }

    @Override
    public void enterTuplet(ABCMusicParser.TupletContext ctx) {
    }

    @Override
    public void exitTuplet(ABCMusicParser.TupletContext ctx) {
        List<Chord> tupletList = new ArrayList<>();
        for (int i = 0; i < tupletLength; i++) {
            tupletList.add((Chord) chordsAndBars.removeLast());
        }
        Collections.reverse(tupletList);
        chordsAndBars.add(new Tuplet(tupletLength, tupletList));
        tupletLength = 0;
    }

    @Override
    public void enterField_title(ABCMusicParser.Field_titleContext ctx) {
    }

    @Override
    public void exitField_title(ABCMusicParser.Field_titleContext ctx) {
        title = ctx.string().getText();
    }

    @Override
    public void enterComment(ABCMusicParser.CommentContext ctx) {
    }

    @Override
    public void exitComment(ABCMusicParser.CommentContext ctx) {
    }

    @Override
    public void enterPitch(ABCMusicParser.PitchContext ctx) {
    }

    @Override
    public void exitPitch(ABCMusicParser.PitchContext ctx) {
    }

    @Override
    public void enterField_voice(ABCMusicParser.Field_voiceContext ctx) {
    }

    @Override
    public void exitField_voice(ABCMusicParser.Field_voiceContext ctx) {
        currentVoice = ctx.string().getText();
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public void visitTerminal(TerminalNode node) {
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
    }

    public Fraction buildFraction(FractionContext ctx) {
        int numerator = -1;
        int denominator = -1;
        boolean seenSlash = false;
        for (ParseTree child : ctx.children) {
            TerminalNode fractionFragment = (TerminalNode) child;
            if (fractionFragment.getSymbol().getType() == ABCMusicLexer.OVER) {
                seenSlash = true;
            } else if (fractionFragment.getSymbol().getType() == ABCMusicParser.INTEGER) {
                int integer = Integer.parseInt(fractionFragment.getText());
                if (!seenSlash) {
                    numerator = integer;
                } else {
                    denominator = integer;
                }
            }
        }
        if (numerator == -1) {
            numerator = 1;
        }
        if (denominator == -1) {
            denominator = 2;
        }
        return new Fraction(numerator, denominator);
    }
}
