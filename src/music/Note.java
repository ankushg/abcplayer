package music;

import sound.Pitch;

// TODO: Auto-generated Javadoc
/**
 * The Class Note.
 */
public final class Note {

    /** The pitch. */
    public final Pitch pitch;

    /** The duration. */
    public final Fraction duration;

    /** The unapplied accidental. */
    public final Accidental unappliedAccidental;

    /**
     * Instantiates a new note.
     *
     * @param pitch
     *            the pitch
     * @param duration
     *            the duration
     * @param accidental
     *            the accidental
     */
    public Note(Pitch pitch, Fraction duration, Accidental accidental) {
        this.pitch = pitch;
        this.duration = duration;
        this.unappliedAccidental = accidental;
    }

    /**
     * Instantiates a new note.
     *
     * @param pitch
     *            the pitch
     * @param duration
     *            the duration
     */
    public Note(Pitch pitch, Fraction duration) {
        this(pitch, duration, Accidental.NONE);
    }

    /**
     * Multiply.
     *
     * @param numerator
     *            the numerator
     * @param denominator
     *            the denominator
     * @return the note
     */
    public Note multiply(int numerator, int denominator) {
        return new Note(pitch, duration.multiply(numerator, denominator));
    }

    /**
     * Gets the letter.
     *
     * @return the letter
     */
    public char getLetter() {
        return getLetter(pitch);
    }

    /**
     * Gets the letter.
     *
     * @param pitch
     *            the pitch
     * @return the letter
     */
    public static char getLetter(Pitch pitch) {
        char[] scale = "CDEFGAB".toCharArray();
        char letter = 0;
        int octave = 0;
        Pitch other = new Pitch(scale[letter]).octaveTranspose(octave);

        while (other.difference(pitch) < 0) {
            octave++;
            other = new Pitch(scale[letter]).octaveTranspose(octave);
        }
        while (other.difference(pitch) > 0) {
            octave--;
            other = new Pitch(scale[letter]).octaveTranspose(octave);
        }

        // now other is less than or equal to pitch and is C
        for (char c : scale) {
            other = new Pitch(c).octaveTranspose(octave);
            if (other.difference(pitch) == 0)
                return c;
        }

        return 0; // error code indicating this note had an accidental applied
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Note [pitch=%s, duration=%s, unappliedAccidental=%s]", pitch, duration,
                unappliedAccidental);
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
        result = prime * result + ((duration == null) ? 0 : duration.hashCode());
        result = prime * result + ((pitch == null) ? 0 : pitch.hashCode());
        result = prime * result + ((unappliedAccidental == null) ? 0 : unappliedAccidental.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Note))
            return false;
        Note other = (Note) obj;
        return duration.equals(other.duration) && pitch.equals(other.pitch)
                && unappliedAccidental.equals(other.unappliedAccidental);
    }
}
