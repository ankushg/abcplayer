package music;

import java.util.HashMap;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class KeySignature.
 */
public class KeySignature {

    /** The Constant DEFAULT. */
    public static final KeySignature DEFAULT = new KeySignature();

    /** The key. */
    private final Map<Character, Integer> key;

    /**
     * Instantiates a new key signature.
     */
    public KeySignature() {
        this.key = new HashMap<>();
    }

    /**
     * Instantiates a new key signature.
     * 
     * @param k
     *            the k
     */
    public KeySignature(KeyType k) {
        this.key = this.makeKey(k);
    }

    /**
     * Instantiates a new key signature.
     * 
     * @param key
     *            the key
     */
    public KeySignature(Map<Character, Integer> key) {
        this.key = new HashMap<>(key);
    }

    /**
     * Make key.
     * 
     * @param k
     *            the k
     * @return the map
     */
    public Map<Character, Integer> makeKey(KeyType k) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        map.put('C', 0);
        map.put('D', 0);
        map.put('E', 0);
        map.put('F', 0);
        map.put('G', 0);
        map.put('A', 0);
        map.put('B', 0);

        if (k.getSharps() > 0) {
            char[] sharps = new char[] { 'F', 'C', 'G', 'D', 'A', 'E', 'B' };
            for (int i = 0; i < k.getSharps(); i++) {
                map.remove(sharps[i]);
                map.put(sharps[i], 1);
            }
            return map;
        }

        else if (k.getSharps() < 0) {
            int numFlats = Math.abs(k.getSharps());
            char[] flats = new char[] { 'B', 'E', 'A', 'D', 'G', 'C', 'F' };
            for (int i = 0; i < k.getSharps(); i++) {
                map.remove(flats[i]);
                map.put(flats[i], -1);
            }
            return map;
        }

        else {
            return map;
        }
    }

    /**
     * Gets the.
     * 
     * @param note
     *            the note
     * @return the int
     */
    public int get(char note) {
        Integer result = key.get(note);
        return result == null ? 0 : result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("KeySignature [key=%s]", key);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof KeySignature))
            return false;
        KeySignature other = (KeySignature) obj;
        return key.equals(other.key);
    }
}
