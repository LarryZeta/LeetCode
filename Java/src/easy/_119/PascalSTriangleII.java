package easy._119;

import easy._118.PascalSTriangle;

import java.util.List;

/**
 * @author Larry
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
 */

public class PascalSTriangleII {

    public List<Integer> getRow(int rowIndex) {

        return new PascalSTriangle().generate(rowIndex + 1).get(rowIndex);

    }

}
