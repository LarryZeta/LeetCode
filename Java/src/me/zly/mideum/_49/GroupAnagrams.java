package me.zly.mideum._49;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author zly
 *
 * Given an array of strings, group anagrams together.
 *
 * Example:
 *
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * Note:
 *
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> lists = new ArrayList<>();

        if (strs == null || strs.length == 0) return lists;

        Map<String, List> map = new HashSet<String, List>();

        return new ArrayList<>();

    }


}
