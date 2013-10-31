package tests;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import music.Chord;
import music.Fraction;
import music.Measure;
import music.Note;

import org.junit.Test;

public class SongTest {

    /**
     * Songs can contain
     */

    public static Measure ZeroNoteMeasure = new Measure(new Chord(new Fraction(1, 2), new ArrayList<Note>()));

    @Test
    public void testHashCode() {
        fail("Not yet implemented"); // TODO test song hashcode
    }

    @Test
    public void testGetPlayer() {
        fail("Not yet implemented"); // TODO test song getplayer
    }

    @Test
    public void testToString() {
        fail("Not yet implemented"); // TODO test song tostring
    }

    @Test
    public void testEqualsObject() {
        fail("Not yet implemented"); // TODO test song equals
    }

}
