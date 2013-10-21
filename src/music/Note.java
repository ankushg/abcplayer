package music;

import sound.Pitch;

public class Note {
    public final Pitch pitch;
    public final Duration duration;

    public Note(Pitch pitch, Duration duration) {
        this.pitch = pitch;
        this.duration = duration;
    }

    public Note multiply(int numerator, int denominator) {
        return new Note(pitch, duration.multiply(numerator, denominator));
    }
}
