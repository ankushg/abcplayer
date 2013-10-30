package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

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

public class MeasureTest {

    Measure measure = new Measure();

    // TODO: test measure with syllable list
    // TODO: test measure with key signature

    @Test
    public void testHashCode() {
        fail("Not yet implemented"); // TODO test measure hashcode
    }

    @Test
    public void testGetChords() {

        // Tests a measure with no accidentals, key signature, or syllables.
        Chord c1 = new Chord(FractionTest.oneFourth, new Note(PitchTest.middleC, FractionTest.oneFourth), new Note(
                PitchTest.lowG, FractionTest.oneFourth));
        Chord c2 = new Chord(FractionTest.oneHalf, new Note(PitchTest.middleC, FractionTest.oneHalf), new Note(
                PitchTest.highC, FractionTest.oneFourth));
        Chord c3 = new Chord(FractionTest.oneFourth, new Note(PitchTest.highC, FractionTest.oneFourth), new Note(
                PitchTest.lowG, FractionTest.oneFourth));

        Measure m = new Measure(c1, c2, c3);

        List<Chord> expected = new ArrayList<Chord>();
        expected.add(c1);
        expected.add(c2);
        expected.add(c3);

        assertEquals(expected, m.getChords());

    }

    // Tests that a measure correctly applies a key signature on getChords().
    @Test
    public void testGetChordsWithKeySig() {
        List<ChordSequence> noKeyCS = new ArrayList<>();
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('A'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('B'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('C').octaveTranspose(1), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D').octaveTranspose(1), new Fraction(2, 1))));

        Measure m = new Measure(new KeySignature(KeyType.D), noKeyCS);

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

        assertEquals(expected, m.getChords());
    }

    // Tests that a measure correctly applies accidentals. Also tests that
    // accidentals are not "doubly applied" when specified in both a key
    // signature and an accidental on the note. For example, if there was an F#
    // in E Major, it would remain as F# and not F double sharp.

    @Test
    public void testGetChordsWithAccidentals() {
        List<ChordSequence> noKeyCS = new ArrayList<>();
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1), AccidentalTest.oneSharp)));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('A'), new Fraction(2, 1), AccidentalTest.oneFlat)));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('B'), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('C').octaveTranspose(1).transpose(1),
                new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D').octaveTranspose(1), new Fraction(2, 1))));
        noKeyCS.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E').octaveTranspose(1), new Fraction(2, 1))));

        Measure m = new Measure(new KeySignature(KeyType.E), noKeyCS);

        List<Chord> expected = new ArrayList<Chord>();
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F').transpose(1), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G').transpose(1), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('A').transpose(-1), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('B'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('C').octaveTranspose(1).transpose(1),
                new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D').octaveTranspose(1).transpose(1),
                new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E').octaveTranspose(1), new Fraction(2, 1))));

        assertEquals(expected, m.getChords());
    }

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

    @Test
    public void testToString() {
        fail("Not yet implemented"); // TODO test measure tostring
    }

    @Test
    public void testEqualsObject() {
        fail("Not yet implemented"); // TODO test measure equals
    }

}
