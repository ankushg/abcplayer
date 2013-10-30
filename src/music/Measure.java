package music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * The class Measure represents a measure and all the music inside it, plus the
 * key signature and accidentals associated with the measure. Measures are
 * immutable.
 */
public class Measure implements ChordSequence {

    /** The key signature of the measure. */
    private KeySignature keySignature;

    /** A list of the syllables of the measure, not associated with any Chords. */
    private List<Syllable> syllables;

    /**
     * the List of ChordSequences (in this case Chords and Tuplets) that make up
     * this measure.
     */
    private List<ChordSequence> chordSequences;

    /**
     * Instantiates a new measure.
     * 
     * @param keySignature
     *            The key signature of the measure
     * @param syllables
     *            A list of the syllables of the measure, not associated with
     *            any Chords.
     * @param chordSequences
     *            the List of ChordSequences (in this case Chords and Tuplets)
     *            that make up this measure
     */
    public Measure(KeySignature keySignature, List<Syllable> syllables, List<ChordSequence> chordSequences) {
        this.keySignature = keySignature;
        this.syllables = Utilities.copyList(syllables);
        this.chordSequences = Utilities.copyList(chordSequences);
    }

    /**
     * Instantiates a new measure without lyrics.
     * 
     * @param keySignature
     *            The key signature of the measure
     * @param chordSequences
     *            the List of ChordSequences (in this case Chords and Tuplets)
     *            that make up this measure
     */
    public Measure(KeySignature keySignature, List<ChordSequence> chordSequences) {
        this(keySignature, Collections.<Syllable> emptyList(), chordSequences);
    }

    /**
     * Instantiates a new measure.
     * 
     * @param keySignature
     *            The key signature of the measure
     * @param syllables
     *            A list of the syllables of the measure, not associated with
     *            any Chords.
     * @param chordSequences
     *            the ChordSequences (in this case Chords and Tuplets) that make
     *            up this measure
     */
    public Measure(KeySignature keySignature, List<Syllable> syllables, ChordSequence... chordSequences) {
        this(keySignature, syllables, Utilities.arrayToList(chordSequences));
    }

    /**
     * Instantiates a new measure without lyrics.
     * 
     * @param keySignature
     *            The key signature of the measure
     * 
     * @param chordSequences
     *            the ChordSequences (in this case Chords and Tuplets) that make
     *            up this measure
     */
    public Measure(KeySignature keySignature, ChordSequence... chordSequences) {
        this(keySignature, Utilities.arrayToList(chordSequences));
    }

    /**
     * Instantiates a new measure without key signature or lyrics.
     * 
     * @param chordSequences
     *            the List of ChordSequences (in this case Chords and Tuplets)
     *            that make up this measure
     */
    public Measure(List<ChordSequence> chordSequences) {
        this(KeySignature.DEFAULT, chordSequences);
    }

    /**
     * Instantiates a new measure.
     * 
     * @param chordSequences
     *            the ChordSequences (in this case Chords and Tuplets) that make
     *            up this measure
     */
    public Measure(ChordSequence... chordSequences) {
        this(Utilities.arrayToList(chordSequences));
    }

    /**
     * Recursively calls getChords() on each ChordSequence in the measure,
     * applies the key signature and accidentals to the notes in the returned
     * list, and strips the accidentals off the notes in that list. Also
     * processes syllables and associates them with the correct Chords.
     * 
     * @return a list of the chords this measure contains, with accidentals
     *         applied and lyrics attached.
     * 
     * @see music.ChordSequence#getChords()
     */
    @Override
    public List<Chord> getChords() {
        List<Chord> chords = Utilities.flatten(chordSequences);

        Key key = new Key(keySignature);
        List<Chord> processedChords = new ArrayList<>();

        for (Chord chord : chords) {
            processedChords.add(key.process(chord));
        }

        List<Chord> processedChordsWithSyllables = new ArrayList<>();
        Iterator<Syllable> syllablesIterator = syllables.iterator();
        int count = 0;
        for (Chord chord : processedChords) {
            if (count == 0 && syllablesIterator.hasNext()) {
                Syllable syllable = syllablesIterator.next();
                processedChordsWithSyllables.add(new Chord(chord.duration, syllable.text, chord.notes));
                count = syllable.length;
            } else {
                processedChordsWithSyllables.add(new Chord(chord.duration, chord.notes));
            }
            count--;
        }

        return processedChords;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Measure [keySignature=%s, syllables=%s, chordSequences=%s]", keySignature, syllables,
                chordSequences);
    }
}
