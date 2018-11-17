package easy._205;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zly
 *
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 *
 * Example 1:
 *
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 *
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 *
 * Input: s = "paper", t = "title"
 * Output: true
 * Note:
 * You may assume both s and t have the same length.
 */

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();
        for (int i = 0; i < s.length(); i ++) {
            if (!sToT.containsKey(s.charAt(i))) sToT.put(s.charAt(i), t.charAt(i));
            else if (sToT.get(s.charAt(i)) != t.charAt(i)) return false;

            if (!tToS.containsKey(t.charAt(i))) tToS.put(t.charAt(i), s.charAt(i));
            else if (tToS.get(t.charAt(i)) != s.charAt(i)) return false;
        }

        return true;

    }

}
