package me.zly.easy._326;

/**
 * @author zly
 *
 * Given an integer, write a function to determine if it is a power of three.
 *
 * Example 1:
 *
 * Input: 27
 * Output: true
 * Example 2:
 *
 * Input: 0
 * Output: false
 * Example 3:
 *
 * Input: 9
 * Output: true
 * Example 4:
 *
 * Input: 45
 * Output: false
 * Follow up:
 * Could you do it without using any loop / recursion?
 */

public class PowerOfThreeRecursion {

    public boolean isPowerOfThree(int n) {

        long i = 1;
        while (i < n) i = i * 3;
        if (i != n) return false;
        else return true;

    }

}
