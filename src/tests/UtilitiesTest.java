package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import music.Utilities;

import org.junit.Test;

public class UtilitiesTest {

    @Test
    public void testCopyList() {
        fail("Not yet implemented"); // TODO test utilities copylist
    }

    @Test
    public void testArrayToList() {
        fail("Not yet implemented"); // TODO test utilities arraytolist
    }

    @Test
    public void testGcd() {

        // Tests boundary cases of 0 and 1.
        assertEquals(1, Utilities.gcd(1, 7));
        assertEquals(7, Utilities.gcd(0, 7));
        assertEquals(0, Utilities.gcd(0, 0));

        // Tests relatively prime numbers.
        assertEquals(1, Utilities.gcd(3, 7));
        assertEquals(1, Utilities.gcd(9, 22));
        assertEquals(1, Utilities.gcd(44, 45));

        // Tests numbers with a common factor.
        assertEquals(2, Utilities.gcd(4, 6));
        assertEquals(3, Utilities.gcd(9, 15));
        assertEquals(5, Utilities.gcd(5, 50));

    }

    @Test
    public void testLcm() {

        // Tests boundary cases of 1.
        assertEquals(7, Utilities.lcm(1, 7));
        assertEquals(7, Utilities.lcm(0, 7));
        assertEquals(0, Utilities.lcm(0, 0));

        // Tests relatively prime numbers.
        assertEquals(21, Utilities.lcm(3, 7));
        assertEquals(198, Utilities.lcm(9, 22));
        assertEquals(1980, Utilities.lcm(44, 45));

        // Tests numbers with a common factor.
        assertEquals(12, Utilities.lcm(4, 6));
        assertEquals(45, Utilities.lcm(9, 15));
        assertEquals(50, Utilities.lcm(5, 50));

    }

    @Test
    public void testFlatten() {
        fail("Not yet implemented"); // TODO test utilities flatten
    }

    @Test
    public void testComputeTicksPerBeat() {
        fail("Not yet implemented"); // TODO test utilities computeticksperbeat
    }

    @Test
    public void testGetReadyToAddItems() {
        fail("Not yet implemented"); // TODO test utilities getreadytoadditems
    }

}
