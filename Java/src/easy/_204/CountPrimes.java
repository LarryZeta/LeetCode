package easy._204;

import java.util.Arrays;

/**
 * @author zly
 *
 * Count the number of prime numbers less than a non-negative number, n.
 *
 * Example:
 *
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */

public class CountPrimes {

    public int countPrimes(int n) {

        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);

        for (int i = 2; i < n; i ++)
            if (prime[i])
                for (int j = i * 2; j < n; j = j + i) prime[j] = false;

        int count = 0;
        for (int i = 2; i < n; i ++)
            if (prime[i]) count ++;

        return count;

    }

}
