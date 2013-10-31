package tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import music.Utilities;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests some relevant utility methods that are used in other classes.
 * 
 */
public class UtilitiesTest {
    ArrayList<Integer> emptyIntegerList;
    List<Character> alphabetLoopList;
    final Character[] alphabetLoop = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a',
            'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

    @Before
    public void setUp() {
        emptyIntegerList = new ArrayList<>();
        alphabetLoopList = new ArrayList<>(Arrays.asList(alphabetLoop));
    }

    /**
     * Tests that the Utilities class's copyList method works properly by
     * copying ArrayLists and comparing them to the original. Tests both lists
     * of size zero and lists with large sizes.
     */
    @Test
    public void testCopyList() {
        List<Integer> copyIntegerList = Utilities.copyList(emptyIntegerList);
        assertEquals(copyIntegerList, emptyIntegerList);

        List<Character> copyAlphabetList = Utilities.copyList(alphabetLoopList);
        assertEquals(copyAlphabetList, alphabetLoopList);

    }

    /**
     * Tests that the Utilities class's arrayToList method works properly by
     * converting arrays into ArrayLists and comparing the Array backing the
     * List with the original array.Tests both lists of size zero and lists with
     * large sizes.
     */
    @Test
    public void testArrayToList() {
        List<Integer> copyIntegerList = Utilities.arrayToList(new Integer[] {});
        assertArrayEquals(copyIntegerList.toArray(), new Integer[] {});

        List<Character> copyAlphabetList = Utilities.arrayToList(alphabetLoop);
        assertArrayEquals(copyAlphabetList.toArray(), alphabetLoop);
    }

    /**
     * Tests the Utilities.gcd method with integers. Partition space split as
     * follows: a>b a=b a<b a=0, b>0 a>0, b>0, relatively prime numbers, common
     * factors, boundary cases of 0 and 1
     */
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

    /**
     * Tests the Utilities.lcm method with integers. Partition space split as
     * follows: a>b a=b a<b a=0, b>0 a>0, b>0, numbers with common factors,
     * boundary case of 1, relatively prime numbers
     */
    @Test
    public void testLcm() {

        // Tests boundary cases of 1.
        assertEquals(7, Utilities.lcm(1, 7));

        // Tests relatively prime numbers.
        assertEquals(21, Utilities.lcm(3, 7));
        assertEquals(198, Utilities.lcm(9, 22));
        assertEquals(1980, Utilities.lcm(44, 45));

        // Tests numbers with a common factor.
        assertEquals(12, Utilities.lcm(4, 6));
        assertEquals(45, Utilities.lcm(9, 15));
        assertEquals(50, Utilities.lcm(5, 50));

    }

}
