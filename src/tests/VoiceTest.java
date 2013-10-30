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
import music.Voice;

import org.junit.Test;

import sound.Pitch;

/* Testing strategy: A Voice can be made up of Measures, Repeats, and ChordSequenceLists. We're testing a voice only made up of Measures, a voice made up of Measures and Repeats, and a voice made up of Measures, Repeats, and ChordSequenceLists.*/

public class VoiceTest {

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
        Voice v = new Voice(m1, m2, m3);

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

        assertEquals(expected, v.getChords());
    }

    @Test
    public void testGetChordsWithMixtureOfMeasuresAndRepeats() {
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

        Voice repeats = new Voice(r1, m1, r2);

        List<Chord> expected = new ArrayList<Chord>();

        // First repeat
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

        // Measure
        expected.add(c1);
        expected.add(c2);
        expected.add(c3);

        // Second repeat
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

        assertEquals(expected, repeats.getChords());
    }

    @Test
    public void testGetChordsWithMeasuresRepeatsAndChordSequenceLists() {

        // Makes ChordSequenceList that contains two repeats.
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

        // Makes a voice with the ChordSequenceList containing repeats followed
        // by two measures.

        Voice v = new Voice(repeats, m1, m2);

        List<Chord> expected = new ArrayList<Chord>();

        // Adds first repeat in ChordSequence
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

        // Adds second repeat in ChordSequence
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

        // Adds measure 1
        expected.add(c1);
        expected.add(c2);
        expected.add(c3);

        // Adds measure 2
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('D'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('E'), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('F').transpose(1), new Fraction(2, 1))));
        expected.add(new Chord(new Fraction(2, 1), new Note(new Pitch('G'), new Fraction(2, 1))));

        assertEquals(expected, v.getChords());
    }

}
