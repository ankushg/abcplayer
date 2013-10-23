package music;

import java.util.List;

public class ChordSequenceList implements ChordSequence {
    List<? extends ChordSequence> chordSequences;

    public ChordSequenceList(List<? extends ChordSequence> chordSequences) {
        this.chordSequences = Utilities.copyList(chordSequences);
    }

    public ChordSequenceList(ChordSequence... chordSequences) {
        this.chordSequences = Utilities.arrayToList(chordSequences);
    }

    @Override
    public List<Chord> getChords() {
        return Utilities.flatten(chordSequences);
    }
}
