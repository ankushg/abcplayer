package music;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The class Voice represents a voice (this is the highest level of
 * ChordSequence). Voice objects are immutable.
 */
public class Voice implements ChordSequence {

    /** All of the chord sequences that make up this Voice. */
    private List<ChordSequence> chordSequences;

    /**
     * Instantiates a new Voice.
     * 
     * @param chordSequences
     *            the chord sequences comprising this Voice
     */
    public Voice(List<ChordSequence> chordSequences) {
        this.chordSequences = Utilities.copyList(chordSequences);
    }

    /**
     * Instantiates a new Voice.
     * 
     * @param chordSequences
     *            the chord sequences comprising this Voice
     */
    public Voice(ChordSequence... chordSequences) {
        this(Utilities.arrayToList(chordSequences));
    }

    /**
     * Recursively calls getChords() on each ChordSequence in the voice and
     * concatenates them into a flattened List.
     * 
     * @return a list of the chords this voice contains
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
        return String.format("Voice [chordSequences=%s]", chordSequences);
    }
}
