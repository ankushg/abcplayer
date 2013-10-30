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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + tick;
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ReadyToAddLyric))
            return false;
        ReadyToAddLyric other = (ReadyToAddLyric) obj;
        return text.equals(other.text) && tick == other.tick;
    }
}
