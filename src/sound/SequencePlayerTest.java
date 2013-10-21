package sound;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

public class SequencePlayerTest {
    // @Test
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

            // Measure 1
            player.addNote(new Pitch('C').toMidiNote(), 0, 12);
            player.addNote(new Pitch('C').toMidiNote(), 12, 12);
            player.addNote(new Pitch('C').toMidiNote(), 24, 9);
            player.addNote(new Pitch('D').toMidiNote(), 33, 3);
            player.addNote(new Pitch('E').toMidiNote(), 36, 12);

            // Measure 2
            player.addNote(new Pitch('E').toMidiNote(), 48, 9);
            player.addNote(new Pitch('D').toMidiNote(), 57, 3);
            player.addNote(new Pitch('E').toMidiNote(), 60, 9);
            player.addNote(new Pitch('F').toMidiNote(), 69, 3);
            player.addNote(new Pitch('G').toMidiNote(), 72, 24);

            // Measure 3
            player.addNote(new Pitch('C').octaveTranspose(1).toMidiNote(), 96,
                    4);
            player.addNote(new Pitch('C').octaveTranspose(1).toMidiNote(), 100,
                    4);
            player.addNote(new Pitch('C').octaveTranspose(1).toMidiNote(), 104,
                    4);
            player.addNote(new Pitch('G').toMidiNote(), 108, 4);
            player.addNote(new Pitch('G').toMidiNote(), 112, 4);
            player.addNote(new Pitch('G').toMidiNote(), 116, 4);
            player.addNote(new Pitch('E').toMidiNote(), 120, 4);
            player.addNote(new Pitch('E').toMidiNote(), 124, 4);
            player.addNote(new Pitch('E').toMidiNote(), 128, 4);
            player.addNote(new Pitch('C').toMidiNote(), 132, 4);
            player.addNote(new Pitch('C').toMidiNote(), 136, 4);
            player.addNote(new Pitch('C').toMidiNote(), 140, 4);

            // Measure 4
            player.addNote(new Pitch('G').toMidiNote(), 144, 9);
            player.addNote(new Pitch('F').toMidiNote(), 153, 3);
            player.addNote(new Pitch('E').toMidiNote(), 156, 9);
            player.addNote(new Pitch('D').toMidiNote(), 165, 3);
            player.addNote(new Pitch('C').toMidiNote(), 168, 24);

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

    @Test
    public void testPiece2() {

        SequencePlayer player;
        try {
            LyricListener listener = new LyricListener() {
                public void processLyricEvent(String text) {
                    // do nothing
                }
            };

            // each beat is a 1/4 note
            player = new SequencePlayer(200, 12, listener);

            // Measure 1
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 0, 6);
            player.addNote(new Pitch('E').octaveTranspose(1).toMidiNote(), 0, 6);

            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 6, 6);
            player.addNote(new Pitch('E').octaveTranspose(1).toMidiNote(), 6, 6);

            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 18, 6);
            player.addNote(new Pitch('E').octaveTranspose(1).toMidiNote(), 18,
                    6);

            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 30, 6);
            player.addNote(new Pitch('C').octaveTranspose(1).toMidiNote(), 30,
                    6);

            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 36, 12);
            player.addNote(new Pitch('E').octaveTranspose(1).toMidiNote(), 36,
                    12);

            // Measure 2
            player.addNote(new Pitch('G').toMidiNote(), 48, 12);
            player.addNote(new Pitch('B').toMidiNote(), 48, 12);
            player.addNote(new Pitch('G').octaveTranspose(1).toMidiNote(), 48,
                    12);

            // rest
            player.addNote(new Pitch('G').toMidiNote(), 72, 12);
            // rest

            // Measure 3
            player.addNote(new Pitch('C').octaveTranspose(1).toMidiNote(), 84,
                    18);
            player.addNote(new Pitch('G').toMidiNote(), 102, 6);

            // rest
            player.addNote(new Pitch('E').toMidiNote(), 108, 12);

            // Measure 4
            player.addNote(new Pitch('E').toMidiNote(), 120, 6);
            player.addNote(new Pitch('A').octaveTranspose(1).toMidiNote(), 84,
                    18);

            player.play();

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }

    }
}
