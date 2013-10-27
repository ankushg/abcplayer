package music;

import java.util.HashMap;

public enum KeyType {
    C(0), G(1), D(2), A(3), E(4), B(5), FS(6), CS(7), F(-1), BF(-2), EF(-3), AF(-4), DF(-5), GF(-6), CF(-7), am(0), em(
            1), bm(2), fsm(3), csm(4), gsm(5), dsm(6), asm(7), d(1), bfm(2), efm(3), afm(4), dfm(5), gfm(6), cfm(7);

    private final HashMap<Character, Integer> map;
    private final int sharps;

    KeyType(int sharps) {
        this.sharps = sharps;
        this.map = new HashMap<Character, Integer>();

        map.put('C', 0);
        map.put('D', 0);
        map.put('E', 0);
        map.put('F', 0);
        map.put('G', 0);
        map.put('A', 0);
        map.put('B', 0);

    }

    int getSharps() {
        return sharps;
    }

}