package music;

import java.util.ArrayList;
import java.util.List;

public class Measure implements ChordSequence {
    private List<ChordSequence> chordSequences;
    private KeySignature keySignature;

    public Measure(KeySignature keySignature, List<ChordSequence> chordSequences) {
        this.keySignature = keySignature;
        this.chordSequences = Utilities.copyList(chordSequences);
    }

    public Measure(KeySignature keySignature, ChordSequence... chordSequences) {
        this(keySignature, Utilities.arrayToList(chordSequences));
    }

    public Measure(List<ChordSequence> chordSequences) {
        this(KeySignature.DEFAULT, chordSequences);
    }

    public Measure(ChordSequence... chordSequences) {
        this(Utilities.arrayToList(chordSequences));
    }

    @Override
    public List<Chord> getChords() {
        List<Chord> chords = Utilities.flatten(chordSequences);

        Key key = new Key(keySignature);
        List<Chord> processedChords = new ArrayList<>();

        for (Chord chord : chords) {
            processedChords.add(key.process(chord));
        }

        return processedChords;
    }
}
