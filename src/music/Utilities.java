package music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utilities {
    public static <T> List<T> copyList(List<T> list) {
        return Collections.unmodifiableList(new ArrayList<>(list));
    }

    public static <T> List<T> arrayToList(T[] array) {
        return copyList(Arrays.asList(array));
    }

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

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static List<Chord> flatten(List<? extends ChordSequence> chordSequences) {
        List<Chord> chords = new ArrayList<>();
        for (ChordSequence cs : chordSequences) {
            chords.addAll(cs.getChords());
        }
        return chords;
    }

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
