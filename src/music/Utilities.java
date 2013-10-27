package music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Utilities.
 */
public class Utilities {

    /**
     * Copy list.
     * 
     * @param <T>
     *            the generic type
     * @param list
     *            the list
     * @return the list
     */
    public static <T> List<T> copyList(List<T> list) {
        return Collections.unmodifiableList(new ArrayList<>(list));
    }

    /**
     * Array to list.
     * 
     * @param <T>
     *            the generic type
     * @param array
     *            the array
     * @return the list
     */
    public static <T> List<T> arrayToList(T[] array) {
        return copyList(Arrays.asList(array));
    }

    /**
     * Gcd.
     * 
     * @param a
     *            the a
     * @param b
     *            the b
     * @return the int
     */
    public static int gcd(int a, int b) {
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
     * Lcm.
     * 
     * @param a
     *            the a
     * @param b
     *            the b
     * @return the int
     */
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    /**
     * Flatten.
     * 
     * @param chordSequences
     *            the chord sequences
     * @return the list
     */
    public static List<Chord> flatten(List<? extends ChordSequence> chordSequences) {
        List<Chord> chords = new ArrayList<>();
        for (ChordSequence cs : chordSequences) {
            chords.addAll(cs.getChords());
        }
        return chords;
    }

    /**
     * Compute ticks per beat.
     * 
     * @param chords
     *            the chords
     * @return the int
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
     * Gets the ready to add items.
     * 
     * @param chords
     *            the chords
     * @return the ready to add items
     */
    public static List<ReadyToAddItem> getReadyToAddItems(List<Chord> chords) {
        int ticksPerBeat = computeTicksPerBeat(chords);

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
}
