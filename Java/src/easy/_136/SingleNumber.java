package easy._136;

import java.util.Arrays;

/**
 * @author Larry
 *
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */

public class SingleNumber {

    public int singleNumber(int[] nums) {

        Arrays.sort(nums);

        int i;
        for (i = 0; i < nums.length - 1; i = i + 2) {
            if (nums[i] != nums[i + 1]) return nums[i];
        }

        return nums[i];

    }

}
