package easy._367;

/**
 * @author zly
 *
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 *
 * Note: Do not use any built-in library function such as sqrt.
 *
 * Example 1:
 *
 * Input: 16
 * Output: true
 * Example 2:
 *
 * Input: 14
 * Output: false
 */

public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {

        for (int i = 1; num > 0; i = i + 2) num = num - i;

        if (num == 0) return true;
        else return false;

    }

}
