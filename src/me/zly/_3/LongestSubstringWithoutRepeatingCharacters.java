package me.zly._3;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int lenth = 0;
        for (int i = 0; i < s.length(); i ++) {
            for (int j = i ; j < s.length(); j ++) {
                String substr = s.substring(i, j + 1);
                HashSet<Character> substrhs = new HashSet<Character>();
                int l = substr.length();
                for (int k = 0; k < l; k ++) {
                    substrhs.add(substr.charAt(k));
                }
                if (l == substrhs.size()) {
                    if (lenth < l){
                        lenth = l;
                    }
                }
                else {
                    break;
                }
            }
        }
        return lenth;
    }

}
