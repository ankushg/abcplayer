package tests;

import music.Note;

import org.junit.Test;

import sound.Pitch;

public class NoteTest {
    @Test
    public void testGetLetter() {
        for (Pitch pitch = new Pitch('C').octaveTranspose(-1); pitch.lessThan(new Pitch('C').octaveTranspose(2)); pitch = pitch
                .transpose(1)) {
            System.out.println(pitch + " " + Note.getLetter(pitch));
            // TODO make this a real test!
        }
    }
}
