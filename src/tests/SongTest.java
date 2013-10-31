package tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import music.Chord;
import music.ChordSequence;
import music.Fraction;
import music.KeySignature;
import music.KeyType;
import music.Measure;
import music.Note;
import music.Repeat;
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

    /**
     * Basic getPlayer() test testing a measure with length greater than 1 and
     * only one voice.
     **/
    @Test
    public void testGetPlayer() {

        Chord c1 = new Chord(new Fraction(2, 1), new Note(new Pitch('D').octaveTranspose(1), new Fraction(2, 1)));
        Chord c2 = new Chord(new Fraction(2, 1), new Note(new Pitch('D').octaveTranspose(2), new Fraction(2, 1)));

        Measure m = new Measure(c1, c2);
        Voice v = new Voice(m);

        Song s = new Song(v);

        String expected = "Event: NOTE_ON  Pitch: 74  Tick: 0\n***** End of track *****   Tick: 0\nEvent: NOTE_OFF Pitch: 74  Tick: 2\nEvent: NOTE_ON  Pitch: 86  Tick: 2\n***** End of track *****   Tick: 2\nEvent: NOTE_OFF Pitch: 86  Tick: 4\n***** End of track *****   Tick: 4\n";
        try {
            System.out.println(s.getPlayer());
            assertEquals(expected, s.getPlayer().toString());

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    /**
     * Tests the input partitions of Chords, Rests, and Tuplets in 1 voice.
     */

    @Test
    public void testGetPlayer2() {

        // Creates first voice with Chords and Tuplets and Rests.
        Chord c1 = new Chord(FractionTest.oneFourth, new Note(PitchTest.middleC, FractionTest.oneFourth), new Note(
                PitchTest.lowG, FractionTest.oneFourth));
        Chord c2 = new Chord(FractionTest.oneHalf, new Note(PitchTest.middleC, FractionTest.oneHalf), new Note(
                PitchTest.highC, FractionTest.oneFourth));
        Chord c3 = new Chord(FractionTest.oneFourth, new Note(PitchTest.highC, FractionTest.oneFourth), new Note(
                PitchTest.lowG, FractionTest.oneFourth));

        Measure m1 = new Measure(c1, c2);
        Measure m2 = new Measure(c3, ZeroNotes, TupletTest.highCTriplet);
        Voice v1 = new Voice(m1, m2);

        Song s = new Song(v1);

        String expected = "Event: NOTE_ON  Pitch: 60  Tick: 0\nEvent: NOTE_ON  Pitch: 55  Tick: 0\n***** End of track *****   Tick: 0\nEvent: NOTE_OFF Pitch: 60  Tick: 3\nEvent: NOTE_OFF Pitch: 55  Tick: 3\nEvent: NOTE_ON  Pitch: 60  Tick: 3\nEvent: NOTE_ON  Pitch: 72  Tick: 3\n***** End of track *****   Tick: 3\nEvent: NOTE_OFF Pitch: 72  Tick: 6\nEvent: NOTE_OFF Pitch: 60  Tick: 9\nEvent: NOTE_ON  Pitch: 72  Tick: 9\nEvent: NOTE_ON  Pitch: 55  Tick: 9\n***** End of track *****   Tick: 9\nEvent: NOTE_OFF Pitch: 72  Tick: 12\nEvent: NOTE_OFF Pitch: 55  Tick: 12\n***** End of track *****   Tick: 12\nEvent: NOTE_ON  Pitch: 72  Tick: 18\n***** End of track *****   Tick: 18\nEvent: NOTE_OFF Pitch: 72  Tick: 26\nEvent: NOTE_ON  Pitch: 72  Tick: 26\n***** End of track *****   Tick: 26\nEvent: NOTE_OFF Pitch: 72  Tick: 34\nEvent: NOTE_ON  Pitch: 72  Tick: 34\n***** End of track *****   Tick: 34\nEvent: NOTE_OFF Pitch: 72  Tick: 42\n***** End of track *****   Tick: 42\n";

        try {
            assertEquals(expected, s.getPlayer().toString());
        } catch (MidiUnavailableException | InvalidMidiDataException e1) {
            e1.printStackTrace();
        }

    }

    /**
     * Tests the input partitions of repeats with a first ending, multiple
     * voices, and a key signature.
     */
    @Test
    public void testGetPlayerForRepeatsAndMultipleVoices() {
        Chord c1 = new Chord(FractionTest.oneFourth, new Note(PitchTest.middleC, FractionTest.oneFourth), new Note(
                PitchTest.lowG, FractionTest.oneFourth));

        Measure m1 = new Measure(c1);

        List<ChordSequence> noKeyCS = new ArrayList<>();
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1))));

        Measure m2 = new Measure(new KeySignature(KeyType.D), noKeyCS);

        List<ChordSequence> firstEnding = new ArrayList<ChordSequence>();
        firstEnding.add(m2);
        Repeat r1 = new Repeat(m1, firstEnding);
        Voice v1 = new Voice(r1);

        Chord c3 = new Chord(new Fraction(2, 1), new Note(new Pitch('D').octaveTranspose(1), new Fraction(2, 1)));
        Chord c4 = new Chord(new Fraction(2, 1), new Note(new Pitch('D').octaveTranspose(2), new Fraction(2, 1)));

        Measure m = new Measure(c3, c4);
        Voice v2 = new Voice(m);

        Song s = new Song(v1, v2);

        String expected = "Event: NOTE_ON  Pitch: 55  Tick: 0\n***** End of track *****   Tick: 0\nEvent: NOTE_ON  Pitch: 74  Tick: 0\n***** End of track *****   Tick: 0\nEvent: NOTE_OFF Pitch: 60  Tick: 1\nEvent: NOTE_OFF Pitch: 55  Tick: 1\nEvent: NOTE_ON  Pitch: 66  Tick: 1\n***** End of track *****   Tick: 1\nEvent: NOTE_OFF Pitch: 74  Tick: 8\nEvent: NOTE_ON  Pitch: 86  Tick: 8\n***** End of track *****   Tick: 8\nEvent: NOTE_OFF Pitch: 66  Tick: 9\nEvent: NOTE_ON  Pitch: 67  Tick: 9\n***** End of track *****   Tick: 9\nEvent: NOTE_OFF Pitch: 86  Tick: 16\nEvent: NOTE_OFF Pitch: 67  Tick: 17\nEvent: NOTE_ON  Pitch: 60  Tick: 17\nEvent: NOTE_ON  Pitch: 55  Tick: 17\n***** End of track *****   Tick: 17\nEvent: NOTE_OFF Pitch: 60  Tick: 18\nEvent: NOTE_OFF Pitch: 55  Tick: 18\n***** End of track *****   Tick: 18\n";

        try {
            System.out.println(s.getPlayer().toString());
        } catch (MidiUnavailableException | InvalidMidiDataException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
