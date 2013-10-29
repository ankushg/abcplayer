package grammar;

import java.util.ArrayList;
import java.util.List;

import music.Accidental;
import music.AccidentalType;
import music.Chord;
import music.ChordSequence;
import music.ChordSequenceList;
import music.Fraction;
import music.Measure;
import music.Note;
import music.ReadyToAddItem;
import music.Tuplet;
import music.Utilities;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import sound.LyricListener;
import sound.Pitch;
import sound.SequencePlayer;

public class Listener extends ABCMusicBaseListener {

    String trackNumber;
    String title;
    Fraction meter;
    Fraction defaultLength;
    String tempo;
    String keySignature;
    boolean inTuplet;

    List<Note> notes = new ArrayList<Note>();
    List<Chord> chords = new ArrayList<Chord>();
    List<Object> chordsAndBars = new ArrayList<Object>();
    List<ChordSequence> measures = new ArrayList<ChordSequence>();
    List<Chord> tupletList = new ArrayList<Chord>();

    @Override
    public void enterAbc_music(ABCMusicParser.Abc_musicContext ctx) {
    }

    @Override
    public void exitAbc_music(ABCMusicParser.Abc_musicContext ctx) {
        System.out.println("now playing...1");

        ChordSequenceList csl = new ChordSequenceList(measures);
        System.out.println(measures);
        List<Chord> finalChords = csl.getChords();
        int ticksPerBeat = Utilities.computeTicksPerBeat(finalChords);
        List<ReadyToAddItem> items = Utilities.getReadyToAddItems(finalChords);

        System.out.println(items.toString());
        LyricListener listener = new LyricListener() {
            public void processLyricEvent(String text) {
                System.out.print(text);
            }
        };

        SequencePlayer player;
        try {
            player = new SequencePlayer(140, ticksPerBeat, listener);
            for (ReadyToAddItem item : items) {
                item.addTo(player);
            }
            player.play();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void enterVoice(ABCMusicParser.VoiceContext ctx) {
    }

    @Override
    // TODO: handle repeats and alternate endings
    public void exitVoice(ABCMusicParser.VoiceContext ctx) {
        List<ChordSequence> chords = new ArrayList<ChordSequence>();
        List<ChordSequence> repeatMeasures = new ArrayList<ChordSequence>();
        for (Object x : chordsAndBars) {
            if (x instanceof Chord) {
                chords.add((Chord) x);
                System.out.println(chords.size());
            } else if (x instanceof Tuplet) {
                chords.add((Tuplet) x);
            } else {
                if (x instanceof String) {
                    if (x.equals("|")) {
                        Measure m = new Measure(chords);
                        measures.add(m);
                        chords.clear();
                    } else if (x.equals("|:")) {

                    }
                }
            }
        }

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
        Fraction duration = notes.get(0).duration;
        Chord chord = new Chord(duration, notes);
        if (inTuplet) {
            tupletList.add(chord);
        } else {
            chordsAndBars.add(chord);
        }
        notes.clear();
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
        // TODO: Add support for octaves
        Note n;
        String note;
        Pitch p;
        Fraction duration;
        if (ctx.fraction() != null) {

            int numerator;
            int denom;
            if (ctx.fraction().children.size() == 3) {
                numerator = Integer.parseInt(ctx.fraction().getChild(0).getText());
                denom = Integer.parseInt(ctx.fraction().getChild(2).getText());
                duration = new Fraction(numerator, denom);
            } else if (ctx.fraction().children.size() == 2) {
                numerator = 1;
                denom = Integer.parseInt(ctx.fraction().getChild(1).getText());
                duration = new Fraction(numerator, denom);
            } else {
                duration = null;
            }
        }

        else {
            duration = new Fraction(1, 1);
        }
        if (ctx.pitch() != null) {
            note = ctx.pitch().BASE().getText();
            System.out.println(note);
            if (Character.isLowerCase(note.charAt(0))) {
                p = new Pitch(Character.toUpperCase(note.charAt(0)));
                p = p.octaveTranspose(1);

            } else {
                p = new Pitch(note.charAt(0));
            }
            // Add in octaves.

            if (ctx.pitch().OCTAVE() != null) {
                String octave = ctx.pitch().OCTAVE().getText();
                int length = octave.length();
                if (octave.charAt(0) == '\'') {
                    p = p.octaveTranspose(length);
                }
                if (octave.charAt(0) == ',') {
                    p = p.octaveTranspose(-length);
                }
            }

            // Add in accidental.
            Accidental a = new Accidental(AccidentalType.NONE, 0);
            if (ctx.pitch().accidental() != null) {
                if (ctx.pitch().accidental().getText().equals("^")) {
                    a = new Accidental(AccidentalType.SHARP, 1);
                } else if (ctx.pitch().accidental().getText().equals("^^")) {
                    a = new Accidental(AccidentalType.SHARP, 2);
                } else if (ctx.pitch().accidental().getText().equals("_")) {
                    a = new Accidental(AccidentalType.SHARP, -1);
                } else if (ctx.pitch().accidental().getText().equals("__")) {
                    a = new Accidental(AccidentalType.SHARP, -2);
                }

                else if (ctx.pitch().accidental().getText().equals("=")) {
                    a = new Accidental(AccidentalType.NONE, 0);
                } else {
                    a = new Accidental(AccidentalType.NONE, 0);
                }
            }
            n = new Note(p, duration, a);
            notes.add(n);

        } else {
            note = ctx.REST().getText();
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
        String meterString = ctx.fraction().getText();

        int numerator = Character.getNumericValue(meterString.charAt(0));
        int denom = Character.getNumericValue(meterString.charAt(2));

        meter = new Fraction(numerator, denom);
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