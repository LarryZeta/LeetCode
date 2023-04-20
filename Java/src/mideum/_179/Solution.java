package mideum._179;

import java.util.Arrays;


/**
 * pdd 2023-04-16
 *
 * @author Larry
 */
public class Solution {

    public String largestNumber(int[] nums) {

        if (Arrays.stream(nums).allMatch(n -> n == 0)){
            return "0";
        }

        Integer[] integers = new Integer[nums.length];
        for (int i = 0; i < nums.length; i ++) {
            integers[i] = nums[i];
        }

        Arrays.sort(integers, (a, b) -> {
            String aStr = String.valueOf(a);
            String bStr = String.valueOf(b);
            int i = 0;
            int j = 0;
            while (true){
                if (aStr.charAt(i) == bStr.charAt(j)) {
                    i = i + 1;
                    j = j + 1;
                    if (i == aStr.length() && j == bStr.length()) {
                        return 0;
                    }
                    if (i == aStr.length()) {
                        i = 0;
                    }
                    if (j == bStr.length()) {
                        j = 0;
                    }
                    continue;
                }
                if (aStr.charAt(i) > bStr.charAt(j)) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        StringBuilder stringBuilder = new StringBuilder();

        for (Integer integer : integers) {
            stringBuilder.append(integer);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
//        System.out.println(new Solution().largestNumber(new int[]{432, 43243}));
        System.out.println(new Solution().largestNumber(new int[]{0, 0, 0}));

//        System.out.println(new Solution().bigger(432, 43243));
//        System.out.println(new Solution().bigger(10, 201));

    }

}
