package tests;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import java.util.Arrays;

import music.Chord;

import org.junit.Test;

/**
 * Input space includes notes with sharps, flats, unapplied accidentals, various
 * lengths and repeated notes in a chord. Also includes chord lists of a single
 * element, multiple elements or no elements.
 *
 */
public class ChordTest {

    public static final Chord chordA = new Chord(NoteTest.halfNoteASharp.duration, NoteTest.halfNoteASharp,
            NoteTest.quarterNoteBFlatUnappliedFlat, NoteTest.quarterNoteBFlat);
    public static final Chord chordB = new Chord(NoteTest.quarterNoteBFlat.duration, NoteTest.quarterNoteBFlat,
            NoteTest.halfNoteASharpUnappliedNone, NoteTest.halfNoteASharp);
    public static final Chord quarterRest = new Chord(FractionTest.oneFourth);
    public static final Chord highCNoteChord = new Chord(NoteTest.wholeNoteHighC.duration, NoteTest.wholeNoteHighC);

    /**
     * Tests that getChords is the same as a list of only that chord.
     */
    @Test
    public void testGetChords() {
        assertEquals(Arrays.asList(chordA), chordA.getChords());
        assertEquals(Arrays.asList(chordB), chordB.getChords());
        assertEquals(Arrays.asList(quarterRest), quarterRest.getChords());
        assertEquals(Arrays.asList(highCNoteChord), highCNoteChord.getChords());
    }

    /**
     * Test that the multiply method accurately multiplies the duration of the
     * chord and its children notes. Because multiply is only used for tuplets
     * only numerators and denominators from 1 to 10 are guaranteed to provide
     * valid output. Tests chords with single element, multiple elements, no
     * elements.
     */
    @Test
    public void testMultiply() {
        assertEquals(new Chord(NoteTest.halfNoteASharp.duration, NoteTest.halfNoteASharp,
                NoteTest.quarterNoteBFlatUnappliedFlat, NoteTest.quarterNoteBFlat), chordA.multiply(1, 1));

        assertEquals(new Chord(FractionTest.oneFourth.multiply(10, 1)), quarterRest.multiply(10, 1));

        assertEquals(
                new Chord(NoteTest.wholeNoteHighC.duration.multiply(1, 10), NoteTest.wholeNoteHighC.multiply(1, 10)),
                highCNoteChord.multiply(1, 10));

    }
}
