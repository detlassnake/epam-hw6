package ua.epam.hw6Test;

import org.junit.Before;
import org.junit.Test;
import ua.epam.hw6.MyHashMap;
import static org.junit.Assert.assertEquals;

public class MyHashMapTest {
    MyHashMap hashMap = new MyHashMap();

    @Before
    public void setUp() {
        hashMap.put(1, 1);
        hashMap.put(2, 2);
    }

    @Test
    public void testMyHashMap1() {
        setUp();
        assertEquals(hashMap.get(1),1);
    }

    @Test
    public void testMyHashMap2() {
        setUp();
        assertEquals(hashMap.get(3),-1);
    }

    @Test
    public void testMyHashMap3() {
        setUp();
        hashMap.put(2, 1);
        assertEquals(hashMap.get(2),1);
    }

    @Test
    public void testMyHashMap4() {
        setUp();
        hashMap.remove(2);
        assertEquals(hashMap.get(2),-1);
    }
}
