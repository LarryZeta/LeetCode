package mideum._209;

import java.util.Arrays;

public class Solution {

    public int minSubArrayLen(int target, int[] nums) {

        int sum = nums[0];

        int length = nums.length + 1;

        for (int start = 0, end = 0; end < nums.length; ) {
            if (sum >= target) {
                length = Math.min(length, end - start + 1);
                sum = sum - nums[start];
                start ++;
                if (start > end) {
                    end ++;
                    if (end < nums.length) {
                        sum = sum + nums[end];
                    }
                }
            } else {
                end ++;
                if (end < nums.length) {
                    sum = sum + nums[end];
                }
            }
        }

        if (length == nums.length + 1) {
            return 0;
        }

        return length;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().minSubArrayLen(15, new int[]{ 1,2,3,4,5 }));
    }

}
