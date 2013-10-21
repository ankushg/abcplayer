package music;

public class Duration {
    public final int numerator;
    public final int denominator;

    public Duration(int numerator, int denominator) {
        int gcd = Utilities.gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Duration multiply(int numerator, int denominator) {
        return new Duration(this.numerator * numerator, this.denominator * denominator);
    }

}
