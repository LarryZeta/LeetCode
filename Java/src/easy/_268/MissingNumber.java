package easy._268;

/**
 * @author Larry
 *
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Example 1:
 *
 * Input: [3,0,1]
 * Output: 2
 * Example 2:
 *
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */

public class MissingNumber {

    public int missingNumber(int[] nums) {

        if (nums == null || nums.length == 0) return 0;
        int length = nums.length;
        int sum = (1 + length) * length / 2;

        int count = 0;
        for (int i = 0; i < nums.length; i ++) count = count + nums[i];

        return sum - count;

    }

}
