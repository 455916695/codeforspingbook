package com.decisive.offer.test14;

/**
 * 矩阵中的路径
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 * 如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
 */
public class MatrixWay {

    /**
     * 思路：循环遍历数组，将每一处都尝试作为起点，然后，递归遍历
     */
    public boolean findWay(char[][] matrix, char[] str) {
//      此处省略了参数校验
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[][] flag = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (findWay(matrix, i, j, row, col, str, 0, flag)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean findWay(char[][] matrix, int rowIndex, int colIndex, int row, int col, char[] str, int index, boolean[][] flag) {
        if (index >= str.length) {
            return true;
        }
        //判断所传的参数是否合法，不合法，返回false;
        if (rowIndex < 0 || rowIndex >= row || colIndex < 0 || colIndex >= col || flag[rowIndex][colIndex] || matrix[rowIndex][colIndex] != str[index]) {
            return false;
        }
        //判断遍历的字节是否满足条件，如果满足条件进行下一次的迭代
        flag[rowIndex][colIndex] = true;
        //向四个方向迭代
        if (findWay(matrix, rowIndex - 1, colIndex, row, col, str, index + 1, flag) || findWay(matrix, rowIndex + 1, colIndex, row, col, str, index + 1, flag)
                || findWay(matrix, rowIndex, colIndex - 1, row, col, str, index + 1, flag) || findWay(matrix, rowIndex, colIndex + 1, row, col, str, index + 1, flag)) {
            return true;
        } else {
            return false;
        }
    }

}
