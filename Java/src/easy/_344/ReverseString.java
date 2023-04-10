package easy._344;

/**
 * @author Larry
 *
 * Write a function that takes a string as input and returns the string reversed.
 *
 * Example 1:
 *
 * Input: "hello"
 * Output: "olleh"
 * Example 2:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: "amanaP :lanac a ,nalp a ,nam A"
 */

public class ReverseString {

    public String reverseString(String s) {

        if (s == null || s.length() == 0) return "";

        char[] charArray = s.toCharArray();

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = charArray.length - 1; i >= 0; i --) stringBuffer.append(charArray[i]);

        return stringBuffer.toString();

    }

}
