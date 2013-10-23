package music;

public class Fraction {
    public final int numerator;
    public final int denominator;

    public Fraction(int numerator, int denominator) {
        int gcd = Utilities.gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction multiply(int numerator, int denominator) {
        return new Fraction(this.numerator * numerator, this.denominator * denominator);
    }
}
