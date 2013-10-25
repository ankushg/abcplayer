package music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sound.Pitch;

public class Key {
    private final KeySignature keySignature;
    private final Map<Pitch, Accidental> accidentals;

    public Key(KeySignature keySignature) {
        this.keySignature = keySignature;
        this.accidentals = new HashMap<>();
    }

    public Chord process(Chord chord) {
        List<Note> processedNotes = new ArrayList<>();
        for (Note note : chord.notes) {
            processedNotes.add(process(note));
        }
        return new Chord(chord.duration, processedNotes);
    }

    private Note process(Note note) {
        if (note.unappliedAccidental.type != AccidentalType.NONE) {
            accidentals.put(note.pitch, note.unappliedAccidental);
        }
        if (accidentals.containsKey(note.pitch)) {
            return note.unappliedAccidental.apply(note);
        }
        return new Note(note.pitch.transpose(keySignature.get(note.getLetter())), note.duration);
    }
}
