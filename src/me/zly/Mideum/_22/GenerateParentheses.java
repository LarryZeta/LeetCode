package me.zly.Mideum._22;

// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//
// For example, given n = 3, a solution set is:
//
//      [
//        "((()))",
//        "(()())",
//        "(())()",
//        "()(())",
//        "()()()"
//      ]

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses {

    final int left = 1;
    final int right = -1;

    public List<String> generateParenthesis(int n) {

        LinkedList<String> strings = new LinkedList<>();

        ArrayList<ArrayList<Integer>> listArrayList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < n; i ++) {

        }

        return strings;

    }

}
