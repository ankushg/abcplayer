package music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chord implements ChordSequence {
    public final List<Note> notes;
    public final Fraction duration;

    public Chord(Fraction duration, List<Note> notes) {
        this.duration = duration;
        this.notes = Utilities.copyList(notes);
    }

    public Chord(Fraction duration, Note... notes) {
        this(duration, Utilities.arrayToList(notes));
    }

    @Override
    public List<Chord> getChords() {
        return Collections.singletonList(this);
    }

    public Chord multiply(int numerator, int denominator) {
        List<Note> notes = new ArrayList<Note>();
        for (Note n : this.notes) {
            notes.add(n.multiply(numerator, denominator));
        }
        return new Chord(this.duration.multiply(numerator, denominator), notes);
    }
}
