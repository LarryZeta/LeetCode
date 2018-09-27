package me.zly.easy._169;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author zly
 *
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */

public class MajorityElement {

    public int majorityElement(int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        Arrays.sort(nums);

        int val = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != val) {
                val = nums[i];
                count = 1;
            } else ++ count;

            if (count > nums.length / 2) return val;
        }

        return 0;

    }

}