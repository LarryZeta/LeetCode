package easy._125;

/**
 * @author Larry
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 */

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        if (s == null) return false;

        s = s.replaceAll("[\\pP\\p{Punct}]", "");
        s = s.replaceAll("\\s*", "");
        s = s.toLowerCase();

        if (s.isEmpty()) return true;

        for (int i = 0; i < s.length() / 2; i ++)
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;

        return true;

    }

}
