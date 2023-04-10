package easy._242;

import java.util.Arrays;

/**
 * @author Larry
 *
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 * Note:
 * You may assume the string contains only lowercase alphabets.
 *
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] stoArray = s.toCharArray();
        char[] ttoArray = t.toCharArray();
        Arrays.sort(stoArray);
        Arrays.sort(ttoArray);

        for (int i = 0; i < stoArray.length; i ++) {
            if (stoArray[i] != ttoArray[i]) return false;
        }

        return true;
    }

}
