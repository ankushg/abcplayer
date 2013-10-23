package music;

import java.util.Collections;
import java.util.List;

public class EmptyChordSequence implements ChordSequence {
    @Override
    public List<Chord> getChords() {
        return Collections.emptyList();
    }
}
