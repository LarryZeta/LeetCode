package me.zly._3;

// Given a string, find the length of the longest substring without repeating characters.
//
// Examples:
//
//        Given "abcabcbb", the answer is "abc", which the length is 3.
//
//        Given "bbbbb", the answer is "b", with the length of 1.
//
//        Given "pwwkew", the answer is "wke", with the length of 3.
//
//

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        int lenth = 0;

        for (int i = 0; i < s.length(); i ++) {
            for (int j = i ; j < s.length(); j ++) {
                String substr = s.substring(i, j + 1);
                HashSet<Character> substrhs = new HashSet<>();
                int l = substr.length();
                for (int k = 0; k < l; k ++) {
                    substrhs.add(substr.charAt(k));
                }
                if (l == substrhs.size()) {
                    if (lenth < l){
                        lenth = l;
                    }
                } else {
                    break;
                }
            }
        }

        return lenth;
    }

}
