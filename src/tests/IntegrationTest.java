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
     * Plays file test_one. This file tests for
     */
    @Test
    public void integrationTestOne() {
        Main.play("/sample_abc/tests/test_one.abc");
    }

}
