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

// TODO
public class Count_and_Say_Recursive {

    public String countAndSay(int n) {

        return countAndSay("", n);

    }

    public String countAndSay(String string, int n) {

        if (n == 0) {
            return string;
        }

        if (n == 1) {

            StringBuffer stringBuffer = new StringBuffer(string);
            stringBuffer.insert(0, 1);
            string = stringBuffer.toString();
            return string;

        } else {

            int count = 1;
            int loc = 0;

            for (int i = 1; i < string.length(); i ++) {

                if (string.charAt(i) == string.charAt(i - 1)) {
                    ++ count;
                } else {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(count);
                    stringBuffer.append(string.charAt(i - 1));
                    string = stringBuffer.toString();
                    count = 1;

                }

            }


            return countAndSay(string, -- n);

        }

    }
}
