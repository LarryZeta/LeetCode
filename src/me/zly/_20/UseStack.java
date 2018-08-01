package me.zly._20;

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
import java.util.HashSet;
import java.util.Stack;

public class UseStack {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
//        HashSet<Character> left = new HashSet<>();
//        HashSet<Character> right= new HashSet<>();
//        left.add('(');
//        left.add('[');
//        left.add('{');
//        right.add(')');
//        right.add(']');
//        right.add('}');
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('(', ')');
        hashMap.put('[', ']');
        hashMap.put('{', '}');


        for (int i = 0; i < s.length(); i ++) {
            if (hashMap.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
            if (hashMap.containsValue(s.charAt(i))) {
                if (stack.pop() == hashMap.get(s.charAt(i))) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "(]";
        UseStack useStack = new UseStack();
        System.out.println(useStack.isValid(str));
    }

}
