package me.zly.easy._387;

import java.util.HashMap;

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

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {

        if (s == null || s.length() == 0) return -1;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i ++) {

            if (hashMap.containsKey(chars[i])) hashMap.replace(chars[i], 1, 0);

            else hashMap.put(chars[i], 1);

        }

        for (int i = 0; i < chars.length; i ++) if (hashMap.get(chars[i]) == 1) return i;

        return -1;

    }

}
