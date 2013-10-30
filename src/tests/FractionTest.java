package tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import music.Fraction;

import org.junit.Test;

/**
 * Tests the Fraction class. Partitions the input space into the minimum values
 * for numerators and denominators, Integer.MAX_VALUE, numerator greater/less
 * than denominator.
 */
public class FractionTest {
    public static Fraction unitFraction = new Fraction(1, 1);
    public static Fraction numGreaterThanDenom = new Fraction(5, 2);
    public static Fraction numLessThanDenom = new Fraction(3, 4);
    public static Fraction maxVals = new Fraction(Integer.MAX_VALUE, Integer.MAX_VALUE);
    public static Fraction zeroOverOne = new Fraction(0, 1);
    public static Fraction copyGreaterThanDenom = new Fraction(5, 2);
    public static Fraction copyZeroOverOne = new Fraction(0, 1);
    public static Fraction oneFourth = new Fraction(1, 4);
    public static Fraction oneHalf = new Fraction(1, 2);

    /**
     * Compares hashcodes of equal Fractions to ensure they are equal and
     * satisfy the hashcode-equality contract
     */
    @Test
    public void testHashCode() {
        assertEquals(unitFraction.hashCode(), maxVals.hashCode());
        assertEquals(copyZeroOverOne.hashCode(), zeroOverOne.hashCode());
        assertEquals(copyGreaterThanDenom.hashCode(), numGreaterThanDenom.hashCode());
    }

    /**
     * Multiply, check for expected results and check that original Fraction was
     * not mutated
     */
    @Test
    public void testMultiply() {
        Fraction unitFractionCopy = new Fraction(unitFraction.numerator, unitFraction.denominator);
        assertEquals(unitFraction.multiply(5, 5), unitFraction);
        assertEquals(unitFraction, unitFractionCopy);
        assertEquals(unitFraction.multiply(5, 2), numGreaterThanDenom);
        assertEquals(unitFraction, unitFractionCopy);
        assertEquals(unitFraction.multiply(0, 1), zeroOverOne);
        assertEquals(unitFraction, unitFractionCopy);
    }

    /**
     * Compare every object with each other and itself. Also confirms
     * transitivity and reflexivity of equality
     */
    @Test
    public void testEqualsObject() {
        assertThat(unitFraction, is(unitFraction));
        assertThat(unitFraction, is(not(numGreaterThanDenom)));
        assertThat(unitFraction, is(not(numLessThanDenom)));
        assertThat(unitFraction, is(maxVals));
        assertThat(unitFraction, is(not(zeroOverOne)));
        assertThat(unitFraction, is(not(copyZeroOverOne)));

        assertThat(numGreaterThanDenom, is(not(unitFraction)));
        assertThat(numGreaterThanDenom, is(numGreaterThanDenom));
        assertThat(numGreaterThanDenom, is(not(numLessThanDenom)));
        assertThat(numGreaterThanDenom, is(not(maxVals)));
        assertThat(numGreaterThanDenom, is(not(zeroOverOne)));
        assertThat(numGreaterThanDenom, is(not(copyZeroOverOne)));

        assertThat(numLessThanDenom, is(not(unitFraction)));
        assertThat(numLessThanDenom, is(not(numGreaterThanDenom)));
        assertThat(numLessThanDenom, is(numLessThanDenom));
        assertThat(numLessThanDenom, is(not(maxVals)));
        assertThat(numLessThanDenom, is(not(zeroOverOne)));
        assertThat(numLessThanDenom, is(not(copyZeroOverOne)));

        assertThat(maxVals, is(unitFraction));
        assertThat(maxVals, is(not(numGreaterThanDenom)));
        assertThat(maxVals, is(not(numLessThanDenom)));
        assertThat(maxVals, is(maxVals));
        assertThat(maxVals, is(not(zeroOverOne)));
        assertThat(maxVals, is(not(copyZeroOverOne)));

        assertThat(zeroOverOne, is(not(unitFraction)));
        assertThat(zeroOverOne, is(not(numGreaterThanDenom)));
        assertThat(zeroOverOne, is(not(numLessThanDenom)));
        assertThat(zeroOverOne, is(not(maxVals)));
        assertThat(zeroOverOne, is(zeroOverOne));
        assertThat(zeroOverOne, is(copyZeroOverOne));

        assertThat(copyGreaterThanDenom, is(not(unitFraction)));
        assertThat(copyGreaterThanDenom, is(numGreaterThanDenom));
        assertThat(copyGreaterThanDenom, is(not(numLessThanDenom)));
        assertThat(copyGreaterThanDenom, is(not(maxVals)));
        assertThat(copyGreaterThanDenom, is(not(zeroOverOne)));
        assertThat(copyGreaterThanDenom, is(not(copyZeroOverOne)));

        assertThat(copyZeroOverOne, is(not(unitFraction)));
        assertThat(copyZeroOverOne, is(not(numGreaterThanDenom)));
        assertThat(copyZeroOverOne, is(not(numLessThanDenom)));
        assertThat(copyZeroOverOne, is(not(maxVals)));
        assertThat(copyZeroOverOne, is(zeroOverOne));
        assertThat(copyZeroOverOne, is(copyZeroOverOne));
    }

    @Test
    public void testToString() {
        assertEquals("1/1", unitFraction.toString());
        assertEquals("5/2", numGreaterThanDenom.toString());
        assertEquals("3/4", numLessThanDenom.toString());
        assertEquals("1/1", maxVals.toString());
        assertEquals("0/1", zeroOverOne.toString());
        assertEquals("5/2", copyGreaterThanDenom.toString());
        assertEquals("0/1", copyZeroOverOne.toString());
    }

}
