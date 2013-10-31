package tests;

import static org.junit.Assert.assertEquals;
import music.Fraction;
import music.Note;

import org.junit.Test;

import sound.Pitch;

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
        assertEquals(new Note(PitchTest.highC, FractionTest.unitFraction), wholeNoteHighC.multiply(1, 1));
        assertEquals(new Note(PitchTest.aSharp, FractionTest.oneHalf.multiply(2, 5)), halfNoteASharp.multiply(2, 5));
        assertEquals(new Note(PitchTest.bFlat, FractionTest.oneFourth.multiply(5, 2)), quarterNoteBFlat.multiply(5, 2));
    }

    /**
     * Tests that equal objects have the same hashcodes
     */
    @Test
    public void testHashCode() {
        Note n1 = new Note(new Pitch('B').accidentalTranspose(-1), new Fraction(1, 4));
        Note n2 = new Note(PitchTest.highC, FractionTest.unitFraction);
        assertEquals(true, halfNoteASharp.hashCode() == halfNoteASharpUnappliedNone.hashCode());
        assertEquals(true, quarterNoteBFlat.hashCode() == n1.hashCode());
        assertEquals(true, wholeNoteHighC.hashCode() == n2.hashCode());
    }

    /**
     * Tests for equality with notes with both sharps and flats, and tests notes
     * with unapplied accidentals.
     */
    @Test
    public void testEqual() {
        Note n1 = new Note(new Pitch('B').accidentalTranspose(-1), new Fraction(1, 4));
        Note n2 = new Note(PitchTest.highC, FractionTest.unitFraction);
        assertEquals(true, halfNoteASharp.equals(halfNoteASharpUnappliedNone));
        assertEquals(true, quarterNoteBFlat.equals(n1));
        assertEquals(true, wholeNoteHighC.equals(n2));

        assertEquals(false, quarterNoteBFlat.equals(n2));
        assertEquals(false, halfNoteASharp.equals(n1));
        assertEquals(false, wholeNoteHighC.equals(halfNoteASharp));

    }
}
