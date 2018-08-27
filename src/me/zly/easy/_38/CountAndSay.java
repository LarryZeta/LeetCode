package me.zly.easy._38;

/**
 * @author zly
 *
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 *        1.     1
 *        2.     11
 *        3.     21
 *        4.     1211
 *        5.     111221
 *
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 *
 * Example 1:
 *        Input: 1
 *        Output: "1"
 *
 * Example 2:
 *        Input: 4
 *        Output: "1211"
 */

public class CountAndSay {

    public String countAndSay(int n) {

        if (n == 0) {
            return "";
        }

        if (n == 1) {
            return "1";
        }

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1);

        for (int i = 1; i < n; i ++) {

            char c = stringBuffer.charAt(0);
            int count = 1;
            StringBuffer stringBuffer1 = new StringBuffer();

            for (int j = 1; j < stringBuffer.length(); j ++) {
                if (stringBuffer.charAt(j) == c) {
                    ++ count;
                } else {
                    stringBuffer1.append(count);
                    stringBuffer1.append(c);
                    c = stringBuffer.charAt(j);
                    count = 1;
                }
            }

            stringBuffer1.append(count);
            stringBuffer1.append(c);

            stringBuffer = stringBuffer1;

        }

        return stringBuffer.toString();

    }

    public static void main(String[] args) {
        System.out.print(new CountAndSay().countAndSay(4));
    }

}
