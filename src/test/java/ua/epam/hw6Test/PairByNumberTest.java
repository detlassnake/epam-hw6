package ua.epam.hw6Test;

import org.junit.Test;
import ua.epam.hw6.PairByNumber;
import static org.junit.Assert.assertEquals;

public class PairByNumberTest {
    int[] input = {1,2,3,1,2,3};
    int[] nullInput;
    int k = 2;
    boolean result = false;
    PairByNumber pairByNumber = new PairByNumber();

    @Test
    public void testPairByNumber() {
        assertEquals(pairByNumber.findPair(input,k),result);
    }
    @Test
    public void testPairByNumberByNull() {
        assertEquals(pairByNumber.findPair(nullInput,k),result);
    }
}
