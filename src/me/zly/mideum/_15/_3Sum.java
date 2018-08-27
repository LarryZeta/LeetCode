package me.zly.mideum._15;

import java.util.*;

/**
 * @author zly
 *
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 *
 * Note:
 *
 * The solution set must not contain duplicate triplets.
 *
 * Example:
 *
 *        Given array nums = [-1, 0, 1, 2, -1, -4],
 *
 *        A solution set is:
 *        [
 *          [-1, 0, 1],
 *          [-1, -1, 2]
 *        ]
 */

// TODO
public class _3Sum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i ++) {
            for (int j = i + 1; j < nums.length - 1; j ++) {
                for (int k = j + 1; k < nums.length; k ++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new Vector<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        lists.add(list);
                    }
                }
            }
        }

        return lists;

    }

}
