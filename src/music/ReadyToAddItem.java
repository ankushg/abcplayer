package music;

import sound.SequencePlayer;

/**
 * The Interface ReadyToAddItem represents a note or lyric that is ready to add
 * to a SequencePlayer.
 */
public interface ReadyToAddItem {

    /**
     * Adds this ReadyToAddItem to the given player.
     *
     * @param player
     *            the player
     */
    public void addTo(SequencePlayer player);
}
