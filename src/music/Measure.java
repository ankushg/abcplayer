package music;

import java.util.List;

public class Measure implements ChordSequence {
    private List<ChordSequence> chordSequences;

    public Measure(List<ChordSequence> chordSequences) {
        this.chordSequences = Utilities.copyList(chordSequences);
    }

    public Measure(ChordSequence... chordSequences) {
        this(Utilities.arrayToList(chordSequences));
    }

    @Override
    public List<Chord> getChords() {
        return Utilities.flatten(chordSequences);
    }
}
