package mideum._54;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>(matrix.length * matrix[0].length);

        int passed = 200;
        int i = 0;
        int j = 0;

        int count = 0;

        // dir Right -> 0 Down -> 1 Left -> 2 Up -> 3
        int dir = 0;

        while (count < 2) {

            boolean validI = i >= 0 && i < matrix.length;
            boolean validJ = j >= 0 && j < matrix[0].length;

            if (validI && validJ && matrix[i][j] != passed) {
                list.add(matrix[i][j]);
                matrix[i][j] = passed;
                count = 0;
            } else {
                count += 1;

                // 回退
                switch (dir) {
                    case 0: j--; break;
                    case 1: i--; break;
                    case 2: j++; break;
                    case 3: i++; break;
                }

                dir += 1;

                if (dir == 4) {
                    dir = 0;
                }

            }

            switch (dir) {
                case 0: j++; break;
                case 1: i++; break;
                case 2: j--; break;
                case 3: i--; break;
            }

        }

        return list;

    }

    public static void main(String[] args) {

        int[][] ints = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println( new Solution().spiralOrder((ints)));
    }

}
