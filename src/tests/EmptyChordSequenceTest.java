package tests;

import static org.junit.Assert.*;

import java.util.Collections;

import music.EmptyChordSequence;

import org.junit.Test;

/**
 * Tests the EmptyChordSequence class. No input space to partition.
 */
public class EmptyChordSequenceTest {

    /**
     * Tests that getChords returns an empty list. No input space to partition.
     */
    @Test
    public void testGetChords() {
        assertEquals(Collections.emptyList(), new EmptyChordSequence().getChords());
    }

}
