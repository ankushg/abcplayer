package music;

public class ReadyToAddNote {
    public final int midiNote;
    public final int startTick;
    public final int numTicks;

    public ReadyToAddNote(int midiNote, int startTick, int numTicks) {
        this.midiNote = midiNote;
        this.startTick = startTick;
        this.numTicks = numTicks;
    }
}
