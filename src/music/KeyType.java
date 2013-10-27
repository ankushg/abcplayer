package music;

import java.util.HashMap;

// TODO: Auto-generated Javadoc
/**
 * The Enum KeyType.
 */
public enum KeyType {

    /** The c. */
    C(0),
    /** The g. */
    G(1),
    /** The d. */
    D(2),
    /** The a. */
    A(3),
    /** The e. */
    E(4),
    /** The b. */
    B(5),
    /** The fs. */
    FS(6),
    /** The cs. */
    CS(7),
    /** The f. */
    F(-1),
    /** The bf. */
    BF(-2),
    /** The ef. */
    EF(-3),
    /** The af. */
    AF(-4),
    /** The df. */
    DF(-5),
    /** The gf. */
    GF(-6),
    /** The cf. */
    CF(-7),
    /** The am. */
    am(0),
    /** The em. */
    em(1),
    /** The bm. */
    bm(2),
    /** The fsm. */
    fsm(3),
    /** The csm. */
    csm(4),
    /** The gsm. */
    gsm(5),
    /** The dsm. */
    dsm(6),
    /** The asm. */
    asm(7),
    /** The d. */
    d(1),
    /** The bfm. */
    bfm(2),
    /** The efm. */
    efm(3),
    /** The afm. */
    afm(4),
    /** The dfm. */
    dfm(5),
    /** The gfm. */
    gfm(6),
    /** The cfm. */
    cfm(7);

    /** The map. */
    private final HashMap<Character, Integer> map;

    /** The sharps. */
    private final int sharps;

    /**
     * Instantiates a new key type.
     * 
     * @param sharps
     *            the sharps
     */
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

    /**
     * Gets the sharps.
     * 
     * @return the sharps
     */
    int getSharps() {
        return sharps;
    }

}
