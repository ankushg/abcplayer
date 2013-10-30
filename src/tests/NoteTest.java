package tests;

import static org.junit.Assert.assertEquals;
import music.Note;

import org.junit.Test;

/**
 * Tests notes of varying lengths, tests notes with both sharps and flats, and
 * tests notes with unapplied accidentals.
 *
 */
public class NoteTest {

    public static final Note quarterNoteBFlat = new Note(PitchTest.bFlat, FractionTest.oneFourth);
    public static final Note wholeNoteHighC = new Note(PitchTest.highC, FractionTest.unitFraction);
    public static final Note halfNoteASharp = new Note(PitchTest.aSharp, FractionTest.oneHalf);

    public static final Note quarterNoteBFlatUnappliedFlat = new Note(PitchTest.bFlat, FractionTest.oneFourth,
            AccidentalTest.oneFlat);
    public static final Note wholeNoteHighCUnappliedSharp = new Note(PitchTest.highC, FractionTest.unitFraction,
            AccidentalTest.oneSharp);
    public static final Note halfNoteASharpUnappliedNone = new Note(PitchTest.aSharp, FractionTest.oneHalf,
            AccidentalTest.noAcc);

    @Test
    public void testGetLetter() {
        // TODO test note getletter
    }

    /**
     * Multiplies by fractions with num>denom, num=denom, num<denom.
     */
    @Test
    public void testMultiply() {
        // TODO test note multiply
        assertEquals(new Note(PitchTest.highC, FractionTest.unitFraction), wholeNoteHighC.multiply(1, 1));
        assertEquals(new Note(PitchTest.aSharp, FractionTest.oneHalf.multiply(2, 5)), halfNoteASharp.multiply(2, 5));
        assertEquals(new Note(PitchTest.bFlat, FractionTest.oneFourth.multiply(5, 2)), quarterNoteBFlat.multiply(5, 2));
    }

    @Test
    public void testToString() {
        // TODO test note toString
    }

    @Test
    public void testHashCode() {
        // TODO test note hashcode
    }

    @Test
    public void testEqual() {
        // TODO test note equal
    }
}
