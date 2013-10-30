package music;

import sound.SequencePlayer;

// TODO: Auto-generated Javadoc
/**
 * A ReadyToAddNote directly stores the information needed to add a single note
 * to the SequencePlayer. This includes its midiNote value, startTick, and
 * duration in number of ticks.
 * 
 * ReadyToAddNotes are immutable.
 * 
 */
public class ReadyToAddNote implements ReadyToAddItem {

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

    /*
     * (non-Javadoc)
     * 
     * @see music.ReadyToAddItem#addTo(sound.SequencePlayer)
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
}
