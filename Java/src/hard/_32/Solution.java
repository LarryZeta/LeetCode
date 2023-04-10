package hard._32;

public class Solution {

    public int longestValidParentheses(String s) {

        int max = 0;

        char[] chars = s.toCharArray();

        int left = 0;
        int right = 0;

        for (char c : chars) {

            if (c == '(') {
                left++;
            } else {
                right++;
                if (right > left) {
                    left = 0;
                    right = 0;
                }
                if (left == right) {
                    max = Math.max(left * 2, max);
                }
            }

        }

        left = 0;
        right = 0;

        for (int i = chars.length - 1; i >= 0; i --) {

            if (chars[i] == ')') {
                right ++;
            } else {
                left ++;
                if (left > right) {
                    left = 0;
                    right = 0;
                }
                if (left == right) {
                    max = Math.max(left * 2, max);
                }
            }

        }


        return max;

    }

}
