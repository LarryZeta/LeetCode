package easy._371;

/**
 * @author Larry
 *
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 *
 * Example:
 * Given a = 1 and b = 2, return 3.
 *
 * Credits:
 * Special thanks to @fujiaozhu for adding this problem and creating all test cases.
 */

public class SumOfTwoIntegers {

    public int getSum(int a, int b) {

        int xor = a ^ b;
        int and = a & b;
        if (and != 0) return getSum(xor, and << 1);
        else return xor;

    }

}
