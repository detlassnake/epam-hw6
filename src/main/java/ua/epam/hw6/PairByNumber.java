package ua.epam.hw6;

import java.util.HashMap;

/*
* Task 2
Given an array of integers and an integer k,
*  find out whether there are two distinct indices i and j in the array such
* that nums[i] = nums[j] and the absolute difference between i and j is at most k.
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/

public class PairByNumber {
    public boolean findPair(int arr[], int k) {
        if (arr == null) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++){
            if (map.containsKey(arr[i])) {
                int previous = map.get(arr[i]);

                if (i - previous <= k) {
                    return true;
                }
            }
            map.put(arr[i], i);
        }
        return false;
    }
}
