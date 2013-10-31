package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import music.Chord;
import music.ChordSequence;
import music.ChordSequenceList;
import music.Fraction;
import music.KeySignature;
import music.KeyType;
import music.Measure;
import music.Note;
import music.Repeat;

import org.junit.Test;

import sound.Pitch;

/**
 * Tests the Repeat class with a variety of inputs. Test partitions for all
 * methods: Measures with key differences, chords of various pitches with all
 * possible accidentals applied, chords with 0/1/many notes, repeats with
 * alternate endings.
 */
public class RepeatTest {

    @Test
    public void testHashCode() {
        fail("Not yet implemented");
        // TODO: test repeat hashcode
    }

    @Test
    public void testGetChords() {
        Chord c1 = new Chord(FractionTest.oneFourth, new Note(PitchTest.middleC, FractionTest.oneFourth), new Note(
                PitchTest.lowG, FractionTest.oneFourth));
        Chord c2 = new Chord(FractionTest.oneHalf, new Note(PitchTest.middleC, FractionTest.oneHalf), new Note(
                PitchTest.highC, FractionTest.oneFourth));
        Chord c3 = new Chord(FractionTest.oneFourth, new Note(PitchTest.highC, FractionTest.oneFourth), new Note(
                PitchTest.lowG, FractionTest.oneFourth));

        Measure m1 = new Measure(c1, c2, c3);

        List<ChordSequence> noKeyCS = new ArrayList<>();
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1))));

        Measure m2 = new Measure(new KeySignature(KeyType.D), noKeyCS);

        List<ChordSequence> firstEnding = new ArrayList<ChordSequence>();
        firstEnding.add(m2);
        Repeat r = new Repeat(m1, firstEnding);

        List<Chord> expected = new ArrayList<Chord>();
        expected.add(c1);
        expected.add(c2);
        expected.add(c3);
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F').transpose(1), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1))));
        expected.add(c1);
        expected.add(c2);
        expected.add(c3);

        assertEquals(expected, r.getChords());

    }

    @Test
    public void testGetChordsLongCommon() {

        Chord c1 = new Chord(FractionTest.oneFourth, new Note(PitchTest.middleC, FractionTest.oneFourth), new Note(
                PitchTest.lowG, FractionTest.oneFourth));
        Chord c2 = new Chord(FractionTest.oneHalf, new Note(PitchTest.middleC, FractionTest.oneHalf), new Note(
                PitchTest.highC, FractionTest.oneFourth));
        Chord c3 = new Chord(FractionTest.oneFourth, new Note(PitchTest.highC, FractionTest.oneFourth), new Note(
                PitchTest.lowG, FractionTest.oneFourth));

        Measure m1 = new Measure(c1, c2, c3);
        Measure m2 = new Measure(c2, c3, c1);
        Measure m3 = new Measure(c3, c1, c2);
        ChordSequenceList common = new ChordSequenceList(m1, m2, m3);

        List<ChordSequence> noKeyCS = new ArrayList<>();
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1))));

        Measure m4 = new Measure(new KeySignature(KeyType.D), noKeyCS);

        List<ChordSequence> firstEnding = new ArrayList<ChordSequence>();
        firstEnding.add(m4);
        Repeat r = new Repeat(common, firstEnding);

        List<Chord> expected = new ArrayList<Chord>();
        expected.add(c1);
        expected.add(c2);
        expected.add(c3);
        expected.add(c2);
        expected.add(c3);
        expected.add(c1);
        expected.add(c3);
        expected.add(c1);
        expected.add(c2);
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F').transpose(1), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1))));
        expected.add(c1);
        expected.add(c2);
        expected.add(c3);
        expected.add(c2);
        expected.add(c3);
        expected.add(c1);
        expected.add(c3);
        expected.add(c1);
        expected.add(c2);

        assertEquals(expected, r.getChords());

    }

    @Test
    public void testEqualsObject() {
        fail("Not yet implemented"); // TODO test repeat equals
    }

}
