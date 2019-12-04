package ua.epam.hw6Test;

import org.junit.Test;
import ua.epam.hw6.ErrorNumber;
import static org.junit.Assert.assertArrayEquals;

public class ErrorNumberTest {
    int[] input = {1,2,2,4};
    int[] nullInput;
    int[] result = {2,3};
    ErrorNumber errorNumber = new ErrorNumber();

    @Test
    public void testErrorNum() {
        assertArrayEquals(errorNumber.errorDuplicatedNumber(input), result);
    }

    @Test
    public void testErrorNumByNull() {
        assertArrayEquals(errorNumber.errorDuplicatedNumber(nullInput), new int[]{});
    }
}
