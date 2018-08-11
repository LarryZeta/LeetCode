package me.zly.Easy._88;

import java.util.Queue;
import java.util.Stack;

// Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//
// Note:
//
// The number of elements initialized in nums1 and nums2 are m and n respectively.
// You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
//
// Example:
//
//        Input:
//        nums1 = [1,2,3,0,0,0], m = 3
//        nums2 = [2,5,6],       n = 3
//
//        Output: [1,2,2,3,5,6]
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        Stack<Integer> stack = new Stack<>();
        int j = 0, k = 0;

        for (int i = 0; i < m + n; i ++) {
            if (nums1[j] < nums2[k] && j < m) {
                stack.push(nums1[j]);
                ++ j;
            } else {
                stack.push(nums2[k]);
                ++ k;
            }
        }

        for (int i = m + n - 1; i >= 0; i --) {
            nums1[i] = stack.pop();
        }

    }

}
