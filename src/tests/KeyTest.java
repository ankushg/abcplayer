package tests;

import static org.junit.Assert.*;

import music.Key;
import music.KeySignature;
import music.KeyType;

import org.junit.Test;

/**
 * Tests the Key class.
 *
 */
public class KeyTest {

    Key merp = new Key(new KeySignature(KeyType.AF));

    @Test
    public void testProcess() {
        fail("Not yet implemented");
        // TODO test process method of note class
    }

}
