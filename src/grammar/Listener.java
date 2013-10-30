package grammar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import music.Accidental;
import music.AccidentalType;
import music.Chord;
import music.ChordSequence;
import music.ChordSequenceList;
import music.Fraction;
import music.Measure;
import music.Note;
import music.Repeat;
import music.Song;
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
    private Fraction meter;
    private Fraction defaultLength;
    private String tempo;
    private String keySignature;
    private boolean inTuplet;
    private Song song;

    private List<Note> notes = new ArrayList<Note>();
    private Fraction chordDuration = null;
    private List<Object> chordsAndBars = new ArrayList<Object>();
    private List<ChordSequence> chordSequences = new ArrayList<ChordSequence>();
    private List<Chord> tupletList = new ArrayList<Chord>();
    private Map<String, ArrayList<ChordSequence>> map = new HashMap<String, ArrayList<ChordSequence>>();
    private String currentVoice = "";

    public Song getSong() {
        System.out.println("merp");

        return song;
    }

    @Override
    public void enterAbc_music(ABCMusicParser.Abc_musicContext ctx) {
    }

    // TODO: How do we take care of invalid inputs? For example if the name of a
    // voice wasn't followed by the voice itself
    @Override
    public void exitAbc_music(ABCMusicParser.Abc_musicContext ctx) {

        ArrayList<Voice> voices = new ArrayList<Voice>();
        for (ArrayList<ChordSequence> sequence : map.values()) {
            voices.add(new Voice(sequence));
        }
        System.out.println(map);
        System.out.println("The number of voices is " + voices.size());
        song = new Song(voices);
        /*
         * // Stuff to test playing chords
         * System.out.println("now playing...1");
         * 
         * ChordSequenceList csl = new ChordSequenceList(chordSequences);
         * List<Chord> finalChords = csl.getChords(); int ticksPerBeat =
         * Utilities.computeTicksPerBeat(finalChords); List<ReadyToAddItem>
         * items = Utilities.getReadyToAddItems(finalChords);
         * 
         * LyricListener listener = new LyricListener() { public void
         * processLyricEvent(String text) { System.out.print(text); } };
         * 
         * SequencePlayer player; try { player = new SequencePlayer(140,
         * ticksPerBeat, listener); for (ReadyToAddItem item : items) {
         * item.addTo(player); } player.play(); } catch (Exception e) {
         * e.printStackTrace(); }
         */
    }

    @Override
    public void enterVoice(ABCMusicParser.VoiceContext ctx) {
        chordsAndBars.clear();
    }

    @Override
    // TODO: handle repeats and alternate endings. Handle repeats when there's
    // no |:
    public void exitVoice(ABCMusicParser.VoiceContext ctx) {
        List<ChordSequence> chords = new ArrayList<ChordSequence>();
        List<ChordSequence> noEnding = new ArrayList<ChordSequence>();
        List<ChordSequence> firstEnding = new ArrayList<ChordSequence>();
        boolean inRepeat = false;
        boolean inFirstEnding = false;
        for (Object x : chordsAndBars) {
            if (x instanceof Chord) {
                chords.add((Chord) x);
                // System.out.println(chords.size());
            } else if (x instanceof Tuplet) {
                chords.add((Tuplet) x);
            } else {
                if (x instanceof String) {
                    if (x.equals("|")) {
                        Measure m = new Measure(chords);
                        if (inFirstEnding) {
                            firstEnding.add(m);
                        } else if (inRepeat && !inFirstEnding) {
                            noEnding.add(m);
                        } else {
                            chordSequences.add(m);
                        }
                        chords.clear();
                    } else if (x.equals("|:")) {
                        inRepeat = true;
                    } else if (x.equals(":|")) {
                        inRepeat = false;
                        inFirstEnding = false;
                        Measure m = new Measure(chords);
                        firstEnding.add(m);
                        ChordSequence repeat = new Repeat(new ChordSequenceList(noEnding), new ChordSequenceList(
                                firstEnding));
                        chordSequences.add(repeat);
                        /*
                         * chordSequences.addAll(noEnding);
                         * chordSequences.addAll(firstEnding);
                         * chordSequences.addAll(noEnding);
                         */
                        chords.clear();
                    } else if (x.equals("[1")) {
                        inFirstEnding = true;
                    } else if (x.equals("[2")) {
                    } else {
                        Measure m = new Measure(chords);
                        chordSequences.add(m);
                        chords.clear();
                    }
                }
            }

        }
        System.out.println(map);
        ArrayList<ChordSequence> newList = map.remove(currentVoice);

        if (newList == null) {
            newList = new ArrayList<ChordSequence>();
        }
        newList.addAll(chordSequences);

        map.put(currentVoice, newList);
        System.out.println(map);
        chordSequences = new ArrayList<ChordSequence>();

        // voiceFragments.add(chordSequences);
    }

    @Override
    public void enterDuplet(ABCMusicParser.DupletContext ctx) {
    }

    @Override
    public void exitDuplet(ABCMusicParser.DupletContext ctx) {
    }

    @Override
    public void enterQuadruplet(ABCMusicParser.QuadrupletContext ctx) {
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
        tempo = ctx.getText();
    }

    @Override
    public void enterBar_line(ABCMusicParser.Bar_lineContext ctx) {
    }

    @Override
    public void exitBar_line(ABCMusicParser.Bar_lineContext ctx) {
        chordsAndBars.add(ctx.getText());
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
        if (inTuplet) {
            tupletList.add(chord);
        } else {
            chordsAndBars.add(chord);
        }
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
            int numerator = -1;
            int denominator = -1;
            boolean seenSlash = false;
            for (ParseTree child : ctx.fraction().children) {
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
            duration = new Fraction(numerator, denominator);
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
            // System.out.println(note);
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
        String key = ctx.getText();
    }

    @Override
    public void enterSyllable(ABCMusicParser.SyllableContext ctx) {
    }

    @Override
    public void exitSyllable(ABCMusicParser.SyllableContext ctx) {
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
        String lengthString = ctx.fraction().toString();

        int numerator = Character.getNumericValue(lengthString.charAt(0));
        int denom = Character.getNumericValue(lengthString.charAt(2));

        defaultLength = new Fraction(numerator, denom);
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
            } else if (ctx.NON_FRACTION_METER().getText().equals("C")) {
                meter = new Fraction(2, 2);
            }
        } else {
            String meterString = ctx.fraction().getText();

            int numerator = Character.getNumericValue(meterString.charAt(0));
            int denom = Character.getNumericValue(meterString.charAt(2));

            meter = new Fraction(numerator, denom);
        }
    }

    @Override
    public void enterTriplet(ABCMusicParser.TripletContext ctx) {
    }

    @Override
    public void exitTriplet(ABCMusicParser.TripletContext ctx) {
        Tuplet tuplet = new Tuplet(3, tupletList);
        chordsAndBars.add(tuplet);
        tupletList.clear();
    }

    @Override
    public void enterTuplet(ABCMusicParser.TupletContext ctx) {
        inTuplet = true;
    }

    @Override
    public void exitTuplet(ABCMusicParser.TupletContext ctx) {
        inTuplet = false;
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
        String name = ctx.string().getText();
        currentVoice = name;
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
}
