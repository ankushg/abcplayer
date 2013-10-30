package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import music.Tuplet;

import org.junit.Test;

/**
 * Testing tuplets with three of same type and same length (all single-note
 * chords), four mixed types (single/multi notes, rests), and two mixed types
 * (rests, multi-note chord). Input space paritioned into Dup/Trip/Quadruplets,
 * and components of them.
 */
public class TupletTest {
    public final static Tuplet highCTriplet = new Tuplet(3, ChordTest.highCNoteChord, ChordTest.highCNoteChord,
            ChordTest.highCNoteChord);
    public final static Tuplet mixedDuplet = new Tuplet(2, ChordTest.quarterRest, ChordTest.chordA);
    public final static Tuplet mixedQuadruplet = new Tuplet(4, ChordTest.chordA, ChordTest.quarterRest,
            ChordTest.highCNoteChord, ChordTest.chordB);

    /**
     * Tests that getChords returns an appropriately scaled list of the original
     * chords (2/3 for triplets, 3/2 for duplets and 3/4 for quadruplets).
     * Splits input space as described for the entire class.
     */
    @Test
    public void testGetChords() {
        assertEquals(Arrays.asList(ChordTest.highCNoteChord.multiply(2, 3), ChordTest.highCNoteChord.multiply(2, 3),
                ChordTest.highCNoteChord.multiply(2, 3)), highCTriplet.getChords());
        assertEquals(Arrays.asList(ChordTest.quarterRest.multiply(3, 2), ChordTest.chordA.multiply(3, 2)),
                mixedDuplet.getChords());
        assertEquals(Arrays.asList(ChordTest.chordA.multiply(3, 4), ChordTest.quarterRest.multiply(3, 4),
                ChordTest.highCNoteChord.multiply(3, 4), ChordTest.chordB.multiply(3, 4)), mixedQuadruplet.getChords());
    }

    // TODO test tuplet tostring
    @Test
    public void testToString() {
    }
}
