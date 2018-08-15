package me.zly.Easy._88;

import java.util.Queue;
import java.util.SortedSet;
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

        int min = Math.min(m, n);
        int[] tmp = new int[m];
        int j = 0;
        int k = 0;

        for (int i = 0; i < m; i ++) {
            tmp[i] = nums1[i];
        }

        int i = 0;
        while (j < m && k < n) {
            if (tmp[j] > nums2[k]) {
                nums1[i] = nums2[k];
                ++ k;
            } else {
                nums1[i] = tmp[j];
                ++ j;
            }
            ++ i;
        }

        while (j < m) {
            nums1[i] = tmp[j];
            ++ j;
            ++ i;
        }

        while (k < n) {
            nums1[i] = nums2[k];
            ++ k;
            ++ i;
        }

    }


}
