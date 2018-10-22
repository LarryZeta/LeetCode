package me.zly.easy._387;

/**
 * @author zly
 *
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */

public class FirstUniqueCharacterInAStringWithoutHashMap {

    public int firstUniqChar(String s) {

        if (s == null || s.length() == 0) return -1;

        int loc = -1;
        for (char ch = 'a'; ch <= 'z'; ch ++) {
            int index = s.indexOf(ch);
            if (index != -1 && index == s.lastIndexOf(ch)) loc = loc == -1 ? index : Math.min(loc, index);
        }

        return loc;

    }

}
