package music;

import java.util.List;

/**
 * The class ChordSequenceList is a wrapper for a list of ChordSequence objects,
 * so that methods that expect ChordSequences can be (indirectly) passed
 * ChordSequences
 */
public final class ChordSequenceList implements ChordSequence {

    /** The chord sequences. */
    List<? extends ChordSequence> chordSequences;

    /**
     * Instantiates a new ChordSequenceList.
     * 
     * @param chordSequences
     *            the chord sequences
     */
    public ChordSequenceList(List<? extends ChordSequence> chordSequences) {
        this.chordSequences = Utilities.copyList(chordSequences);
    }

    /**
     * Instantiates a new ChordSequenceList.
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

    /**
     * @return a string representation (purely for debugging purposes)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("ChordSequenceList [chordSequences=%s]", chordSequences);
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
        result = prime * result + ((chordSequences == null) ? 0 : chordSequences.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof ChordSequenceList))
            return false;
        ChordSequenceList other = (ChordSequenceList) obj;
        return chordSequences.equals(other.chordSequences);
    }
}
