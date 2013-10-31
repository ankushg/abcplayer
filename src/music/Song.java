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
    private String keySignature;

    private int tempo = 100;

    // TODO add other fields + appropriate constructors + comments for those
    // constructors
    public Song(List<Voice> voices, String tN, String title, String composer, Fraction meter, Fraction defaultLength,
            Fraction fracTempo, String keySignature, String tempo) {
        this.voices = voices;
        this.trackNumber = tN;
        this.title = title;
        this.composer = composer;
        this.meter = meter;
        this.defaultLength = defaultLength;
        this.fracTempo = fracTempo;
        this.keySignature = keySignature;
        this.tempo = Integer.parseInt(tempo);
    }

    public Song(List<Voice> voices, String tN, String title, String keySignature) {
        this.voices = voices;
        this.trackNumber = tN;
        this.title = title;
        this.keySignature = keySignature;
        this.meter = new Fraction(4, 4);
        this.composer = "Unknown";
        this.defaultLength = new Fraction(1, 8);
        this.fracTempo = new Fraction(1, 8);
        this.tempo = 100;
    }

    public Song(List<Voice> voices, Fraction meter, String tN, String title, String keySignature) {
        this.voices = voices;
        this.trackNumber = tN;
        this.title = title;
        this.keySignature = keySignature;
        this.meter = meter;

        this.composer = "Unknown";

        // Calculating default length if not specified and meter is specified.
        double num = (double) meter.numerator;
        double denom = (double) meter.denominator;

        double result = num / denom;

        if (result < 0.75) {
            this.defaultLength = new Fraction(1, 16);
        } else {
            this.defaultLength = new Fraction(1, 8);
        }
        this.fracTempo = new Fraction(1, 8);
        this.tempo = 100;
    }

    public Song(List<Voice> voices) {
        this.voices = Utilities.copyList(voices);
        this.trackNumber = "";
        this.title = "";
        this.composer = "Unknown";
        this.meter = new Fraction(4, 4);
        this.defaultLength = new Fraction(1, 4);
        this.fracTempo = new Fraction(1, 8);
        this.keySignature = "C";
        this.tempo = 200;
    }

    public Song(Voice... voices) {
        this(Utilities.arrayToList(voices));
    }

    public SequencePlayer getPlayer() throws MidiUnavailableException, InvalidMidiDataException {
        int ticksPerBeat = Utilities.computeTicksPerBeat(Utilities.flatten(voices));

        // TODO replace "140" based on the meter/tempo/etc
        SequencePlayer player = new SequencePlayer(tempo, ticksPerBeat, new LyricListener() {
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
