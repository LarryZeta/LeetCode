package easy._290;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Larry
 *
 * Given a pattern and a string str, find if str follows the same pattern.
 *
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 *
 * Example 1:
 *
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 * Example 2:
 *
 * Input:pattern = "abba", str = "dog cat cat fish"
 * Output: false
 * Example 3:
 *
 * Input: pattern = "aaaa", str = "dog cat cat dog"
 * Output: false
 * Example 4:
 *
 * Input: pattern = "abba", str = "dog dog dog dog"
 * Output: false
 * Notes:
 * You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 */

public class WordPattern {

    public boolean wordPattern(String pattern, String str) {

        String[] strs = str.split(" ");
        if (pattern.length() != strs.length) return false;

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i ++) {
            char charAt = pattern.charAt(i);
            if (map.containsKey(charAt)) {
                if (!map.get(charAt).equals(strs[i])) return false;
            } else if (map.containsValue(strs[i])) return false;
            else map.put(charAt, strs[i]);
        }

        return true;

    }

}
