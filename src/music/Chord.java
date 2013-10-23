package music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chord implements ChordSequence {
    public final List<Note> notes;
    public final Fraction duration;

    public Chord(List<Note> notes, Fraction duration) {
        this.notes = Collections.unmodifiableList(notes);
        this.duration = duration;
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
        return new Chord(notes, this.duration.multiply(numerator, denominator));
    }
}
