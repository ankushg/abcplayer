package tests;

import org.junit.Ignore;
import org.junit.Test;

import player.Main;

/**
 * Tests for complete integration from the top to the bottom. Parses an abc file
 * and plays it.
 *
 */
@Ignore
public class IntegrationTest {

    /**
     * Tests multiple voices separated into different chunks.
     */
    @Test
    public void integrationTestOne() {
        Main.play("/sample_abc/tests/test1.abc");
    }

    /**
     * Tests octave transposes, 2/4 meter, and a key signature with one sharp.
     */
    @Test
    public void integrationTestTwo() {
        Main.play("/sample_abc/tests/test2.abc");
    }

    /**
     * Tests the different lyrics symbols.
     */
    @Test
    public void integrationTestThree() {
        Main.play("/sample_abc/tests/test3.abc");
    }

    /**
     * Tests large piece in A flat minor (two modifications to key), triplets,
     * duplets, chords, octave changes, accidentals, naturals
     */
    @Test
    public void integrationTestFour() {
        Main.play("/sample_abc/tests/greensleeves.abc");
    }

    /**
     * Tests multiple voices separated into different chunks, non-fraction
     * meter, multiple octave changes, accidentals, naturals
     */
    @Test
    public void integrationTestFive() {
        Main.play("/sample_abc/tests/enya.abc");
    }
}
