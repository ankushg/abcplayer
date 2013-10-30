package tests;

import sound.Pitch;

/**
 * Doesn't actually test anything; we didn't modify Pitch. Instead, this
 * contains constants used by other tests.
 *
 */
public class PitchTest {

    public static Pitch middleC = new Pitch('C');
    public static Pitch highC = new Pitch('C').octaveTranspose(1);
    public static Pitch lowG = new Pitch('G').octaveTranspose(-1);
    public static Pitch aSharp = new Pitch('A').accidentalTranspose(1);
    public static Pitch bFlat = new Pitch('B').accidentalTranspose(-1);

    public static Pitch highAFlat = new Pitch('A').octaveTranspose(1).accidentalTranspose(-1);

}
