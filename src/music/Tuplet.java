package music;

import java.util.ArrayList;
import java.util.List;

public class Tuplet implements ChordSequence {
    private TupletType type;
    private List<Chord> chords;

    public Tuplet(int length, List<Chord> chords) {
        assert chords.size() == length;
        this.type = TupletType.getByLength(length);
        this.chords = Utilities.copyList(chords);
    }

    public Tuplet(int length, Chord... chords) {
        this(length, Utilities.arrayToList(chords));
    }

    @Override
    public List<Chord> getChords() {
        List<Chord> result = new ArrayList<>();
        for (Chord c : chords) {
            result.add(c.multiply(type.numerator, type.denominator));
        }
        return result;
    }

    private static enum TupletType {
        DUPLET(2, 3, 2), TRIPLET(3, 2, 3), QUADRUPLET(4, 3, 4);

        @SuppressWarnings("unused")
        public int length;
        public int numerator, denominator;

        private TupletType(int numerator, int denominator, int length) {
            this.numerator = numerator;
            this.denominator = denominator;
            this.length = length;
        }

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
                // TODO improve exceptions
            }
        }
    }
}
