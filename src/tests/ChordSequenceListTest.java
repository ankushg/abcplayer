package tests;

import static org.junit.Assert.assertEquals;

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

public class ChordSequenceListTest {

    // Tests a ChordSequenceList only made up of measures.
    @Test
    public void testGetChords() {

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

        assertEquals(expected, common.getChords());
    }

    // Tests a ChordSequenceList only made up of repeats.
    @Test
    public void testGetChordsWithRepeats() {
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
        Repeat r1 = new Repeat(m1, firstEnding);
        Repeat r2 = new Repeat(m1, firstEnding);

        ChordSequenceList repeats = new ChordSequenceList(r1, r2);

        List<Chord> expected = new ArrayList<Chord>();
        expected.add(c1);
        expected.add(c2);
        expected.add(c3);
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1))));
        expected.add(c1);
        expected.add(c2);
        expected.add(c3);

        expected.add(c1);
        expected.add(c2);
        expected.add(c3);
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1))));
        expected.add(c1);
        expected.add(c2);
        expected.add(c3);

        assertEquals(expected, repeats.getChords());
    }

}
