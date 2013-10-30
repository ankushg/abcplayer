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

    // TODO add other fields + appropriate constructors + comments for those
    // constructors

    public Song(List<Voice> voices) {
        this.voices = Utilities.copyList(voices);
    }

    public Song(Voice... voices) {
        this(Utilities.arrayToList(voices));
    }

    /**
     * Plays the current song through the MIDI player.
     *
     * @throws MidiUnavailableException
     * @throws InvalidMidiDataException
     */
    public void play() throws MidiUnavailableException, InvalidMidiDataException {
        int ticksPerBeat = Utilities.computeTicksPerBeat(Utilities.flatten(voices));

        // TODO replace "140" based on the meter/tempo/etc
        SequencePlayer player = new SequencePlayer(140, ticksPerBeat, new LyricListener() {
            @Override
            public void processLyricEvent(String text) {
                System.out.print(text);
            }
        });

        for (Voice voice : voices) {
            List<Chord> chords = voice.getChords();
            List<ReadyToAddItem> items = Utilities.getReadyToAddItems(chords);

            for (ReadyToAddItem item : items) {
                item.addTo(player);
            }
        }

        player.play();
        System.out.println(player);
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
