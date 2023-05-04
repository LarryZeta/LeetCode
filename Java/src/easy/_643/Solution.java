package easy._643;

/**
 * @author Larry
 *
 */

public class Solution {

    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        for (int i = 0; i < k; i ++) {
            sum = sum + nums[i];
        }

        int newSum = sum;
        for (int i = 0; i < nums.length - k; i ++) {
            newSum = newSum - nums[i] + nums[i + k];
            if (newSum > sum) {
                sum = newSum;
            }
        }

        return sum * 1.0 / k;
    }

}
