package easy._231;

/**
 * @author Larry
 *
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Credits:
 * Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
 */

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }

}
