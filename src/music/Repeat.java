package music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The class Repeat represents a section of music with a repeat, and possibly
 * alternate endings.
 */
public class Repeat implements ChordSequence {

    /** The common portion of the repeated portion */
    private ChordSequence common;

    /** The possible alternate endings of the repeated portion. */
    private List<ChordSequence> endings;

    /**
     * Instantiates a new Repeat without alternate endings.
     * 
     * @param common
     *            the ChordSequence to repeat (may be a ChordSequenceList)
     */
    public Repeat(ChordSequence common) {
        this.common = common;
        endings = getListOfEmptyChordSequences(2);
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
     * list
     * that's common + endings[0] + common + endings[1] + ...
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
        return chords;
    }
}
