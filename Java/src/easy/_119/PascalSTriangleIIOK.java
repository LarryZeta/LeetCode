package easy._119;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zly
 *
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *
 * Note that the row index starts from 0.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 3
 * Output: [1,3,3,1]
 * Follow up:
 *
 * Could you optimize your algorithm to use only O(k) extra space?
 *
 * Space complexity: O(k)
 */

public class PascalSTriangleIIOK {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();

        row.add(1);
        if (rowIndex == 0) return row;

        row.add(1);
        if (rowIndex == 1) return row;


        for (int i = 1; i <= rowIndex; i ++) {
            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(0, 1);
            for (int j = 1; j < i; j ++) {
                int  element = row.get(j - 1) + row.get(j);
                nextRow.add(j, element);
            }
            nextRow.add(i, 1);
            row = nextRow;
        }

        return row;
    }

}
