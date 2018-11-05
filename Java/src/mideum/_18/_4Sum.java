package mideum._18;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zly
 *
 * Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 *
 * Note:
 *
 * The solution set must not contain duplicate quadruplets.
 *
 * Example:
 *
 * Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
 *
 * A solution set is:
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 */

public class _4Sum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> lists = new LinkedList<>();

        if (nums.length < 4) return lists;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i ++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j ++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {

                    int value = nums[i] + nums[j] + nums[k] + nums[l];

                    if (value < target) k ++;
                    else if (value > target) l --;
                    else {
                        lists.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        while (k < l && nums[k] == nums[k + 1])  k ++;
                        while (k < l && nums[l] == nums[l - 1])  l --;
                        k ++;
                        l --;
                    }

                }

            }
        }

        return lists;

    }

}
