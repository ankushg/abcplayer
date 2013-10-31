package music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Common utilities which are used throughout the project
 *
 * Immutable.
 */
public final class Utilities {

    /**
     * Returns an immutable copy of a given list (that is no longer tied to the
     * original list).
     *
     * @param <T>
     *            the generic type
     * @param list
     *            the list
     * @return an immutable copy of the list
     */
    public static <T> List<T> copyList(List<T> list) {
        return Collections.unmodifiableList(new ArrayList<>(list));
    }

    /**
     * Returns an immutable list copy of a given array (that is no longer tied
     * to the array).
     *
     * @param <T>
     *            the generic type
     * @param array
     *            the array
     * @return an immutable copy of the array, in list form
     */
    public static <T> List<T> arrayToList(T[] array) {
        return copyList(Arrays.asList(array));
    }

    /**
     * Returns the greatest common denominator of two non-negative integers,
     * which cannot both be zero (since gcd(0, 0) is undefined).
     * 
     * @param a
     *            first integer
     * @param b
     *            second integer
     * @return gcd(a, b)
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a < b) {
            int c = a;
            a = b;
            b = c;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * Returns the (positive) least common multiple of two integers, neither of
     * which can be zero.
     *
     * @param a
     *            first integer
     * @param b
     *            second integer
     * @return lcm(a, b)
     */
    public static int lcm(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        return (a * b) / gcd(a, b);
    }

    /**
     * Flattens a list of ChordSequences into a list of Chords
     *
     * @param chordSequences
     *            the list of chord sequences (so, effectively, a list of lists
     *            of chords)
     * @return the flattened list of chords
     */
    public static List<Chord> flatten(List<? extends ChordSequence> chordSequences) {
        List<Chord> chords = new ArrayList<>();
        for (ChordSequence cs : chordSequences) {
            chords.addAll(cs.getChords());
        }
        return chords;
    }

    /**
     * Computes a value of ticksPerBeat that allows us to represent all the
     * given chords.
     *
     * @param chords
     *            the list of chords that will be played
     * @return a valid value of ticksPerBeat (every duration of every chord/note
     *         in the input must be representable as an integer number of ticks)
     */
    public static int computeTicksPerBeat(List<Chord> chords) {
        int lcm = 1;
        for (Chord c : chords) {
            lcm = lcm(lcm, c.duration.denominator);
            for (Note n : c.notes) {
                lcm = lcm(lcm, n.duration.denominator);
            }
        }
        return lcm;
    }

    /**
     * Computes a list of ReadyToAddItems (notes and lyrics), given a list of
     * Chords and the desired granularity of ticks (i.e., the number of ticks
     * per beat).
     *
     * @param chords
     *            the chords
     * @param ticksPerBeat
     *            the number of ticks in a beat
     * @return the notes/lyrics
     */
    public static List<ReadyToAddItem> getReadyToAddItems(List<Chord> chords, int ticksPerBeat) {
        List<ReadyToAddItem> items = new ArrayList<>();
        int tick = 0;
        for (Chord chord : chords) {
            for (Note n : chord.notes) {
                items.add(new ReadyToAddNote(n.pitch.toMidiNote(), tick, n.duration.numerator * ticksPerBeat
                        / n.duration.denominator));
            }
            items.add(new ReadyToAddLyric(chord.lyric, tick));
            tick += chord.duration.numerator * ticksPerBeat / chord.duration.denominator;
        }

        return items;
    }

    /**
     * Computes a list of ReadyToAddItems (notes and lyrics), given a list of
     * Chords.
     *
     * @param chords
     *            the chords
     * @return the notes/lyrics
     */
    public static List<ReadyToAddItem> getReadyToAddItems(List<Chord> chords) {
        return getReadyToAddItems(chords, computeTicksPerBeat(chords));
    }
}
