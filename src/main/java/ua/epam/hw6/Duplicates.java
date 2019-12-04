package ua.epam.hw6;

import java.util.HashSet;

/*Task 1
Given an array of integers, find if the array contains any duplicates.
Your function should return true if any value appears at least twice in the array,
 and it should return false if every element is distinct.
Example 1:
Input: [1,2,3,1]
Output: true
Example 2:
Input: [1,2,3,4]
Output: false
Example 3:
Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
*/

public class Duplicates {
    public boolean boolDuplicates(int arr[]) {
        if (arr == null) {
            return false;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i=0; i<arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
