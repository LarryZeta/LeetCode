package me.zly.hard._10;

/**
 * @author zly
 *
 * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.
 *
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 *
 * Note:
 *
 *     s could be empty and contains only lowercase letters a-z.
 *     p could be empty and contains only lowercase letters a-z, and characters like . or *.
 *
 * Example 1:
 *        Input:
 *        s = "aa"
 *        p = "a"
 *        Output: false
 *        Explanation: "a" does not match the entire string "aa".
 *
 * Example 2:
 *         Input:
 *         s = "aa"
 *         p = "a*"
 *         Output: true
 *         Explanation: '*' means zero or more of the precedeng element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
 *
 * Example 3:
 *        Input:
 *        s = "ab"
 *        p = ".*"
 *        Output: true
 *        Explanation: ".*" means "zero or more (*) of any character (.)".
 *
 * Example 4:
 *        Input:
 *        s = "aab"
 *        p = "c*a*b"
 *        Output: true
 *        Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore it matches "aab".
 *
 * Example 5:
 *        Input:
 *        s = "mississippi"
 *        p = "mis*is*p*."
 *        Output: false
 */

// TODO
public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {

        if (s == null || p == null || s.isEmpty() || p.isEmpty()) return false;

        int slength = s.length();
        int plength = p.length();
        int i = 0;
        int j = 0;

        while (i < slength && j < plength) {
            char scharAt = s.charAt(i);
            char pcharAt = p.charAt(j);
            if (scharAt == pcharAt || pcharAt == '.') {
                ++ i;
                ++ j;
            } else if (pcharAt == '*' && j - 1 >= 0) {
                char previous = p.charAt(j - 1);
                if (scharAt == previous || previous == '.') ++ i;
                else ++ j;
            } else if (j + 1 < plength) {
                if(p.charAt(j + 1) == '*') j += 2;
            } else return false;
        }

        if (i == slength && j == plength) return true;
        else if (i == slength && j == plength - 1 && p.charAt(j) == '*') return true;
        else return false;

    }

}
