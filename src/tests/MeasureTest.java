package tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import music.Accidental;
import music.AccidentalType;
import music.Chord;
import music.ChordSequence;
import music.Fraction;
import music.KeySignature;
import music.KeyType;
import music.Measure;
import music.Note;
import music.Syllable;

import org.junit.Test;

import sound.Pitch;

/**
 * Tests the Measure class with a variety of inputs. Test partitions: Major keys
 * with flats, major keys with sharps, minor keys with flats, minor keys with
 * sharps, C Major (key with no flats or sharps).
 */
public class MeasureTest {

    Measure measure = new Measure();

    public static final Measure measureWithKeySig = new Measure(new KeySignature(KeyType.D), new Chord(new Fraction(2,
            1), new Note(new Pitch('D'), new Fraction(2, 1))), new Chord(new Fraction(2, 1), new Note(new Pitch('E'),
            new Fraction(2, 1))), new Chord(new Fraction(2, 1), new Note(new Pitch('F'), new Fraction(2, 1))),
            new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1))), new Chord(new Fraction(2, 1),
                    new Note(new Pitch('A'), new Fraction(2, 1))), new Chord(new Fraction(2, 1), new Note(
                    new Pitch('B'), new Fraction(2, 1))), new Chord(new Fraction(2, 1), new Note(
                    new Pitch('C').octaveTranspose(1), new Fraction(2, 1))), new Chord(new Fraction(2, 1), new Note(
                    new Pitch('D').octaveTranspose(1), new Fraction(2, 1))));

    /**
     * Tests hash codes for equal and unequal Measure objects that just contain
     * Chords and Tuples.
     */
    @Test
    public void testHashCode() {
        Chord c1 = new Chord(FractionTest.oneFourth, new Note(PitchTest.middleC, FractionTest.oneFourth), new Note(
                PitchTest.lowG, FractionTest.oneFourth));
        Chord c2 = new Chord(FractionTest.oneHalf, new Note(PitchTest.middleC, FractionTest.oneHalf), new Note(
                PitchTest.highC, FractionTest.oneFourth));
        Chord c3 = new Chord(FractionTest.oneFourth, new Note(PitchTest.highC, FractionTest.oneFourth), new Note(
                PitchTest.lowG, FractionTest.oneFourth));

        Measure m1 = new Measure(c1, c2, c3, TupletTest.highCTriplet);
        Measure m2 = new Measure(c1, c2, c3, TupletTest.highCTriplet);
        Measure m3 = new Measure(c1, c3, TupletTest.highCTriplet);

        assertEquals(true, m1.hashCode() == m2.hashCode());
        assertEquals(false, m1.hashCode() == m3.hashCode());
    }

    /**
     * Tests getChords() on a measure with Chords, Rests, and Tuplets. This
     * measure has no accidentals, key signature, or syllables.
     */
    @Test
    public void testGetChords() {

        Chord c1 = new Chord(FractionTest.oneFourth, new Note(PitchTest.middleC, FractionTest.oneFourth), new Note(
                PitchTest.lowG, FractionTest.oneFourth));
        Chord c2 = new Chord(FractionTest.oneHalf, new Note(PitchTest.middleC, FractionTest.oneHalf), new Note(
                PitchTest.highC, FractionTest.oneFourth));
        Chord c3 = new Chord(FractionTest.oneFourth, new Note(PitchTest.highC, FractionTest.oneFourth), new Note(
                PitchTest.lowG, FractionTest.oneFourth));
        Chord rest = new Chord(new Fraction(1, 2), new ArrayList<Note>());

        Measure m = new Measure(c1, c2, rest, c3, TupletTest.highCTriplet);

        List<Chord> expected = new ArrayList<Chord>();
        expected.add(c1);
        expected.add(c2);
        expected.add(rest);
        expected.add(c3);
        expected.addAll(TupletTest.highCTriplet.getChords());

        assertEquals(expected, m.getChords());

    }

    /**
     * Tests that a measure correctly applies a key signature on getChords().
     */
    @Test
    public void testGetChordsWithKeySig() {
        List<Chord> expected = new ArrayList<Chord>();
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F').transpose(1), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('A'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('B'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('C').octaveTranspose(1).transpose(1),
                new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D').octaveTranspose(1), new Fraction(2, 1))));

        assertEquals(expected, measureWithKeySig.getChords());
    }

    /**
     * Tests that a measure correctly applies accidentals with getChords().
     * Tests both single and double accidentals. Tests both single and double
     * octave transposes. Also tests that accidentals are not "doubly applied"
     * when specified in both a key signature and an accidental on the note. For
     * example, if there was an F# in E Major, it would remain as F# and not F
     * double sharp.
     **/
    @Test
    public void testGetChordsWithAccidentals() {
        List<ChordSequence> noKeyCS = new ArrayList<>();
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1), new Accidental(
                AccidentalType.SHARP, 2))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('A'), new Fraction(2, 1), AccidentalTest.oneFlat)));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('B'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('C').octaveTranspose(1).transpose(1),
                new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D').octaveTranspose(1), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E').octaveTranspose(2), new Fraction(2, 1))));

        Measure m = new Measure(new KeySignature(KeyType.E), noKeyCS);

        List<Chord> expected = new ArrayList<Chord>();
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F').transpose(1), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G').transpose(2), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('A').transpose(-1), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('B'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('C').octaveTranspose(1).transpose(1),
                new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D').octaveTranspose(1).transpose(1),
                new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E').octaveTranspose(2), new Fraction(2, 1))));

        assertEquals(expected, m.getChords());
    }

    /**
     * Tests that getChords() correctly applies syllables to chords. This case
     * tests for when there are fewer syllables than notes, when a syllable is
     * held for more than one note, and when a syllable is held for exactly one
     * note.
     **/
    @Test
    public void testgetChordsWithSyllables() {
        List<Syllable> s = new ArrayList<Syllable>();
        s.add(new Syllable("ma-", 1));
        s.add(new Syllable("zing", 2));

        List<ChordSequence> chords = new ArrayList<ChordSequence>();
        chords.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1))));
        chords.add(new Chord(new Fraction(1, 2), new Note(new Pitch('B'), new Fraction(1, 2))));
        chords.add(new Chord(new Fraction(1, 2), new Note(new Pitch('G'), new Fraction(1, 2))));

        Measure m = new Measure(new KeySignature(KeyType.C), s, chords);

        List<ChordSequence> expected = new ArrayList<ChordSequence>();
        expected.add(new Chord(new Fraction(2, 1), "ma-", new Note(new Pitch('G'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(1, 2), "zing", new Note(new Pitch('B'), new Fraction(1, 2))));
        expected.add(new Chord(new Fraction(1, 2), new Note(new Pitch('G'), new Fraction(1, 2))));
        assertEquals(expected, m.getChords());
    }

    /**
     * Tests equality and inequality for a measure with both chords and tuplets.
     **/

    @Test
    public void testEqualsObject() {

        Chord c1 = new Chord(FractionTest.oneFourth, new Note(PitchTest.middleC, FractionTest.oneFourth), new Note(
                PitchTest.lowG, FractionTest.oneFourth));
        Chord c2 = new Chord(FractionTest.oneHalf, new Note(PitchTest.middleC, FractionTest.oneHalf), new Note(
                PitchTest.highC, FractionTest.oneFourth));
        Chord c3 = new Chord(FractionTest.oneFourth, new Note(PitchTest.highC, FractionTest.oneFourth), new Note(
                PitchTest.lowG, FractionTest.oneFourth));

        Measure m1 = new Measure(c1, c2, c3, TupletTest.highCTriplet);
        Measure m2 = new Measure(c1, c2, c3, TupletTest.highCTriplet);
        Measure m3 = new Measure(c1, c3, TupletTest.highCTriplet);

        assertEquals(true, m1.equals(m2));
        assertEquals(false, m1.equals(m3));

    }

    /**
     * Tests equality and inequality for a measure with syllables.
     */
    @Test
    public void testEqualsSyllables() {

        List<Syllable> s = new ArrayList<Syllable>();
        s.add(new Syllable("ma-", 1));
        s.add(new Syllable("zing", 2));

        List<ChordSequence> chords = new ArrayList<ChordSequence>();
        chords.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1))));
        chords.add(new Chord(new Fraction(1, 2), new Note(new Pitch('B'), new Fraction(1, 2))));
        chords.add(new Chord(new Fraction(1, 2), new Note(new Pitch('G'), new Fraction(1, 2))));

        Measure m1 = new Measure(new KeySignature(KeyType.C), s, chords);
        Measure m2 = new Measure(new KeySignature(KeyType.C), s, chords);

        s.clear();
        s.add(new Syllable("ma-", 1));
        s.add(new Syllable("zing", 1));

        Measure m3 = new Measure(new KeySignature(KeyType.C), s, chords);

        assertEquals(true, m1.equals(m2));
        assertEquals(false, m1.equals(m3));

    }

    /**
     * Tests equality and inequality for Measures with Key Signatures and
     * Accidentals.
     */

    @Test
    public void testEqualsKeySigMeasuresWithAccidentals() {
        List<ChordSequence> noKeyCS = new ArrayList<>();
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G').transpose(-1), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('A'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('B'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('C').transpose(1).octaveTranspose(1),
                new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D').octaveTranspose(1), new Fraction(2, 1))));

        Measure m1 = new Measure(new KeySignature(KeyType.D), noKeyCS);
        Measure m2 = new Measure(new KeySignature(KeyType.D), noKeyCS);

        Measure m3 = new Measure(noKeyCS);
        assertEquals(true, m1.equals(m2));
        assertEquals(false, m1.equals(m3));

    }

}
