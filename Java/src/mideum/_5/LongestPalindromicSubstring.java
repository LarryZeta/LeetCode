package mideum._5;

/**
 * @author Larry
 *
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Example 1:
 *        Input: "babad"
 *        Output: "bab"
 *        Note: "aba" is also a valid answer.
 *
 * Example 2:
 *        Input: "cbbd"
 *        Output: "bb"
 */

/**
 * Time limit exceeded.
 */

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        if (s == null || s.length() == 0 || s.length() == 1) return s;

        boolean[][] dp = new boolean[s.length() - 1][s.length()];

        for (int i = 0; i < s.length() - 1; i ++) {
            dp[i][i] = true;
            dp[i][i + 1] = s.charAt(i) == s.charAt(i + 1);
        }

        for (int j = 2; j < s.length() - 1; j ++)
            for (int i = 0; i + j < s.length(); i ++) dp[i][i + j] = dp[i + 1][i + j - 1] && s.charAt(i) == s.charAt(i + j);


        int length = 0;
        String ans = s.substring(0, 1);
        for (int i = 0; i < s.length() - 1; i ++) {
            for (int j = s.length() - 1; j > i; j --) {
                if (dp[i][j] && j + 1 - i > length) {
                    length = j - i;
                    ans = s.substring(i, j + 1);
                }
            }
        }

        return ans;

    }

}
