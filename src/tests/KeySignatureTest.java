package tests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import music.KeySignature;
import music.KeyType;

import org.junit.Test;

/**
 * Tests the KeySignature class. Test partitions: Major keys with flats, major
 * keys with sharps, minor keys with flats, minor keys with sharps, key with no
 * flats or sharps.
 * 
 */
public class KeySignatureTest {

    /**
     * Test partitions: Major keys with flats, major keys with sharps, minor
     * keys with flats, minor keys with sharps, C Major (key with no flats or
     * sharps).
     */

    @Test
    public void testMakeKey() {
        /** Tests C Major, a major key with no sharps or flats. */

        KeySignature Ckeysig = new KeySignature(KeyType.C);
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        map.put('C', 0);
        map.put('D', 0);
        map.put('E', 0);
        map.put('F', 0);
        map.put('G', 0);
        map.put('A', 0);
        map.put('B', 0);

        assertEquals(map, Ckeysig.makeKey(KeyType.C));

        /** Tests E Major, a major key with sharps. */
        KeySignature Ekeysig = new KeySignature(KeyType.E);

        map.put('C', 1);
        map.put('D', 1);
        map.put('E', 0);
        map.put('F', 1);
        map.put('G', 1);
        map.put('A', 0);
        map.put('B', 0);

        assertEquals(map, Ekeysig.makeKey(KeyType.E));

        /** Tests D flat Major, a major key with flats. */

        KeySignature DFkeysig = new KeySignature(KeyType.DF);
        map.clear();

        map.put('C', 0);
        map.put('D', -1);
        map.put('E', -1);
        map.put('F', 0);
        map.put('G', -1);
        map.put('A', -1);
        map.put('B', -1);

        assertEquals(map, DFkeysig.makeKey(KeyType.DF));

        /** Tests G sharp minor, a minor key with sharps. */
        KeySignature gsmkeysig = new KeySignature(KeyType.gsm);
        map.clear();

        map.put('C', 1);
        map.put('D', 1);
        map.put('E', 0);
        map.put('F', 1);
        map.put('G', 1);
        map.put('A', 1);
        map.put('B', 0);

        assertEquals(map, gsmkeysig.makeKey(KeyType.gsm));

        /** Tests E flat minor, a minor key with flats. */
        KeySignature efmkeysig = new KeySignature(KeyType.efm);
        map.clear();

        map.put('C', -1);
        map.put('D', -1);
        map.put('E', -1);
        map.put('F', 0);
        map.put('G', -1);
        map.put('A', -1);
        map.put('B', -1);

        assertEquals(map, efmkeysig.makeKey(KeyType.efm));

    }

    @Test
    public void testGet() {

        /** Tests F# Major, a major key with sharps. */
        KeySignature FSkeysig = new KeySignature(KeyType.FS);
        assertEquals(1, FSkeysig.get('C'));
        assertEquals(0, FSkeysig.get('B'));

        /** Tests B flat Major, a major key with flats. */
        KeySignature BFkeysig = new KeySignature(KeyType.BF);
        assertEquals(-1, BFkeysig.get('E'));
        assertEquals(0, BFkeysig.get('D'));

        /** Tests e minor, a minor key with sharps. */
        KeySignature emkeysig = new KeySignature(KeyType.em);
        assertEquals(1, emkeysig.get('F'));
        assertEquals(0, emkeysig.get('D'));

        /** Tests g minor, a minor key with flats. */
        KeySignature gmkeysig = new KeySignature(KeyType.gm);
        assertEquals(-1, gmkeysig.get('B'));
        assertEquals(0, gmkeysig.get('A'));

        /** Tests C Major, a major key with no flats or sharps. */
        KeySignature Ckeysig = new KeySignature(KeyType.C);
        assertEquals(0, gmkeysig.get('D'));
        assertEquals(0, gmkeysig.get('G'));

    }

}
