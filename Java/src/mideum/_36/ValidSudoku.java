package mideum._36;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Larry
 *
 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 *
 * A partially filled sudoku which is valid.
 *
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
 * Example 1:
 *
 * Input:
 * [
 *   ["5","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * Output: true
 * Example 2:
 *
 * Input:
 * [
 *   ["8","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * Output: false
 * Explanation: Same as Example 1, except with the 5 in the top left corner being
 *     modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 * Note:
 *
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 * The given board contain only digits 1-9 and the character '.'.
 * The given board size is always 9x9.
 */

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        return isEachRowWithoutRepetition(board) && isEachColWithoutRepetition(board) && isEachGridWithoutRepetition(board);

    }


    boolean isEachRowWithoutRepetition(char[][] board) {
        for (int i = 0; i < board.length; i ++) {
            Set<Character> row = new HashSet<>();
            for (int j = 0; j < board[i].length; j ++) {
                int size = row.size();
                if (board[i][j] != '.') {
                    row.add(board[i][j]);
                    if (size == row.size()) return false;
                }
            }
        }
        return true;
    }


    boolean isEachColWithoutRepetition(char[][] board) {
        for (int i = 0; i < board[0].length; i ++) {
            Set<Character> column = new HashSet<>();
            for (int j = 0; j < board.length; j ++) {
                int size = column.size();
                if (board[j][i] != '.') {
                    column.add(board[j][i]);
                    if (size == column.size()) return false;
                }
            }
        }
        return true;
    }


    boolean isEachGridWithoutRepetition(char[][] board) {
        for (int i = 0; i < board.length; i = i + 3) {
            for (int j = 0; j < board[i].length; j = j + 3) {
                Set<Character> grid = new HashSet<>();
                for (int k = 0; k < 3; k ++) {
                    for (int l = 0; l < 3; l ++) {
                        int size = grid.size();
                        if (board[i + k][j + l] != '.') {
                            grid.add(board[i + k][j + l]);
                            if (size == grid.size()) return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
