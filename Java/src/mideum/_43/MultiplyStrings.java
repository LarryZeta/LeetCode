package mideum._43;

/**
 * @author Larry
 *
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
 *
 * Example 1:
 *
 * Input: num1 = "2", num2 = "3"
 * Output: "6"
 * Example 2:
 *
 * Input: num1 = "123", num2 = "456"
 * Output: "56088"
 *
 * Note:
 *
 * The length of both num1 and num2 is < 110.
 * Both num1 and num2 contain only digits 0-9.
 * Both num1 and num2 do not contain any leading zero, except the number 0 itself.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */

public class MultiplyStrings {

    public String multiply(String num1, String num2) {

        int[] ints1 = new int[num1.length()];
        int[] ints2 = new int[num2.length()];

        for (int i = 0; i < ints1.length; i ++) ints1[i] = num1.charAt(i) - 48;
        for (int i = 0; i < ints2.length; i ++) ints2[i] = num2.charAt(i) - 48;

        int[] ans = new int[num1.length() + num2.length()];

        for (int i = ints1.length - 1; i >= 0; i --) {
            int[] tmp = new int[ints2.length + 1];
            for (int j = ints2.length - 1, k = tmp.length - 1; j >= 0; j --, k --) {
                if (ints1[i] * ints2[j] > 10) {
                    tmp[k] = ints1[i] * ints2[j] % 10;
                    tmp[k - 1] = ints1[i] * ints2[j] / 10;
                } else tmp[k] = ints1[i] * ints2[j];
            }
            for (int j = tmp.length - 1, k = ans.length - 1; j >= 0; j --, k --) ans[k] = ans[k] + tmp[j];
        }

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ans.length; i ++) {
            if (ans[i] != 0) stringBuffer.append(ans[i]);
        }

        return stringBuffer.toString();

    }

}
