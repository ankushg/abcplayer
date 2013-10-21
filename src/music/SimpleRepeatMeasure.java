package music;

import java.util.ArrayList;
import java.util.List;

public class SimpleRepeatMeasure implements ChordSequence {
    private Measure measure;

    public SimpleRepeatMeasure(Measure measure) {
        this.measure = measure;
    }

    @Override
    public List<Chord> getChords() {
        List<Chord> chords = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            chords.addAll(measure.getChords());
        }
        return chords;
    }
}
