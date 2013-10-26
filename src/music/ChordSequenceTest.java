package music;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

import sound.LyricListener;
import sound.Pitch;
import sound.SequencePlayer;

public class ChordSequenceTest {
    @Test
    public void testDatatype() {
        SequencePlayer player;
        try {
            LyricListener listener = new LyricListener() {
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
}