package me.zly.mideum._3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zly
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 *
 *        Given "abcabcbb", the answer is "abc", which the length is 3.
 *
 *        Given "bbbbb", the answer is "b", with the length of 1.
 *
 *        Given "pwwkew", the answer is "wke", with the length of 3.
 */

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) return 0;

        int sublength = 0;
        int i = 0, j = 0;
        char[] toCharArray = s.toCharArray();
        Set<Character> set = new HashSet<>();

        while (i < toCharArray.length && j < toCharArray.length) {
            if (!set.contains(toCharArray[j])) {
                set.add(toCharArray[j ++]);
                sublength = Math.max(sublength, j - i);
            } else set.remove(toCharArray[i ++]);
        }

        return sublength;

    }

}
