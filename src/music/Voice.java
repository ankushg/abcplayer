package music;

import java.util.List;

public class Voice implements ChordSequence {
    private List<ChordSequence> chordSequences;

    public Voice(List<ChordSequence> chordSequences) {
        this.chordSequences = Utilities.copyList(chordSequences);
    }

    public Voice(ChordSequence... chordSequences) {
        this(Utilities.arrayToList(chordSequences));
    }

    @Override
    public List<Chord> getChords() {
        return Utilities.flatten(chordSequences);
    }
}
