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
        Stack<Character> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i ++) {
            if (set.contains(chars[i])) {
                stack.push(chars[i]);
                ((LinkedList<Integer>) queue).add(i);
            }
        }

        while (!stack.empty() && !queue.isEmpty()) chars[((LinkedList<Integer>) queue).pop()] = stack.pop();

        return String.copyValueOf(chars);

    }

}
