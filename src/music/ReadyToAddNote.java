package music;

import sound.SequencePlayer;

public class ReadyToAddNote implements ReadyToAddItem {
    public final int midiNote;
    public final int startTick;
    public final int numTicks;

    public ReadyToAddNote(int midiNote, int startTick, int numTicks) {
        this.midiNote = midiNote;
        this.startTick = startTick;
        this.numTicks = numTicks;
    }

    @Override
    public void addTo(SequencePlayer player) {
        player.addNote(midiNote, startTick, numTicks);
    }
}
