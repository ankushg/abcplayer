package music;

/**
 * The class Accidental represents an accidental for a given note.
 * 
 * Accidentals are immutable.
 */
public class Accidental {
    /**
     * The Constant NONE represents an Accidental object with no accidentals
     * applied.
     */
    public static final Accidental NONE = new Accidental(AccidentalType.NONE, 0);

    /**
     * The type is of type AccidentalType. Use the value SHARP for sharps or
     * flats, with a negative number for flats and positive for sharps.
     */
    public final AccidentalType type;

    /**
     * The number represents how many steps the accidental should be applied.
     * This value is negative for flats, positive for sharps, and zero for
     * naturals.
     */
    public final int number; // negative for flats, zero for naturals

    /**
     * Instantiates a new Accidental object.
     * 
     * @param type
     *            the type of Accidental. Use the value SHARP for sharps or
     *            flats, with a negative number for flats and positive for
     *            sharps.
     * @param number
     *            an int associated with the magnitude of Accidental. This value
     *            is negative for flats, positive for sharps, and zero for
     *            naturals.
     */
    public Accidental(AccidentalType type, int number) {
        this.type = type;
        this.number = number;
    }

    /**
     * Apply this accidental to a given note.
     * 
     * @param note
     *            the Note to apply the accidental to. Should not be modified.
     * @return a new Note with the pitch transposed to the correct pitch, and
     *         Accidental value set to NONE.
     */
    public Note apply(Note note) {
        return new Note(note.pitch.transpose(number), note.duration, Accidental.NONE);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Accidental [type=%s, number=%s]", type, number);
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
        result = prime * result + number;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Accidental))
            return false;
        Accidental other = (Accidental) obj;
        return number == other.number && type == other.type;
    }
}
