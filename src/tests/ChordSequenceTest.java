package tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

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
import music.ReadyToAddItem;
import music.Repeat;
import music.Tuplet;
import music.Utilities;
import music.Voice;

import org.junit.Ignore;
import org.junit.Test;

import sound.LyricListener;
import sound.Pitch;
import sound.SequencePlayer;

@Ignore("super long and annoying tests")
public class ChordSequenceTest {
    @Test
    public void testTuplet() {
        List<Chord> chords = new ArrayList<>();

        chords.add(new Chord(new Fraction(1, 2), new Note(new Pitch('C'), new Fraction(1, 2))));
        chords.add(new Chord(new Fraction(1, 2), new Note(new Pitch('C'), new Fraction(1, 2))));
        chords.add(new Chord(new Fraction(1, 2), new Note(new Pitch('C'), new Fraction(1, 2))));

        Tuplet t = new Tuplet(3, chords);

        List<ChordSequence> cs = new ArrayList<>();
        cs.add(t);
        cs.add(new Chord(new Fraction(1, 1), new Note(new Pitch('C'), new Fraction(1, 1))));

        cs.add(new Chord(new Fraction(1, 2), new Note(new Pitch('C'), new Fraction(1, 2))));
        cs.add(new Chord(new Fraction(1, 2), new Note(new Pitch('C'), new Fraction(1, 2))));
        cs.add(new Chord(new Fraction(1, 2), new Note(new Pitch('C'), new Fraction(1, 2))));

        List<Chord> finalChords = new ChordSequenceList(cs).getChords();
        List<Fraction> durations = new ArrayList<>();
        for (Chord c : finalChords) {
            durations.add(c.duration);
        }
        Fraction[] actualDurations = durations.toArray(new Fraction[0]);
        Fraction[] expectedDurations = { new Fraction(1, 3), new Fraction(1, 3), new Fraction(1, 3),
                new Fraction(1, 1), new Fraction(1, 2), new Fraction(1, 2), new Fraction(1, 2) };
        assertArrayEquals(expectedDurations, actualDurations);
    }

    @Test
    public void testDatatype() {
        SequencePlayer player;
        try {
            LyricListener listener = new LyricListener() {
                @Override
                public void processLyricEvent(String text) {
                    // do nothing
                }
            };

            List<Chord> chords = new ArrayList<>();
            chords.add(new Chord(new Fraction(1, 4), new Note(new Pitch('C'), new Fraction(1, 4))));
            chords.add(new Chord(new Fraction(1, 1), new Note(new Pitch('F'), new Fraction(1, 1))));
            chords.add(new Chord(new Fraction(1, 1), new Note(new Pitch('A'), new Fraction(2, 1))));
            Tuplet tuplet = new Tuplet(3, new Chord(new Fraction(1, 4), new Note(new Pitch('C'), new Fraction(1, 4))),
                    new Chord(new Fraction(1, 1), new Note(new Pitch('F'), new Fraction(1, 1))), new Chord(
                            new Fraction(1, 1), new Note(new Pitch('A'), new Fraction(2, 1))));
            List<ChordSequence> cs = new ArrayList<>();
            cs.addAll(chords);
            cs.add(tuplet);
            cs.add(new Chord(new Fraction(4, 1))); // this is how you do a rest
            cs.addAll(chords);

            // repeat with alternate endings (a high note and a low note)
            ChordSequence chordSequence = new Repeat(new ChordSequenceList(cs), new Chord(new Fraction(6, 1), new Note(
                    new Pitch('D').octaveTranspose(1), new Fraction(6, 1))), new Chord(new Fraction(6, 1), new Note(
                    new Pitch('D').octaveTranspose(-1), new Fraction(6, 1))));

            List<Chord> finalChords = chordSequence.getChords();
            int ticksPerBeat = Utilities.computeTicksPerBeat(finalChords);
            List<ReadyToAddItem> items = Utilities.getReadyToAddItems(finalChords);

            player = new SequencePlayer(140, ticksPerBeat, listener);
            for (ReadyToAddItem item : items) {
                item.addTo(player);
            }

            System.out.println(player);

            // play!
            player.play();

            /*
             * Note: A possible weird behavior of the Java sequencer: Even if
             * the sequencer has finished playing all of the scheduled notes and
             * is manually closed, the program may not terminate. This is likely
             * due to daemon threads that are spawned when the sequencer is
             * opened but keep on running even after the sequencer is killed. In
             * this case, you need to explicitly exit the program with
             * System.exit(0).
             */
            // System.exit(0);
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    // Tests to see if an accidental is carried through the rest of a measure.
    // Test case currently fails.
    @Test
    public void testAccidental() {
        SequencePlayer player;
        try {
            LyricListener listener = new LyricListener() {
                @Override
                public void processLyricEvent(String text) {
                    // do nothing
                }
            };

            List<Chord> chords = new ArrayList<>();
            chords.add(new Chord(new Fraction(2, 1), new Note(new Pitch('C'), new Fraction(2, 1))));
            chords.add(new Chord(new Fraction(2, 1), new Note(new Pitch('C'), new Fraction(2, 1), new Accidental(
                    AccidentalType.SHARP, 1))));
            chords.add(new Chord(new Fraction(2, 1), new Note(new Pitch('C'), new Fraction(2, 1))));
            List<ChordSequence> cs = new ArrayList<>();
            cs.addAll(chords);

            List<Chord> finalChords = new Measure(cs).getChords();
            int ticksPerBeat = Utilities.computeTicksPerBeat(finalChords);
            List<ReadyToAddItem> items = Utilities.getReadyToAddItems(finalChords);

            player = new SequencePlayer(140, ticksPerBeat, listener);
            for (ReadyToAddItem item : items) {
                item.addTo(player);
            }

            assertEquals(
                    "Event: NOTE_ON  Pitch: 60  Tick: 0\n***** End of track *****   Tick: 0\nEvent: NOTE_OFF Pitch: 60  Tick: 2\nEvent: NOTE_ON  Pitch: 61  Tick: 2\n***** End of track *****   Tick: 2\nEvent: NOTE_OFF Pitch: 61  Tick: 4\nEvent: NOTE_ON  Pitch: 61  Tick: 4\n***** End of track *****   Tick: 4\nEvent: NOTE_OFF Pitch: 61  Tick: 6\n***** End of track *****   Tick: 6\n",
                    player.toString());

            System.out.println(player);
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testKeySig() {
        SequencePlayer player;
        try {
            LyricListener listener = new LyricListener() {
                @Override
                public void processLyricEvent(String text) {
                    // do nothing
                }
            };

            List<ChordSequence> noKeyCS = new ArrayList<>();
            noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D'), new Fraction(2, 1))));
            noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E'), new Fraction(2, 1))));
            noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F'), new Fraction(2, 1))));
            noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1))));
            noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('A'), new Fraction(2, 1))));
            noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('B'), new Fraction(2, 1))));
            noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('C').octaveTranspose(1), new Fraction(2, 1))));
            noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D').octaveTranspose(1), new Fraction(2, 1))));

            List<ChordSequence> cs = new ArrayList<>();
            cs.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D'), new Fraction(2, 1))));
            cs.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E'), new Fraction(2, 1))));
            cs.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F'), new Fraction(2, 1))));
            cs.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1))));
            cs.add(new Chord(new Fraction(2, 1), new Note(new Pitch('A'), new Fraction(2, 1))));
            cs.add(new Chord(new Fraction(2, 1), new Note(new Pitch('B'), new Fraction(2, 1))));
            cs.add(new Chord(new Fraction(2, 1), new Note(new Pitch('C').octaveTranspose(1), new Fraction(2, 1))));
            cs.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D').octaveTranspose(1), new Fraction(2, 1))));

            List<ChordSequence> measures = new ArrayList<>();
            measures.add(new Measure(noKeyCS));
            measures.add(new Measure(new KeySignature(KeyType.D), cs));
            List<Chord> finalChords = new Voice(measures).getChords();

            int ticksPerBeat = Utilities.computeTicksPerBeat(finalChords);
            List<ReadyToAddItem> items = Utilities.getReadyToAddItems(finalChords);

            player = new SequencePlayer(140, ticksPerBeat, listener);
            for (ReadyToAddItem item : items) {
                item.addTo(player);
            }

            System.out.println(player);

            // play!
            player.play();

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}
