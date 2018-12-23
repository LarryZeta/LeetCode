package easy._303;

/**
 * @author zly
 *
 * Range Sum Query - Immutable
 *
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 *
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 *
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * Note:
 * You may assume that the array does not change.
 * There are many calls to sumRange function.
 */

class NumArray {

/** 2D dp, timeout*/
//    private int[] nums;
//
//    private int[][] dp;
//
//    public NumArray(int[] nums) {
//
//        this.nums = nums;
//        this.dp = new int[nums.length][nums.length];
//
//        for (int i = 0; i < nums.length; i ++) dp[i][i] = nums[i];
//
//        for (int j = 1; j < nums.length; j ++)
//            for (int i = 0; i + j < nums.length; i ++)
//                dp[i][i + j] = dp[i][i + j - 1] + dp[i + j][i + j];
//
//
//    }
//
//    public int sumRange(int i, int j) { return dp[i][j]; }


    private int[] sum;

    public NumArray(int[] nums) {

        this.sum = new int[nums.length + 1];

        if (this.sum.length < 2) return;

        for (int i = 1; i < sum.length; i ++) sum[i] = sum[i - 1] + nums[i - 1];

    }

    public int sumRange(int i, int j) { return sum[j + 1] - sum[i];}

}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */