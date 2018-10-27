package me.zly.mideum._48;

/**
 * @author zly
 *
 * You are given an n x n 2D matrix representing an image.
 *
 * Rotate the image by 90 degrees (clockwise).
 *
 * Note:
 *
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 *
 * Example 1:
 *
 * Given input matrix =
 * [
 *   [1,2,3],
 *   [4,5,6],
 *   [7,8,9]
 * ],
 *
 * rotate the input matrix in-place such that it becomes:
 * [
 *   [7,4,1],
 *   [8,5,2],
 *   [9,6,3]
 * ]
 * Example 2:
 *
 * Given input matrix =
 * [
 *   [ 5, 1, 9,11],
 *   [ 2, 4, 8,10],
 *   [13, 3, 6, 7],
 *   [15,14,12,16]
 * ],
 *
 * rotate the input matrix in-place such that it becomes:
 * [
 *   [15,13, 2, 5],
 *   [14, 3, 4, 1],
 *   [12, 6, 8, 9],
 *   [16, 7,10,11]
 * ]
 */

public class RotateImage {

    public void rotate(int[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) return;

        for (int i = 0; i < matrix.length / 2; i ++) {
            for (int offset = 0; offset < matrix.length / 2 + 1; offset ++)
                swap4(matrix, i, matrix.length - 1 - i,offset);
        }

    }

    void swap4(int[][] matrix, int i, int length, int offset) {
        int tmp1 = matrix[i][i + offset];
        matrix[i][i + offset] = matrix[length - offset][i];
        int tmp2 = matrix[i + offset][length];
        matrix[i + offset][length] = tmp1;
        tmp1 = matrix[length][length - offset];
        matrix[length][length -offset] = tmp2;
        matrix[length - offset][i] = tmp1;
    }

}
