package ua.epam.hw6Test;

import org.junit.Test;
import ua.epam.hw6.ErrorNum;
import static org.junit.Assert.assertArrayEquals;

public class ErrorNumTest {
    int[] input = {1,2,2,4};
    int[] nullInput;
    int[] result = {2,3};
    ErrorNum errorNum = new ErrorNum();

    @Test
    public void testErrorNum() {
        assertArrayEquals(errorNum.errorNumber(input), result);
    }

    @Test
    public void testErrorNumByNull() {
        assertArrayEquals(errorNum.errorNumber(nullInput), new int[]{});
    }
}
