/**
 * @author zly
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 *
 * Example 1:
 *        Input: s = "PAYPALISHIRING", numRows = 3
 *        Output: "PAHNAPLSIIGYIR"
 *
 * Example 2:
 *        Input: s = "PAYPALISHIRING", numRows = 4
 *        Output: "PINALSIGYAHRPI"
 *
 * Explanation:
 *
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */
 
 class Solution {
public:
    string convert(string s, int numRows) {
        
		if (numRows == 1 || numRows == 0) return s;
		
		int level = numRows - 1;
        int divisor = 2 * level;

		stringbuf[] stringBuf = new stringBuffer[numRows];
        //StringBuffer[] stringBuffer = new StringBuffer[numRows];

        for (int i = 0; i < numRows; i ++) {
            stringBuffer[i] = new stringbuf();
        }

        for (int i = 0; i < s.length(); i ++) {
            int loc = i % divisor;
            if (loc > level) {
                loc = 2 * level - loc;
            }
            stringBuffer[loc].append(s.charAt(i));
        }

        stringBuf buffer = new stringBuf();

        for (int i = 0; i < numRows; i ++) {
            buffer.append(stringBuffer[i]);
        }

        return buffer.toString();
		
    }
};