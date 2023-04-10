package hard._32;

import java.util.Stack;

public class StackSolution {
    public int longestValidParentheses(String s) {

        int max = 0;

        if (s == null || s.isEmpty()) {
            return max;
        }

        for ( int i = 0; i < s.length(); i ++) {
            for ( int j = s.length(); j >= i; j --) {
                boolean valid = isValid(s.substring(i, j));
                if (valid && max < j - i ) {
                    max = j - i;
                }
            }
        }

        return max;
    }

    boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if ('(' == c) {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty();

    }

}
