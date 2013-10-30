package music;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class ChordSequenceList.
 */
public class ChordSequenceList implements ChordSequence {

    /** The chord sequences. */
    List<? extends ChordSequence> chordSequences;

    /**
     * Instantiates a new chord sequence list.
     * 
     * @param chordSequences
     *            the chord sequences
     */
    public ChordSequenceList(List<? extends ChordSequence> chordSequences) {
        this.chordSequences = Utilities.copyList(chordSequences);
    }

    /**
     * Instantiates a new chord sequence list.
     * 
     * @param chordSequences
     *            the chord sequences
     */
    public ChordSequenceList(ChordSequence... chordSequences) {
        this.chordSequences = Utilities.arrayToList(chordSequences);
    }

    /*
     * (non-Javadoc)
     * 
     * @see music.ChordSequence#getChords()
     */
    @Override
    public List<Chord> getChords() {
        return Utilities.flatten(chordSequences);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("ChordSequenceList [chordSequences=%s]", chordSequences);
    }
}
