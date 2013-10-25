package music;

public class Accidental {
    public static final Accidental NONE = new Accidental(AccidentalType.NONE, 0);

    public final AccidentalType type; // SHARP for sharps or flats (negative)
    public final int number; // negative for flats, zero for naturals

    public Accidental(AccidentalType type, int number) {
        this.type = type;
        this.number = number;
    }

    public Note apply(Note note) {
        return new Note(note.pitch.transpose(number), note.duration, Accidental.NONE);
    }
}
