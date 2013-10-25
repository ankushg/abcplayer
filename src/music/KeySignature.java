package music;

import java.util.HashMap;
import java.util.Map;

public class KeySignature {
    public static final KeySignature DEFAULT = new KeySignature();

    private final Map<Character, Integer> key;

    public KeySignature() {
        this.key = new HashMap<>();
    }

    public KeySignature(Map<Character, Integer> key) {
        this.key = new HashMap<>(key);
    }

    public int get(char note) {
        Integer result = key.get(note);
        return result == null ? 0 : result;
    }
}
