package music;

/**
 * The Fraction class is a mathematical fraction with a numerator and
 * denominator. It is used throughout abcplayer to represent durations in terms
 * of musical length.
 * 
 * Fraction objects are immutable.
 */
public class Fraction {
    public final int numerator;
    public final int denominator;

    /**
     * Instantiates a new fraction and automatically simplifies it.
     * 
     * @param numerator
     *            the numerator of this fraction. Must be nonnegative.
     * @param denominator
     *            the denominator of this fraction. Must be positive.
     */
    public Fraction(int numerator, int denominator) {
        int gcd = Utilities.gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    /**
     * Multiply this fragment with the numerator and denominator of another
     * fraction.
     * 
     * @param numerator
     *            the numerator of the other fraction
     * @param denominator
     *            the denominator of the other fraction
     * @return a new Fraction object representing the fraction resulting from
     *         the multiplication
     */
    public Fraction multiply(int numerator, int denominator) {
        return new Fraction(this.numerator * numerator, this.denominator * denominator);
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
        result = prime * result + denominator;
        result = prime * result + numerator;
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass())
            return false;
        Fraction other = (Fraction) obj;
        return numerator * other.denominator == other.numerator * denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
