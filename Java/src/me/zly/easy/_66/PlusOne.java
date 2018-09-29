package me.zly.easy._66;

/**
 * @author zly
 *
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *        Input: [1,2,3]
 *        Output: [1,2,4]
 *        Explanation: The array represents the integer 123.
 *
 * Example 2:
 *        Input: [4,3,2,1]
 *        Output: [4,3,2,2]
 *        Explanation: The array represents the integer 4321.
 */

public class PlusOne {

    public int[] plusOne(int[] digits) {

        int length = digits.length;

        digits[length - 1] ++;

        for (int i = 1; i < length; i ++) {
            if (digits[length - i] == 10) {
                ++ digits[length - i - 1];
                digits[length - i] = 0;
            }
            else break;
        }

        if (digits[0] == 10) {
            int[] d = new int[length + 1];
            d[0] = 1;
            return d;
        }

        return digits;

    }

}

