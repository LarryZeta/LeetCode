package me.zly.easy._118;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zly
 *
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */

public class PascalSTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) return triangle;

        List<Integer> row = new ArrayList<>();
        row.add(1);
        triangle.add(row);

        for (int i = 1; i < numRows; i ++) {
            row = new ArrayList<>(i + 1);
            row.add(0, 1);
            List<Integer> preRow = triangle.get(i - 1);
            for (int j = 1; j < i; j ++) {
                int element = preRow.get(j - 1) + preRow.get(j);
                row.add(j, element);
            }
            row.add(i, 1);
            triangle.add(row);
        }

        return triangle;

    }

}
