package easy._231;

/**
 * @author zly
 *
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Credits:
 * Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
 */

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        else if (n <= 0 || n % 2 != 0) return false;
        else return isPowerOfTwo(n >> 1);
    }

}
