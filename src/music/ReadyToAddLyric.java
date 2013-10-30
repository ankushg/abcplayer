package music;

import sound.SequencePlayer;

/**
 * ReadyToAddLyric represents a lyric that is ready to be added to the
 * SequencePlayer.
 *
 * ReadyToAddLyrics are immutable
 */
public final class ReadyToAddLyric implements ReadyToAddItem {

    /** The text. */
    public final String text;

    /** The tick at which to display this lyric. */
    public final int tick;

    /**
     * Instantiates a new ReadyToAddLyric with the given text and tick.
     *
     * @param text
     *            the text
     * @param tick
     *            the tick at which to display this lyric.
     */
    public ReadyToAddLyric(String text, int tick) {
        this.text = text;
        this.tick = tick;
    }

    /**
     * Adds this ReadyToAddLyric to the given player
     *
     * @param player
     *            the SequencePlayer to add this ReadyToAddLyric to
     * @see music.ReadyToAddItem#addTo(sound.SequencePlayer)
     *
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
