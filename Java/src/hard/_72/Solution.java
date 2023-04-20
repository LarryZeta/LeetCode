package hard._72;

import java.util.stream.Stream;

/**
 * @author Larry
 *
 */
public class Solution {

    public int minDistance(String word1, String word2) {

        if (word1 == null && word2 == null) {
            return 0;
        }
        if (word1 == null || "".equals(word1)) {
            return word2.length();
        }
        if (word2 == null || "".equals(word2)) {
            return word1.length();
        }

        int[][] dp = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 0; i <= word1.length(); i ++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= word2.length(); j ++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= word1.length(); i ++) {
            for (int j = 1; j <= word2.length(); j ++) {
                int diff = word1.charAt(i - 1) == word2.charAt(j - 1) ? 0 : 1;
                dp[i][j] =  Stream.of(
                        dp[i - 1][j] + 1,
                                dp[i][j - 1] + 1,
                                dp[i - 1][j - 1] + diff
                        ).reduce(Integer::min).get();
            }
        }

        return dp[word1.length()][word2.length()];
    }

    public static void main(String[] args) {
//        int re = new Solution().minDistance("intention", "execution");

        int re = new Solution().minDistance("pneumonoultramicroscopicsilicovolcanoconiosis", "ultramicroscopically");
        System.out.println(re);
    }

}
