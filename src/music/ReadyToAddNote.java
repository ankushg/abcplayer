package music;

import sound.SequencePlayer;

/**
 * A ReadyToAddNote directly stores the information needed to add a single note
 * to the SequencePlayer. This includes its midiNote value, startTick, and
 * duration in number of ticks.
 *
 * ReadyToAddNotes are immutable.
 *
 */
public final class ReadyToAddNote implements ReadyToAddItem {

    /** The midi note. */
    public final int midiNote;

    /** The start tick. */
    public final int startTick;

    /** The num ticks. */
    public final int numTicks;

    /**
     * Create a new ReadyToAddNote with the given parameters.
     *
     * @param midiNote
     *            an int value for the pitch of the note
     * @param startTick
     *            an int value for the tick at which the note starts playing
     * @param numTicks
     *            an int value for the duration of the note in ticks
     */
    public ReadyToAddNote(int midiNote, int startTick, int numTicks) {
        this.midiNote = midiNote;
        this.startTick = startTick;
        this.numTicks = numTicks;
    }

    /**
     * Adds this ReadyToAddNote to the given player
     *
     * @param player
     *            the SequencePlayer to add this ReadyToAddNote to
     * @see music.ReadyToAddItem#addTo(sound.SequencePlayer)
     *
     */
    @Override
    public void addTo(SequencePlayer player) {
        player.addNote(midiNote, startTick, numTicks);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("ReadyToAddNote [midiNote=%s, startTick=%s, numTicks=%s]", midiNote, startTick, numTicks);
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
        result = prime * result + midiNote;
        result = prime * result + numTicks;
        result = prime * result + startTick;
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ReadyToAddNote))
            return false;
        ReadyToAddNote other = (ReadyToAddNote) obj;
        return midiNote == other.midiNote && numTicks == other.numTicks && startTick == other.startTick;
    }
}
