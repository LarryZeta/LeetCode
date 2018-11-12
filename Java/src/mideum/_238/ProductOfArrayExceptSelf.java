package mideum._238;

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

        if (nums == null || nums.length == 0) return new int[0];

        int[] sequence  = new int[nums.length];
        int[] reverse = new int[nums.length];
        sequence[0] = nums[0];
        reverse[reverse.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < sequence.length; i ++) sequence[i] = sequence[i - 1] * nums[i];
        for (int i = reverse.length - 2; i >= 0; i --) reverse[i] = reverse[i + 1] * nums[i];

        int[] output = new int[nums.length];
        output[0] = reverse[1];
        output[output.length - 1] = sequence[sequence.length - 2];
        for (int i = 1; i < output.length - 1; i ++) output[i] = sequence[i - 1] * reverse[i + 1];

        return output;

    }

}
