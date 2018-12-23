package easy._345;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zly
 *
 * Write a function that takes a string as input and reverse only the vowels of a string.
 *
 * Example 1:
 *
 * Input: "hello"
 * Output: "holle"
 * Example 2:
 *
 * Input: "leetcode"
 * Output: "leotcede"
 * Note:
 * The vowels does not include the letter "y".
 */

public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {

        Set<Character> set = new HashSet<>();
        set.addAll(Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'));

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {

            if (!set.contains(chars[left])) {
                left ++;
                continue;
            }
            if (!set.contains(chars[right])) {
                right --;
                continue;
            }

            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;

            left ++;
            right --;

        }

        return String.copyValueOf(chars);

    }

}
