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
}
