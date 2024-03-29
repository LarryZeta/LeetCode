package easy._66;

/**
 * @author Larry
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

public class PlusOneOpt {

    public int[] plusOne(int[] digits) {

        int length = digits.length;

        for (int i = length - 1; i > -1; i --) {
            if (digits[i] == 9) digits[i] = 0;
            else {
                digits[i] ++;
                return digits;
            }
        }

        int[] ints = new int[length + 1];
        ints[0] = 1;
        return ints;

    }

}
