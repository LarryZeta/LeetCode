package mideum._128;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>(nums.length);

        for (int n : nums) {
            set.add(n);
        }

        int maxlen = 0;

        int len = 0;
        for (Integer val : set) {

            if (!set.contains(val - 1)) {
                len = 1;
                while (set.contains(val + 1)) {
                    len = len + 1;
                    val = val + 1;
                }
            }

            maxlen = Math.max(len, maxlen);
        }

        return maxlen;

    }

    public static void main(String[] args) {
        System.out.print(new Solution().longestConsecutive(new int[] {9,1,-3,2,4,8,3,-1,6,-2,-4,7}));
    }

}
