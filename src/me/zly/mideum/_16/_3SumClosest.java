package me.zly.mideum._16;

import java.util.Arrays;


/**
 * @author zly
 *
 * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 *
 * Example:
 *
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 *
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */

public class _3SumClosest {

    public int threeSumClosest(int[] nums, int target) {

        if (nums.length < 3) return 0;

        Arrays.sort(nums);

        int ret = nums[0] + nums[1] + nums[2];
        int min = Math.abs(ret - target);

        for (int i = 0; i < nums.length - 2; i ++) {

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                int value = nums[i] + nums[j] + nums[k];

                if (value < target) ++ j;
                else if (value > target) -- k;
                else return target;

                int diff = Math.abs(value - target);
                if (diff < min) { ret = value; min = diff;}
            }
        }

        return ret;

    }

}
