package music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repeat implements ChordSequence {
    private ChordSequence common;
    private List<ChordSequence> endings;

    public Repeat(ChordSequence common) {
        this.common = common;
        endings = getListOfEmptyChordSequences(2);
    }

    public Repeat(ChordSequence common, List<ChordSequence> endings) {
        this.common = common;
        this.endings = Utilities.copyList(endings);
    }

    public Repeat(ChordSequence common, ChordSequence... endings) {
        this(common, Utilities.arrayToList(endings));
    }

    private static List<ChordSequence> getListOfEmptyChordSequences(int n) {
        List<ChordSequence> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(new EmptyChordSequence());
        }
        return Collections.unmodifiableList(result);
    }

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
