package music;

import java.util.ArrayList;
import java.util.List;

public class Utilities {
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

    public static List<Chord> flatten(List<ChordSequence> chordSequences) {
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

    public static List<ReadyToAddNote> process(List<Chord> chords) {
        int ticksPerBeat = computeTicksPerBeat(chords);

        List<ReadyToAddNote> notes = new ArrayList<>();
        int tick = 0;
        for (Chord c : chords) {
            for (Note n : c.notes) {
                notes.add(new ReadyToAddNote(n.pitch.toMidiNote(), tick, n.duration.numerator * ticksPerBeat
                        / n.duration.denominator));
            }
            tick += c.duration.numerator * ticksPerBeat / c.duration.denominator;
        }

        return notes;
    }
}
