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
            player.addNote(new Pitch('A').toMidiNote(), 126, 12);
            player.addNote(new Pitch('B').toMidiNote(), 138, 12);
            player.addNote(new Pitch('B').transpose(-1).toMidiNote(), 150, 6);
            player.addNote(new Pitch('A').toMidiNote(), 156, 12);

            // Measure 5
            player.addNote(new Pitch('G').toMidiNote(), 168, 8);
            player.addNote(new Pitch('E').octaveTranspose(1).toMidiNote(), 176,
                    8);
            player.addNote(new Pitch('G').octaveTranspose(1).toMidiNote(), 184,
                    8);
            player.addNote(new Pitch('A').octaveTranspose(1).toMidiNote(), 192,
                    12);
            player.addNote(new Pitch('F').octaveTranspose(1).toMidiNote(), 204,
                    6);
            player.addNote(new Pitch('G').octaveTranspose(1).toMidiNote(), 210,
                    6);

            // Measure 6
            // rest
            player.addNote(new Pitch('E').octaveTranspose(1).toMidiNote(), 222,
                    12);
            player.addNote(new Pitch('C').octaveTranspose(1).toMidiNote(), 234,
                    6);
            player.addNote(new Pitch('D').octaveTranspose(1).toMidiNote(), 240,
                    6);
            player.addNote(new Pitch('B').toMidiNote(), 246, 18);

            player.play();

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testPiece3() {
        SequencePlayer player;
        try {
            LyricListener listener = new LyricListener() {
                public void processLyricEvent(String text) {
                    System.out.println(text);
                }
            };

            // each beat is a 1/4 note
            player = new SequencePlayer(100, 12, listener);

            // Measure 1
            // rest
            player.addNote(new Pitch('D').toMidiNote(), 24, 12);
            player.addLyricEvent("A - ", 24);

            // Measure 2
            player.addNote(new Pitch('G').toMidiNote(), 36, 24);
            player.addLyricEvent("ma - ", 36);
            player.addNote(new Pitch('B').toMidiNote(), 60, 6);
            player.addLyricEvent("zing ", 60);
            player.addNote(new Pitch('G').toMidiNote(), 66, 6);

            // Measure 3
            player.addNote(new Pitch('B').toMidiNote(), 72, 24);
            player.addLyricEvent("grace!", 72);
            player.addNote(new Pitch('A').toMidiNote(), 96, 12);
            player.addLyricEvent("How", 96);

            // Measure 4
            player.addNote(new Pitch('G').toMidiNote(), 108, 24);
            player.addLyricEvent("sweet ", 108);
            player.addNote(new Pitch('E').toMidiNote(), 132, 12);
            player.addLyricEvent("the", 132);

            // Measure 5
            player.addNote(new Pitch('D').toMidiNote(), 144, 24);
            player.addLyricEvent("sound", 144);
            player.addNote(new Pitch('D').toMidiNote(), 168, 12);
            player.addLyricEvent("That", 168);

            // Measure 6
            player.addNote(new Pitch('G').toMidiNote(), 180, 24);
            player.addLyricEvent("saved", 180);
            player.addNote(new Pitch('B').toMidiNote(), 204, 6);
            player.addLyricEvent("a", 204);
            player.addNote(new Pitch('G').toMidiNote(), 210, 6);

            // Measure 7
            player.addNote(new Pitch('B').toMidiNote(), 216, 24);
            player.addLyricEvent("wretch", 216);
            player.addNote(new Pitch('A').toMidiNote(), 240, 12);
            player.addLyricEvent("like", 240);

            // Measure 8
            player.addNote(new Pitch('D').octaveTranspose(1).toMidiNote(), 252,
                    36);
            player.addLyricEvent("me.", 252);
            // Measure 9
            player.addNote(new Pitch('D').octaveTranspose(1).toMidiNote(), 288,
                    12);
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
