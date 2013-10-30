package music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Chord class represents a single note, a chord, or a rest.
 * 
 * Chords are immutable.
 * 
 * @see music.ChordSequence
 */
public class Chord implements ChordSequence {

    /** The notes. */
    public final List<Note> notes;

    /** The duration. */
    public final Fraction duration;

    /** The lyric. */
    public final String lyric;

    /**
     * Creates a new Chord.
     * 
     * @param duration
     *            a Fraction representing the duration of the chord as a whole
     *            (this is the duration of the first note in the chord as
     *            specified in the abc format)
     * @param lyric
     *            the lyric string associated with the chord.
     * @param notes
     *            the list of notes associated with the chord. If empty, this
     *            Chord represents a rest. If size 1, this Chord represents a
     *            single note.
     */
    public Chord(Fraction duration, String lyric, List<Note> notes) {
        this.duration = duration;
        this.lyric = lyric;
        this.notes = Utilities.copyList(notes);
    }

    /**
     * Instantiates a new chord.
     * 
     * @param duration
     *            a Fraction representing the duration of the chord as a whole
     *            (this is the duration of the first note in the chord as
     *            specified in the abc format)
     * @param notes
     *            the list of notes associated with the chord. If empty, this
     *            Chord represents a rest. If size 1, this Chord represents a
     *            single note.
     */
    public Chord(Fraction duration, List<Note> notes) {
        this(duration, "", notes);
    }

    /**
     * Creates a new Chord.
     * 
     * @param duration
     *            a Fraction representing the duration of the chord as a whole
     *            (this is the duration of the first note in the chord as
     *            specified in the abc format)
     * @param lyric
     *            the lyric string associated with the chord.
     * @param notes
     *            the notes associated with the chord. If 0 are given, this
     *            Chord represents a rest. If 1 is given, this Chord represents
     *            a single note.
     */
    public Chord(Fraction duration, String lyric, Note... notes) {
        this(duration, lyric, Utilities.arrayToList(notes));
    }

    /**
     * Creates a new Chord.
     * 
     * @param duration
     *            a Fraction representing the duration of the chord as a whole
     *            (this is the duration of the first note in the chord as
     *            specified in the abc format)
     * @param notes
     *            the notes associated with the chord. If 0 are given, this
     *            Chord represents a rest. If 1 is given, this Chord represents
     *            a single note.
     */
    public Chord(Fraction duration, Note... notes) {
        this(duration, Utilities.arrayToList(notes));
    }

    /*
     * @return an immutable list containing only this Chord.
     * 
     * @see music.ChordSequence#getChords()
     */
    @Override
    public List<Chord> getChords() {
        return Collections.singletonList(this);
    }

    /**
     * Multiply the duration of this chord by a fraction.
     * 
     * @param numerator
     *            the numerator of the fraction with which to multiply the
     *            duration of this note
     * @param denominator
     *            the denominator of the fraction with which to multiply the
     *            duration of this note
     * @return a new chord representing this chord scaled by the fraction given
     *         as parameters.
     */
    public Chord multiply(int numerator, int denominator) {
        List<Note> notes = new ArrayList<Note>();
        for (Note n : this.notes) {
            notes.add(n.multiply(numerator, denominator));
        }
        return new Chord(this.duration.multiply(numerator, denominator), notes);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Chord [notes=%s, duration=%s, lyric=%s]", notes, duration, lyric);
    }
}
