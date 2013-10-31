package music;

import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import sound.LyricListener;
import sound.SequencePlayer;

/**
 * A Song represents an entire, playable musical piece. It contains metadata and
 * voices and allows the piece to be played. Songs are immutable.
 */
public final class Song {
    private final List<Voice> voices;

    private final String trackNumber;
    private final String title;
    private final String composer;
    private final Fraction meter;
    private Fraction defaultLength;
    private final Fraction fracTempo;
    private KeySignature keySignature;

    private int tempo = 100;

    public Song(List<Voice> voices, String trackNumber, String title, String composer, Fraction meter,
            Fraction defaultLength, Fraction fracTempo, KeySignature keySignature, int tempo) {
        this.voices = voices;
        this.trackNumber = trackNumber;
        this.title = title;
        this.composer = composer;
        this.meter = meter;
        this.defaultLength = defaultLength;
        this.fracTempo = fracTempo;
        this.keySignature = keySignature;
        this.tempo = tempo;
    }

    public SequencePlayer getPlayer() throws MidiUnavailableException, InvalidMidiDataException {
        int ticksPerBeat = Utilities.computeTicksPerBeat(Utilities.flatten(voices));

        SequencePlayer player = new SequencePlayer((defaultLength.numerator * fracTempo.denominator * tempo)
                / (defaultLength.denominator * fracTempo.numerator), ticksPerBeat, new LyricListener() {
            @Override
            public void processLyricEvent(String text) {
                System.out.print(text);
            }
        });

        for (Voice voice : voices) {
            List<Chord> chords = voice.getChords();
            List<ReadyToAddItem> items = Utilities.getReadyToAddItems(chords, ticksPerBeat);

            for (ReadyToAddItem item : items) {
                item.addTo(player);
            }
        }
        return player;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Song [voices=%s]", voices);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((voices == null) ? 0 : voices.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Song))
            return false;
        Song other = (Song) obj;
        return voices.equals(other.voices);
    }
}
