package mideum._53;

/**
 * @author Larry
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 *        Input: [-2,1,-3,4,-1,2,1,-5,4],
 *        Output: 6
 *        Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 * Follow up:
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        int max = nums[0];
        int value = 0;

        for (int i = 0; i < nums.length; i ++) {
            value = value + nums[i];
            if (value > max) {
                max = value;
            }
            if (value < 0) {
                value = 0;
            }
        }

        return max;

    }

}
