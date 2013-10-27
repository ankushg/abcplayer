package music;

import sound.Pitch;

// TODO: Auto-generated Javadoc
/**
 * The Class Note.
 */
public class Note {

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
}
