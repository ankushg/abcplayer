package music;

/**
 * The class Syllable represents a single syllable of the lyrics. It contains
 * text and has a length (in terms of a number of notes). Syllables are
 * immutable.
 */
public final class Syllable {

    /** The text of the Syllable */
    public final String text;

    /** The length of the given Syllable */
    public final int length;

    /**
     * Instantiates a new syllable
     *
     * @param text
     *            the text
     * @param length
     *            the length in notes (must be greater than zero)
     */
    public Syllable(String text, int length) {
        this.text = text;
        this.length = length;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Syllable [text=%s, length=%s]", text, length);
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
        result = prime * result + length;
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Syllable))
            return false;
        Syllable other = (Syllable) obj;
        return length == other.length && text.equals(other.text);
    }
}
