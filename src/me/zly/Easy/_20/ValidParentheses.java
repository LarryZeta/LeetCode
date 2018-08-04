package me.zly.Easy._20;

// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
// An input string is valid if:
//        Open brackets must be closed by the same type of brackets.
//        Open brackets must be closed in the correct order.
//
// Note that an empty string is also considered valid.
//
// Example 1:
//        Input: "()"
//        Output: true
//
// Example 2:
//        Input: "()[]{}"
//        Output: true
//
// Example 3:
//        Input: "(]"
//        Output: false
//
// Example 4:
//        Input: "([)]"
//        Output: false
//
// Example 5:
//        Input: "{[]}"
//        Output: true

import java.util.HashMap;

public class ValidParentheses {

    public boolean isValid(String s) {

        HashMap<Character, Integer> priority = new HashMap<>();
        priority.put('(', 1);
        priority.put(')', -1);
        priority.put('[', 2);
        priority.put(']', -2);
        priority.put('{', 3);
        priority.put('}', -3);

        int value = 0;

        for (int i = 0; i < s.length(); i ++) {
            value += priority.get(s.charAt(i));
            if (value < 0) {
                return false;
            }
        }

        for (int i = 0; i < s.length() - 1; i ++) {
            int now = priority.get(s.charAt(i));
            int next = priority.get(s.charAt(i + 1));
            // with priority.
            if (now * next > 0 && now < next) {
                return false;
            }
            if (now > 0 && next < 0) {
                if (now + next != 0) {
                    return false;
                }
            }
            if (now < 0 && next > 0) {
                ++ i;
            }
        }

        if (value == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "[([]])";
        ValidParentheses v = new ValidParentheses();
        System.out.println(v.isValid(str));
    }

}
