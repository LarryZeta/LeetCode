package me.zly.mideum._34;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author zly
 *
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */

public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {

        int begin = -1;
        int end = -1;

        if (nums.length == 0) return new int[] {begin, end};

        int i = 0;
        int j = nums.length - 1;
        int mid;
        while (i <= j) {
            mid = i + (j - i) / 2;
            if (nums[mid] > target) j = mid - 1;
            else if (nums[mid] < target) i = mid + 1;
            else {
                begin = mid;
                end = mid;
                break;
            }
        }

        if (begin != -1) {

            while (begin > 0 && nums[begin - 1] == nums[begin]) begin --;

            while (end < nums.length - 1 && nums[end + 1] == nums[end]) end ++;

        }

        return new int[] { begin, end };

    }

}
