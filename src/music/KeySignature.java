package music;

import java.util.HashMap;
import java.util.Map;

public class KeySignature {
    public static final KeySignature DEFAULT = new KeySignature();

    private final Map<Character, Integer> key;

    public KeySignature() {
        this.key = new HashMap<>();
    }

    public KeySignature(KeyType k) {
        this.key = this.makeKey(k);

    }

    public KeySignature(Map<Character, Integer> key) {
        this.key = new HashMap<>(key);
    }

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

    public int get(char note) {
        Integer result = key.get(note);
        return result == null ? 0 : result;
    }
}
