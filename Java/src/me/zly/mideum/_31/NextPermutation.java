package me.zly.mideum._31;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author zly
 *
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 *
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 *
 * The replacement must be in-place and use only constant extra memory.
 *
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 *
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 */

// TODO
public class NextPermutation {

    public void nextPermutation(int[] nums) {

        if (nums.length == 0) return;
        int i = nums.length - 2;
        while (i >= 0 && nums[i] > nums[i + 1]) i --;


        int value = nums[i - 1];
        int j = i - 1;
        while (nums[i] < value) i ++;

//        swap(nums[j], i + 1);
        nums[j] = nums[i + 1];
        nums[i + 1] = value;

    }

}
