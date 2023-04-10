package easy._171;

/**
 * @author Larry
 *
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * Example 1:
 *
 * Input: "A"
 * Output: 1
 * Example 2:
 *
 * Input: "AB"
 * Output: 28
 * Example 3:
 *
 * Input: "ZY"
 * Output: 701
 */

public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {

        int ret = 0;
        int j = 1;

        for (int i = 1; i <= s.length(); i ++) {
            ret += (s.charAt(s.length() - i) - 64) * j ;
            j = j * 26;
        }

        return ret;

    }

}
