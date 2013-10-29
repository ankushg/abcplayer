package music;

import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import sound.LyricListener;
import sound.SequencePlayer;

public class Song {
    private final List<Voice> voices;

    // TODO add other fields + appropriate constructors

    public Song(List<Voice> voices) {
        this.voices = Utilities.copyList(voices);
    }

    public Song(Voice... voices) {
        this(Utilities.arrayToList(voices));
    }

    public void play() throws MidiUnavailableException, InvalidMidiDataException {
        int ticksPerBeat = Utilities.computeTicksPerBeat(Utilities.flatten(voices));

        // TODO replace "140" based on the meter/tempo/etc
        SequencePlayer player = new SequencePlayer(140, ticksPerBeat, new LyricListener() {
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
    }
}
