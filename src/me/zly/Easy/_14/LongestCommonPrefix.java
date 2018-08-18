package me.zly.Easy._14;

// Write a function to find the longest common prefix string amongst an array of strings.
//
// If there is no common prefix, return an empty string "".
//
// Example 1:
//        Input: ["flower","flow","flight"]
//        Output: "fl"
//
// Example 2:
//        Input: ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.
//
// Note:
//        All given inputs are in lowercase letters a-z.

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        int minlenth = strs[0].length();

        for (int i = 0; i < strs.length; i ++) {
            int length = strs[i].length();
            if (length < minlenth) {
                minlenth = length;
            }
        }

        if (minlenth == 0) {
            return "";
        }

        for (int i = 0; i < minlenth; i ++) {
            for (int j = 0; j < strs.length; j ++) {
                if (strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0].substring(0, minlenth);

    }

}
