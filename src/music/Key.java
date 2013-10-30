package music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sound.Pitch;

/**
 * The class Key represents an instance of the key signature which can both
 * apply the current key to notes, and be modified by notes which contain
 * accidentals. Key objects are <b>NOT</b> immutable.
 */
public final class Key {

    /** The key signature. */
    private final KeySignature keySignature;

    /** The accidentals and pitches associated with the key. */
    private final Map<Pitch, Accidental> accidentals;

    /**
     * Instantiates a new key.
     *
     * @param keySignature
     *            the key signature of the key
     */
    public Key(KeySignature keySignature) {
        this.keySignature = keySignature;
        this.accidentals = new HashMap<>();
    }

    /**
     * Process a given Chord and apply the current Key to it. Additionally,
     * modify the current Key instance if the chord contains an accidental.
     *
     * @param chord
     *            the chord to process
     * @return a new chord representing the original chord with the key applied
     *         to it
     */
    public Chord process(Chord chord) {
        List<Note> processedNotes = new ArrayList<>();
        for (Note note : chord.notes) {
            processedNotes.add(process(note));
        }
        return new Chord(chord.duration, processedNotes);
    }

    /**
     * Process a given Note and apply the current Key to it. Additionally,
     * modify the current Key instance if the chord contains an accidental.
     *
     * @param note
     *            the note to apply the key to
     * @return the note after applying the current key
     */
    private Note process(Note note) {
        if (note.unappliedAccidental.type != AccidentalType.NONE) {
            accidentals.put(note.pitch, note.unappliedAccidental);
        }
        if (accidentals.containsKey(note.pitch)) {
            return accidentals.get(note.pitch).apply(note);
        }
        return new Note(note.pitch.transpose(keySignature.get(note.getLetter())), note.duration);
    }

    /**
     * @return a string representation (purely for debugging purposes)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Key [keySignature=%s, accidentals=%s]", keySignature, accidentals);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((accidentals == null) ? 0 : accidentals.hashCode());
        result = prime * result + ((keySignature == null) ? 0 : keySignature.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Key))
            return false;
        Key other = (Key) obj;
        return accidentals.equals(other.accidentals) && keySignature.equals(other.keySignature);
    }
}
