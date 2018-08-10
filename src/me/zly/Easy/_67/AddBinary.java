package me.zly.Easy._67;

// Given two binary strings, return their sum (also a binary string).
//
// The input strings are both non-empty and contains only characters 1 or 0.
//
// Example 1:
//        Input: a = "11", b = "1"
//        Output: "100"
//
// Example 2:
//        Input: a = "1010", b = "1011"
//        Output: "10101"

import java.util.Stack;

public class AddBinary {

    public String addBinary(String a, String b) {

        Stack<Integer> stack_a = new Stack<>();
        Stack<Integer> stack_b = new Stack<>();
        Stack<Integer> stack_c = new Stack<>();

        for (int i = 0; i < a.length(); i ++) {
            if (a.charAt(i) == '0') stack_a.push(0);
            else stack_a.push(1);
        }
        for (int i = 0; i < b.length(); i ++) {
            if (b.charAt(i) == '0') stack_b.push(0);
            else stack_b.push(1);
        }

        int flag = 0;

        while (!stack_a.empty() || !stack_b.empty() || flag == 1) {
            int value = flag;
            if (!stack_a.empty()) value += stack_a.pop();
            if (!stack_b.empty()) value += stack_b.pop();
            flag = 0;
            if (value > 1) {
                flag = 1;
                stack_c.push(value - 2);
            } else stack_c.push(value);
        }

        StringBuffer stringBuffer = new StringBuffer();

        while (!stack_c.empty()) stringBuffer.append(stack_c.pop());

        return stringBuffer.toString();

    }

}
