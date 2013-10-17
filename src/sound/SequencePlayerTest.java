package sound;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

public class SequencePlayerTest {
    @Test
    public void testPiece1() {
        SequencePlayer player;
        try {
            LyricListener listener = new LyricListener() {
                public void processLyricEvent(String text) {
                    // do nothing
                }
            };

            // each beat is a 1/4 note
            player = new SequencePlayer(140, 12, listener);

            player.addNote(new Pitch('C').toMidiNote(), 0, 12);
            player.addNote(new Pitch('C').toMidiNote(), 12, 12);
            player.addNote(new Pitch('C').toMidiNote(), 24, 9);
            player.addNote(new Pitch('D').toMidiNote(), 33, 4);
            player.addNote(new Pitch('E').toMidiNote(), 36, 12);

            player.addNote(new Pitch('E').toMidiNote(), 48, 9);
            player.addNote(new Pitch('D').toMidiNote(), 57, 3);
            player.addNote(new Pitch('E').toMidiNote(), 60, 9);
            player.addNote(new Pitch('F').toMidiNote(), 69, 3);
            player.addNote(new Pitch('G').toMidiNote(), 72, 24);

            // TODO this isn't the whole piece

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
