package music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The class Repeat represents a section of music with a repeat, and possibly
 * alternate endings.
 */
public final class Repeat implements ChordSequence {

    /** The common portion of the repeated portion */
    private final ChordSequence common;

    /** The possible alternate endings of the repeated portion. */
    private final List<ChordSequence> endings;

    /**
     * Instantiates a new Repeat without alternate endings.
     *
     * @param common
     *            the ChordSequence to repeat (may be a ChordSequenceList)
     */
    public Repeat(ChordSequence common) {
        this.common = common;
        endings = getListOfEmptyChordSequences(1);
    }

    /**
     * Instantiates a new repeat with alternate endings.
     *
     * @param common
     *            the common ChordSequence to repeat (may be a
     *            ChordSequenceList)
     *
     * @param endings
     *            the ChordSequences representing the alternate endings
     */
    public Repeat(ChordSequence common, List<ChordSequence> endings) {
        this.common = common;
        this.endings = Utilities.copyList(endings);
    }

    /**
     * Instantiates a new repeat with alternate endings.
     *
     * @param common
     *            the common ChordSequence to repeat (may be a
     *            ChordSequenceList)
     *
     * @param endings
     *            the ChordSequence objects representing the alternate endings
     */
    public Repeat(ChordSequence common, ChordSequence... endings) {
        this(common, Utilities.arrayToList(endings));
    }

    /**
     * Creates a List of EmptyChordSequence objects of a given length. Used as a
     * helper method when alternate endings are not defined.
     *
     * @param n
     *            the number of empty ChordSequences to create. Must be
     *            nonnegative.
     * @return the generated List of empty ChordSequence objects
     */
    private static List<ChordSequence> getListOfEmptyChordSequences(int n) {
        List<ChordSequence> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(new EmptyChordSequence());
        }
        return Collections.unmodifiableList(result);
    }

    /**
     * Calls getChords() on the contained chord sequences and then returns a
     * list that's common + endings[0] + common + endings[1] + ... + common
     *
     * @return the list of Chords contained in the Repeat object, repeated and
     *         with the proper endings attached as necessary
     * @see music.ChordSequence#getChords()
     */
    @Override
    public List<Chord> getChords() {
        List<Chord> chords = new ArrayList<>();
        List<Chord> commonChords = common.getChords();
        for (ChordSequence ending : endings) {
            chords.addAll(commonChords);
            chords.addAll(ending.getChords());
        }
        chords.addAll(commonChords);
        return chords;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Repeat [common=%s, endings=%s]", common, endings);
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
        result = prime * result + ((common == null) ? 0 : common.hashCode());
        result = prime * result + ((endings == null) ? 0 : endings.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Repeat))
            return false;
        Repeat other = (Repeat) obj;
        return common.equals(other.common) && endings.equals(other.endings);
    }
}
