package music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Measure implements ChordSequence {
    private KeySignature keySignature;
    private List<Syllable> syllables;
    private List<ChordSequence> chordSequences;

    public Measure(KeySignature keySignature, List<Syllable> syllables, List<ChordSequence> chordSequences) {
        this.keySignature = keySignature;
        this.syllables = Utilities.copyList(syllables);
        this.chordSequences = Utilities.copyList(chordSequences);
    }

    public Measure(KeySignature keySignature, List<ChordSequence> chordSequences) {
        this(keySignature, Collections.<Syllable> emptyList(), chordSequences);
    }

    public Measure(KeySignature keySignature, List<Syllable> syllables, ChordSequence... chordSequences) {
        this(keySignature, syllables, Utilities.arrayToList(chordSequences));
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

        List<Chord> processedChordsWithSyllables = new ArrayList<>();
        Iterator<Syllable> syllablesIterator = syllables.iterator();
        int count = 0;
        for (Chord chord : processedChords) {
            if (count == 0 && syllablesIterator.hasNext()) {
                Syllable syllable = syllablesIterator.next();
                processedChordsWithSyllables.add(new Chord(chord.duration, syllable.text, chord.notes));
                count = syllable.length;
            } else {
                processedChordsWithSyllables.add(new Chord(chord.duration, chord.notes));
            }
            count--;
        }

        return processedChords;
    }
}
