package music;

import java.util.ArrayList;
import java.util.List;

/**
 * The class Tuplet represents a musical tuplet and abstracts away the duplet,
 * triplet and quadruplet. Tuplets are immutable.
 */
public final class Tuplet implements ChordSequence {

    /** The type of Tuplet. Can be a DUPLET, TRIPLET, or QUADRUPLET. */
    private final TupletType type;

    /** The chords in this tuplet */
    private final List<Chord> chords;

    /**
     * Instantiates a new tuplet with a given length and List of Chord objects.
     *
     * @param length
     *            the integer length of the tuplet (in number of Chord objects)
     * @param chords
     *            a List of Chord objects associated with the tuplet. The size
     *            of this list must equal the length parameter.
     */
    public Tuplet(int length, List<Chord> chords) {
        assert chords.size() == length;
        this.type = TupletType.getByLength(length);
        this.chords = Utilities.copyList(chords);
    }

    /**
     * Instantiates a new tuplet with a given length and List of Chord objects.
     *
     * @param length
     *            the integer length of the tuplet (in number of Chord objects)
     * @param chords
     *            the Chord objects associated with the tuplet. The number of
     *            Chord objects must equal the length parameter.
     */
    public Tuplet(int length, Chord... chords) {
        this(length, Utilities.arrayToList(chords));
    }

    /**
     * Scales the chords contained in this tuplet based on the type of the
     * tuplet and returns a list of them.
     *
     * @return a list of Chords scaled as appropriate for the type of tuplet
     *         (defined in the ABC spec)
     * @see music.ChordSequence#getChords()
     */
    @Override
    public List<Chord> getChords() {
        List<Chord> result = new ArrayList<>();
        for (Chord c : chords) {
            result.add(c.multiply(type.numerator, type.denominator));
        }
        return result;
    }

    /**
     * The Enum TupletType.
     */
    private static enum TupletType {

        /** The duplet. */
        DUPLET(2, 3, 2),
        /** The triplet. */
        TRIPLET(3, 2, 3),
        /** The quadruplet. */
        QUADRUPLET(4, 3, 4);

        /** The length of the tuplet */
        @SuppressWarnings("unused")
        public int length;

        /** The numerator and denominator associated with the tuplet. */
        public int numerator, denominator;

        /**
         * Instantiates a new tuplet type.
         *
         * @param numerator
         *            the numerator of the scale factor of this tuplet
         * @param denominator
         *            the denominator of the scale factor of this tuplet
         * @param length
         *            the length of this tuplet
         */
        private TupletType(int length, int numerator, int denominator) {
            this.length = length;
            this.numerator = numerator;
            this.denominator = denominator;
        }

        /**
         * Gets a TupletType by an integer length (in Chords).
         * 
         * @param length
         *            the length of the desired TupletType. Only 2, 3 and 4 are
         *            supported.
         * @return a TupletType corresponding to the given length
         * @throws RuntimeException
         *             for length values that are not supported.
         */
        public static TupletType getByLength(int length) {
            switch (length) {
            case 2:
                return DUPLET;
            case 3:
                return TRIPLET;
            case 4:
                return QUADRUPLET;
            default:
                throw new RuntimeException("invalid tuplet type: " + length);
            }
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Tuplet [type=%s, chords=%s]", type, chords);
    }
}
