package mideum._29;

/**
 * @author zly
 *
 * Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.
 *
 * Return the quotient after dividing dividend by divisor.
 *
 * The integer division should truncate toward zero.
 *
 * Example 1:
 *
 * Input: dividend = 10, divisor = 3
 * Output: 3
 * Example 2:
 *
 * Input: dividend = 7, divisor = -3
 * Output: -2
 * Note:
 *
 * Both dividend and divisor will be 32-bit signed integers.
 * The divisor will never be 0.
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
 * For the purpose of this problem, assume that your function returns 231 − 1 when the division result overflows.
 */

public class DivideTwoIntegersSlow {

    public int divide(int dividend, int divisor) {

        int res = 0;
        if (divisor == 0) return Integer.MAX_VALUE;
        else if (divisor == 1) return dividend;

        else if(dividend == Integer.MIN_VALUE) {
            if (divisor == -1) return Integer.MAX_VALUE;
            dividend = dividend + Math.abs(divisor);
            res ++;
        }


        // get signs with xor
        boolean isNege = (dividend ^ divisor)>>>31 == 1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while (dividend > 0) {
            while ((dividend = dividend - divisor) >= 0) res ++;
        }

        return isNege ? -res : res;

    }



}
