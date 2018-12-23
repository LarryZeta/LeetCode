package easy._349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zly
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Note:
 *
 * Each element in the result must be unique.
 * The result can be in any order.
 */

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        Set<Integer> set = new HashSet<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) i ++;
            else if (nums1[i] > nums2[j]) j ++;
            else {
                set.add(nums1[i]);
                i ++;
                j ++;
            }
        }

        int[] ret = new int[set.size()];
        i = 0;
        for (int k : set) ret[i ++] = k;

        return ret;
    }

}
