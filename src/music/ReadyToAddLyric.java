package music;

import sound.SequencePlayer;

public class ReadyToAddLyric implements ReadyToAddItem {
    public final String text;
    public final int tick;

    public ReadyToAddLyric(String text, int tick) {
        this.text = text;
        this.tick = tick;
    }

    @Override
    public void addTo(SequencePlayer player) {
        player.addLyricEvent(text, tick);
    }
}
