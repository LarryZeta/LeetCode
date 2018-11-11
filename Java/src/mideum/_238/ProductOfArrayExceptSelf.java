package mideum._238;

import java.math.BigInteger;

/**
 * @author zly
 *
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *
 * Example:
 *
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 * Note: Please solve it without division and in O(n).
 *
 * Follow up:
 * Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 */

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        long product = 1;
        for (int i = 0; i < nums.length; i ++) product = product * nums[i];

        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i ++) if (nums[i] != 0) output[i] = (int) (product /(long) nums[i]);

        return output;

    }

}
