package music;

import java.util.Collections;
import java.util.List;

/**
 * The Class EmptyChordSequence represents a ChordSequence with no Chords in it.
 */
public class EmptyChordSequence implements ChordSequence {
    /*
     * (non-Javadoc)
     * 
     * @see music.ChordSequence#getChords()
     */
    @Override
    public List<Chord> getChords() {
        return Collections.emptyList();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("EmptyChordSequence []");
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return 38297; // they are all equal
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        return obj instanceof EmptyChordSequence; // they are all equal
    }
}
