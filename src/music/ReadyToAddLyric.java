package music;

import sound.SequencePlayer;

// TODO: Auto-generated Javadoc
/**
 * The Class ReadyToAddLyric.
 */
public class ReadyToAddLyric implements ReadyToAddItem {

    /** The text. */
    public final String text;

    /** The tick. */
    public final int tick;

    /**
     * Instantiates a new ready to add lyric.
     * 
     * @param text
     *            the text
     * @param tick
     *            the tick
     */
    public ReadyToAddLyric(String text, int tick) {
        this.text = text;
        this.tick = tick;
    }

    /*
     * (non-Javadoc)
     * 
     * @see music.ReadyToAddItem#addTo(sound.SequencePlayer)
     */
    @Override
    public void addTo(SequencePlayer player) {
        player.addLyricEvent(text, tick);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("ReadyToAddLyric [text=%s, tick=%s]", text, tick);
    }
}
