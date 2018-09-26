package me.zly.easy._168;

import java.util.Stack;

/**
 * @author zly
 *
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 *
 * For example:
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 * Example 1:
 *
 * Input: 1
 * Output: "A"
 * Example 2:
 *
 * Input: 28
 * Output: "AB"
 * Example 3:
 *
 * Input: 701
 * Output: "ZY"
 */

public class ExcelSheetColumnTitle {

    public String convertToTitle(int n) {

        if (n == 0) return "";

        Stack<Integer> stack = new Stack<>();
        StringBuffer stringBuffer = new StringBuffer();

        while (n > 0) {
            int tmp = n % 26;
            n = (tmp == 0) ? n / 26 - 1 : n / 26;
            stack.push(tmp);
        }

        while (!stack.isEmpty()) {
            stringBuffer.append((char)(((stack.peek() == 0) ? stack.pop() + 26 : stack.pop()) + 64));
        }

        return stringBuffer.toString();

    }

}