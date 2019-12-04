package ua.epam.hw6Test;

import org.junit.Test;
import ua.epam.hw6.Candies;
import static org.junit.Assert.assertEquals;

public class CandiesTest {
    int[] input = {1,1,2,2,3,3};
    int[] nullInput;
    int result = 3;
    Candies candies = new Candies();

    @Test
    public void testCandies() {
        assertEquals(candies.kindOfCandies(input),result);
    }

    @Test
    public void testCandiesByNull() {
        assertEquals(candies.kindOfCandies(nullInput),-1);
    }

}
