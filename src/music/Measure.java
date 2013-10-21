package music;

import java.util.List;

public class Measure implements ChordSequence {
    private List<ChordSequence> chordSequences;

    public Measure(List<ChordSequence> chordSequences) {
        this.chordSequences = chordSequences;
    }

    @Override
    public List<Chord> getChords() {
        return Utilities.flatten(chordSequences);
    }
}
