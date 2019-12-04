package ua.epam.hw6Test;

import org.junit.Test;
import ua.epam.hw6.Duplicates;
import static org.junit.Assert.assertEquals;

public class DuplicatesTest {
    int[] input = {1,1,1,3,3,4,3,2,4,2};
    int[] nullInput;
    boolean result = true;
    Duplicates duplicates = new Duplicates();

    @Test
    public void testDuplicates() {
        assertEquals(duplicates.boolDuplicates(input), result);
    }

    @Test
    public void testDuplicatesByNull() {
        assertEquals(duplicates.boolDuplicates(nullInput), false);
    }
}
