package music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sound.Pitch;

// TODO: Auto-generated Javadoc
/**
 * The Class Key.
 */
public class Key {

    /** The key signature. */
    private final KeySignature keySignature;

    /** The accidentals. */
    private final Map<Pitch, Accidental> accidentals;

    /**
     * Instantiates a new key.
     * 
     * @param keySignature
     *            the key signature
     */
    public Key(KeySignature keySignature) {
        this.keySignature = keySignature;
        this.accidentals = new HashMap<>();
    }

    /**
     * Process.
     * 
     * @param chord
     *            the chord
     * @return the chord
     */
    public Chord process(Chord chord) {
        List<Note> processedNotes = new ArrayList<>();
        for (Note note : chord.notes) {
            processedNotes.add(process(note));
        }
        return new Chord(chord.duration, processedNotes);
    }

    /**
     * Applies the current Key object to the
     * 
     * @param note
     *            the note
     * @return the note
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

    /*
     * (non-Javadoc)
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
