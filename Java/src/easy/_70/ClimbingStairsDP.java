package easy._70;

/**
 * @author Larry
 * <a href="https://leetcode.cn/problems/climbing-stairs/">LeetCode</a>
 */

public class ClimbingStairsDP {

    public int climbStairs(int n) {
        // t[i] = t[i-1] + t[i-2]
        int[] dp = new int[3];

        dp[0] = 1;
        dp[1] = 2;

        for (int i = 3; i <= n; i ++) {
            dp[2] = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }

        return dp[2];
    }

}
