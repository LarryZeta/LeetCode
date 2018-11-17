package easy._202;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author zly
 *
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 *
 * Example:
 *
 * Input: 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */

public class HappyNumber {

    public boolean isHappy(int n) {

        HashSet<List> hashSet = new HashSet<>();
        List<Integer> integers = new ArrayList<>();

        while (n > 0) {
            integers.add(n % 10);
            n = n / 10;
        }

        int result = 0;
        while (true) {
            for (int i = 0; i < integers.size(); i ++) result = result + integers.get(i) * integers.get(i);
            if (result == 1) return true;
            else if (hashSet.contains(integers)) return false;
            else {
                hashSet.add(integers);
                integers.clear();
                while (result > 0) {
                    integers.add(result % 10);
                    result = result / 10;
                }
            }
        }

    }

}
