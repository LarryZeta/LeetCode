package hard._32;

public class DPSolution {

    public int longestValidParentheses(String s) {

        int max = 0;

        int[] dp = new int[s.length()];

        for ( int i = 1; i < s.length(); i ++) {

            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    if (i == 1) {
                        dp[i] = 2;
                    } else {
                        dp[i] = dp[ i - 2 ] + 2;
                    }
                }

                if (s.charAt(i - 1) == ')') {
                    // 隔过中间的有效字串的前一个位置
                    int pre = i - dp[i - 1] - 1;
                    if (pre >= 0 && s.charAt( pre ) == '(') {

                        // pre 位置之前的最长字串长度
                        int preFixLength = 0;
                        int preFixEndIndex = i - dp[ i - 1 ] - 2;
                        if (preFixEndIndex > 0) {
                            preFixLength = dp[preFixEndIndex];
                        }

                        dp[i] = dp[i - 1] + 2 + preFixLength;
                    }

                }

                if (dp[i] > max) {
                    max = dp[i];
                }
            }

        }

        return max;

    }


    public static void main(String[] args) {
        int v = new DPSolution().longestValidParentheses("(()())");
        System.out.printf(String.valueOf(v));
    }

}
