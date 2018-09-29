package me.zly.hard._4;

/**
 * author zly
 *
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * You may assume nums1 and nums2 cannot be both empty.
 *
 * Example 1:
 *       nums1 = [1, 3]
 *       nums2 = [2]
 *
 *       The median is 2.0
 *
 * Example 2:
 *        nums1 = [1, 2]
 *        nums2 = [3, 4]
 *
 *        The median is (2 + 3)/2 = 2.5
 */

// TODO Optimization from O(m + n) to O(log(m + n))
public class MedianofTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int length = m + n;
        int[] array = new int[length];
        int i = 0;
        int j = 0;
        int k = 0;

         while (j < m && k < n) {
            if (nums1[j] < nums2[k]) {
                array[i] = nums1[j];
                j ++;
            } else {
                array[i] = nums2[k];
                k ++;
            }
            i ++;
        }

        while (j < m) {
            array[i] = nums1[j];
            j ++;
            i ++;
        }

        while (k < n) {
            array[i] = nums2[k];
            k ++;
            i ++;
        }

        if (length % 2 == 1) return array[length / 2];
        else return (double)(array[length / 2 - 1] + array[length / 2]) / 2;
    }

}
