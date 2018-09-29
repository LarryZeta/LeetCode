package me.zly.mideum._22;

import java.util.ArrayList;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 *      [
 *        "((()))",
 *        "(()())",
 *        "(())()",
 *        "()(())",
 *        "()()()"
 *      ]
 */

public class GenerateParentheses {

    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> strings = new ArrayList<>();
        if (n == 0) return strings;

        dfs(0, 0, "", strings, n);

        return strings;
    }

    private void dfs(int left, int right, String buffer, ArrayList<String> strings, int n) {

        if (left == n && right == n) {
            strings.add(buffer);
            return;
        }

        if (left < n) {
            dfs(left + 1, right, buffer + "(", strings, n);
        }

        if (left > right) {
            dfs(left, right + 1, buffer + ")", strings, n);
        }

    }

}