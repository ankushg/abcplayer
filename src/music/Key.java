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
}
