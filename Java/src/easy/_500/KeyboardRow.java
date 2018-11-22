package easy._500;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author zly
 *
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 *
 *
 * American keyboard
 *
 *
 * Example 1:
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 *
 * Note:
 *      1.You may use one character in the keyboard more than once.
 *      2.You may assume the input string will only contain letters of alphabet.
 */

public class KeyboardRow {

    public String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < row1.length(); i ++) map.put(row1.charAt(i), 1);
        for (int i = 0; i < row2.length(); i ++) map.put(row2.charAt(i), 2);
        for (int i = 0; i < row3.length(); i ++) map.put(row3.charAt(i), 3);
        List<String> strings = new LinkedList<>();

        for (int i = 0; i < words.length; i ++) {
            char[] tmp = words[i].toLowerCase().toCharArray();
            int j = 0;
            int rowNum = map.get(tmp[j]);
            for (j = 1; j < tmp.length; j ++) if (map.get(tmp[j]) != rowNum) break;
            if (j == tmp.length) strings.add(words[i]);
        }

        return strings.toArray(new String[strings.size()]);

    }

}
