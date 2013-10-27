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
     *            the numerator of this fraction. Must be non-zero.
     * @param denominator
     *            the denominator of this fraction. Must be non-zero.
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
}
