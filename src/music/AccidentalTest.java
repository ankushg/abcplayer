package music;

import static org.junit.Assert.*;

import org.junit.Test;

import sound.Pitch;

//TODO: figure out accidentaltranspose vs accidental
public class AccidentalTest {

    /**
     * Naturals only change the pitch of a note when the note is already altered
     * by a key signature or an accidental earlier in a measure. Because of
     * this, we will be testing the ability to make a note a nat
     */
    @Test
    public void testApply() {
        Accidental noAcc = Accidental.NONE;
        Accidental oneSharp = new Accidental(AccidentalType.SHARP, 1);
        Accidental oneFlat = new Accidental(AccidentalType.SHARP, -1);
        Accidental natural = new Accidental(AccidentalType.NATURAL, 0);
        Note n = new Note(new Pitch('C'), new Fraction(1, 2));

        assertEquals(n, noAcc.apply(n));
        assertEquals(new Note(new Pitch('C').transpose(1), new Fraction(1, 2)), oneSharp.apply(n));
        assertEquals(new Note(new Pitch('C').transpose(-1), new Fraction(1, 2)), oneFlat.apply(n));
        assertEquals(new Note(new Pitch('C').transpose(0), new Fraction(1, 2)), natural.apply(n));

    }

}
