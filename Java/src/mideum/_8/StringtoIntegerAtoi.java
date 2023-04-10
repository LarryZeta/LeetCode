package mideum._8;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author Larry
 *
 * Implement atoi which converts a string to an integer.
 *
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 *
 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 *
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 *
 * If no valid conversion could be performed, a zero value is returned.
 *
 * Note:
 *
 * Only the space character ' ' is considered as whitespace character.
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
 *
 * Example 1:
 *       Input: "42"
 *       Output: 42
 *
 * Example 2:
 *        Input: "   -42"
 *        Output: -42
 *
 * Explanation: The first non-whitespace character is '-', which is the minus sign.
 *             Then take as many numerical digits as possible, which gets 42.
 *
 * Example 3:
 *        Input: "4193 with words"
 *        Output: 4193
 *
 * Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
 *
 * Example 4:
 *        Input: "words and 987"
 *        Output: 0
 *
 * Explanation: The first non-whitespace character is 'w', which is not a numerical
 *             digit or a +/- sign. Therefore no valid conversion could be performed.
 *
 * Example 5:
 *        Input: "-91283472332"
 *        Output: -2147483648
 *
 * Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
 *             Thefore INT_MIN (−231) is returned.
 */

public class StringtoIntegerAtoi {

    public int myAtoi(String str) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        hashMap.put('0', 0);
        hashMap.put('1', 1);
        hashMap.put('2', 2);
        hashMap.put('3', 3);
        hashMap.put('4', 4);
        hashMap.put('5', 5);
        hashMap.put('6', 6);
        hashMap.put('7', 7);
        hashMap.put('8', 8);
        hashMap.put('9', 9);

        Boolean isnegative = null;

        for (int i = 0; i < str.length(); i ++) {
            char charAt = str.charAt(i);
            if (charAt == ' ' && linkedList.isEmpty() && isnegative == null) continue;
            else if (charAt == '-') {
                if (isnegative != null || !linkedList.isEmpty()) break;
                isnegative = true;
                continue;
            } else if (charAt == '+') {
                if (isnegative != null || !linkedList.isEmpty()) break;
                isnegative = false;
                continue;
            }
            Integer num = hashMap.get(charAt);
            if (num != null) linkedList.add(num);
            else break;
        }

        if (linkedList.isEmpty()) return 0;

        long ret = 0;
        int tmp;

        if (isnegative == null) isnegative = false;
        if (isnegative) {
            while (!linkedList.isEmpty()) {
                tmp = linkedList.pop();
                ret = ret * 10;
                ret = ret - tmp;
                if (ret < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
        } else {
            while (!linkedList.isEmpty()) {
                tmp = linkedList.pop();
                ret = ret * 10;
                ret = ret + tmp;
                if (ret > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            }
        }

        return (int)ret;

    }

}
