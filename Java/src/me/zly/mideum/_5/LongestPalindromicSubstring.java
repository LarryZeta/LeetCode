package me.zly.mideum._5;

/**
 * @author zly
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

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        if (s == null || s.length() == 0) return "";

        char initial;
        int begin = 0;
        int end = 1;
        int sublength = 1;
        int length = s.length();

        for (int i = 0; i < length; i ++) {
            initial = s.charAt(i);
            for (int j = length - 1; j > i; j --) {
                if (s.charAt(j) == initial) {
                    if (isPalindromic(s.substring(i + 1, j))) {
                        if (j + 1 - i > sublength){
                            sublength = j + 1 - i;
                            begin = i;
                            end = j + 1;
                        }
                        break;
                    }
                }
            }
        }

        return s.substring(begin, end);

    }

    public boolean isPalindromic(String s) {

        int length = s.length();

        if (length == 0) return true;

        for (int i = 0; i < length / 2; i ++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) return false;
        }

        return true;

    }

}
