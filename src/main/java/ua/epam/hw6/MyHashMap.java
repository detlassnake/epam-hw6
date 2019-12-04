package ua.epam.hw6;

import java.util.Arrays;

/*Task 5
Design a HashMap without using any built-in hash table libraries.
To be specific, your design should include these functions:
put(key, value) : Insert a (key, value) pair into the HashMap. If the value already exists in the HashMap, update the value.
get(key): Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
remove(key) : Remove the mapping for the value key if this map contains the mapping for the key.
*/

public class MyHashMap {
    int[] map;

    public MyHashMap() {
        map = new int[1000001];
        Arrays.fill(map,-1);
    }

    public int get(int key) {
        return map[key];
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public void remove(int key) {
        map[key] = -1;
    }
}
