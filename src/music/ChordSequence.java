package music;

import java.util.List;

/**
 * The Interface ChordSequence represents any contiguous block of music from a
 * single voice, including lyrics (because Chords contain their associated
 * syllables)
 * 
 * Immutable because it's an interface.
 */
public interface ChordSequence {

    /**
     * Gets the chords associated with this ChordSequence. Each Chord starts
     * when the previous one ends, as encoded by Chord.duration (not to be
     * confused with the duration of the individual notes within each Chord)
     * 
     * @return a List of Chords that represents a contiguous block of music.
     * 
     */
    public List<Chord> getChords();
}
