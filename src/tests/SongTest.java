package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import music.Chord;
import music.Fraction;
import music.Measure;
import music.Note;
import music.Song;
import music.Voice;

import org.junit.Test;

import sound.Pitch;

public class SongTest {

    /**
     * Tests the Song class. Songs can contain Voices and combinations of
     * everything they can contain. They have varying tempos and
     * default_length_notes as well.
     */

    public static Measure ZeroNotes = new Measure(new Chord(new Fraction(1, 2), new ArrayList<Note>()));

    @Test
    public void testHashCode() {
        fail("Not yet implemented"); // TODO test song hashcode
    }

    @Test
    public void testGetPlayer() {

        Chord c1 = new Chord(new Fraction(2, 1), new Note(new Pitch('D').octaveTranspose(1), new Fraction(2, 1)));
        Chord c2 = new Chord(new Fraction(2, 1), new Note(new Pitch('D').octaveTranspose(2), new Fraction(2, 1)));

        Measure m = new Measure(c1, c2);
        Voice v = new Voice(m);

        Song s = new Song(v);

        String expected = "Event: NOTE_ON  Pitch: 74  Tick: 0\n***** End of track *****   Tick: 0\nEvent: NOTE_OFF Pitch: 74  Tick: 2\nEvent: NOTE_ON  Pitch: 86  Tick: 2\n***** End of track *****   Tick: 2\nEvent: NOTE_OFF Pitch: 86  Tick: 4\n***** End of track *****   Tick: 4";

        try {
            System.out.println(s.getPlayer());
        } catch (MidiUnavailableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            assertEquals(expected, s.getPlayer().toString());
        } catch (MidiUnavailableException | InvalidMidiDataException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    @Test
    public void testEqualsObject() {
        fail("Not yet implemented"); // TODO test song equals
    }

}
