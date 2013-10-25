package music;

import sound.Pitch;

public class Note {
    public final Pitch pitch;
    public final Fraction duration;
    public final Accidental unappliedAccidental;

    public Note(Pitch pitch, Fraction duration, Accidental accidental) {
        this.pitch = pitch;
        this.duration = duration;
        this.unappliedAccidental = accidental;
    }

    public Note(Pitch pitch, Fraction duration) {
        this(pitch, duration, Accidental.NONE);
    }

    public Note multiply(int numerator, int denominator) {
        return new Note(pitch, duration.multiply(numerator, denominator));
    }

    public char getLetter() {
        return getLetter(pitch);
    }

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
