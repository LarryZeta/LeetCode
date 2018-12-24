package easy._383;

import java.util.Arrays;

/**
 * @author zly
 *
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 *
 * Each letter in the magazine string can only be used once in your ransom note.
 *
 * Note:
 * You may assume that both strings contain only lowercase letters.
 *
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 */

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) return false;
        char[] toCharArray0 = ransomNote.toCharArray();
        char[] toCharArray1 = magazine.toCharArray();

        Arrays.sort(toCharArray0);
        Arrays.sort(toCharArray1);

        int i = 0;
        int j = 0;
        while (i < toCharArray0.length && j < toCharArray1.length) {
            if (toCharArray0[i] < toCharArray1[j]) return false;
            else if (toCharArray0[i] == toCharArray1[j]) i ++;
            j ++;
        }

        if (i == toCharArray0.length) return true;
        else return false;

    }

}
