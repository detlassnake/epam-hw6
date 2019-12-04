package ua.epam.hw6;

/*Task 4
The set S originally contains numbers from 1 to n.
But unfortunately, due to the data error,
one of the numbers in the set got duplicated to another number in the set,
which results in repetition of one number and loss of another number.
Given an array nums representing the data status of this set after the error.
Your task is to firstly find the number occurs twice and then find the number that is missing.
Return them in the form of an array.
Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]
*/

public class ErrorNum {
    public int[] errorNumber(int[] arr) {
        if (arr == null) {
            return new int[]{};
        }
        int dup = -1;
        int missing = -1;
        for (int i = 1; i <= arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                dup = i;
            } else if (count == 0) {
                missing = i;
            }
        }
        return new int[] {dup, missing};
    }
}
