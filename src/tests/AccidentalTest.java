package tests;

import static org.junit.Assert.*;

import music.Accidental;
import music.AccidentalType;
import music.Fraction;
import music.Note;

import org.junit.Test;

import sound.Pitch;

/**
 * Contains test cases for the Accidental class. Tests Accidentals of type NONE,
 * SHARP and NATURAL with positive, negative and zero values.
 *
 */
public class AccidentalTest {

    public static Accidental noAcc = Accidental.NONE;
    public static Accidental oneSharp = new Accidental(AccidentalType.SHARP, 1);
    public static Accidental oneFlat = new Accidental(AccidentalType.SHARP, -1);
    public static Accidental natural = new Accidental(AccidentalType.NATURAL, 0);

    /**
     * Naturals only change the pitch of a note when the note is already altered
     * by a key signature or an accidental earlier in a measure. Because of
     * this, we will be testing the ability to make a note a nat
     */
    @Test
    public void testApply() {
        Note n = new Note(new Pitch('C'), new Fraction(1, 2));

        assertEquals(n, noAcc.apply(n));
        assertEquals(new Note(new Pitch('C').transpose(1), new Fraction(1, 2)), oneSharp.apply(n));
        assertEquals(new Note(new Pitch('C').transpose(-1), new Fraction(1, 2)), oneFlat.apply(n));
        assertEquals(new Note(new Pitch('C').transpose(0), new Fraction(1, 2)), natural.apply(n));

    }

}
