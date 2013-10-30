package tests;

import static org.junit.Assert.*;

import java.util.Collections;

import music.EmptyChordSequence;

import org.junit.Test;

public class EmptyChordSequenceTest {

    @Test
    public void testGetChords() {
        assertEquals(Collections.emptyList(), new EmptyChordSequence().getChords());
    }

}
