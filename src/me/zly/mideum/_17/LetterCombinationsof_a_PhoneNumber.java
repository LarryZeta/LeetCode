package me.zly.mideum._17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author zly
 *
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 *
 * Example:
 *        Input: "23"
 *        Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 *
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 */



public class LetterCombinationsof_a_PhoneNumber {

    public List<String> letterCombinations(String digits) {

        List<String> stringList = new ArrayList<>();
        if(digits.isEmpty() || digits == null) return stringList;

        HashMap<Character, Character[]> hashMap = new HashMap<>();
        hashMap.put('2', new Character[]{'a', 'b', 'c'});
        hashMap.put('3', new Character[]{'d', 'e', 'f'});
        hashMap.put('4', new Character[]{'g', 'h', 'i'});
        hashMap.put('5', new Character[]{'j', 'k', 'l'});
        hashMap.put('6', new Character[]{'m', 'n', 'o'});
        hashMap.put('7', new Character[]{'p', 'q', 'r', 's'});
        hashMap.put('8', new Character[]{'t', 'u', 'v'});
        hashMap.put('9', new Character[]{'w', 'x', 'y', 'z'});

        List<StringBuffer> stringBufferList = new ArrayList<>();
        Character[] chars = hashMap.get(digits.charAt(0));
        for (int i = 0; i < chars.length; i ++) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(chars[i]);
            stringBufferList.add(stringBuffer);
        }

        for (int i = 1; i < digits.length(); i ++) {
            Character[] characters = hashMap.get(digits.charAt(i));
            List<StringBuffer> list = new ArrayList<>();
            for(int j = 0; j < stringBufferList.size(); j ++) {
                for (int k = 0; k < characters.length; k ++) {
                    StringBuffer stringBuffer = new StringBuffer(stringBufferList.get(j));
                    stringBuffer.append(characters[k]);
                    list.add(stringBuffer);
                }
            }
            stringBufferList = list;
        }

        for (int i = 0; i < stringBufferList.size(); i ++) {
            stringList.add(stringBufferList.get(i).toString());
        }

        return stringList;

    }

}
