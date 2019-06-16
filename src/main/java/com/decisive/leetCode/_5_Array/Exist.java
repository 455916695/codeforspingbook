package com.decisive.leetCode._5_Array;

import org.junit.Assert;
import org.junit.Test;

/**
 * 单词搜索
 * 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，
 * 其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。
 * 同一个单元格内的字母不允许被重复使用。
 */
public class Exist {

    /**
     * 使用标记位，然后递归
     */
    public boolean exist(char[][] board, String word) {
        //参数合法性校验
        if (board == null) {
            return false;
        }
        if (word.isEmpty()) {
            return true;
        }
        //调用方法检验是否存在指定路径
        int rowLength = board.length;
        int colLength = board[0].length;
        boolean[][] flag = new boolean[rowLength][colLength];
        int index = 0;
        boolean result = false;
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (word.charAt(0) == board[i][j]){
                    result = result || recall(board, flag, word, rowLength, colLength, i, j, index);
                }
            }
        }

        //返回结果
        return result;
    }


    private boolean recall(char[][] board, boolean[][] flag, String word, int row, int col, int rowIndex, int colIndex, int index) {
        if (rowIndex < 0 || colIndex < 0 || rowIndex >= row || colIndex >= col || flag[rowIndex][colIndex] || board[rowIndex][colIndex] != word.charAt(index)) {
            return false;
        }
        if (index == word.length() - 1) {
            return true;
        }
        flag[rowIndex][colIndex] = true;
        //进行上下左右四个方向进行递归
        boolean recall = recall(board, flag, word, row, col, rowIndex + 1, colIndex, index + 1);
        recall = recall || recall(board, flag, word, row, col, rowIndex - 1, colIndex, index + 1);
        recall = recall || recall(board, flag, word, row, col, rowIndex, colIndex + 1, index + 1);
        recall = recall || recall(board, flag, word, row, col, rowIndex, colIndex - 1, index + 1);

        flag[rowIndex][colIndex] = false;
        return recall;
    }


    @Test
    public void test_exist() {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        boolean abcced = exist(board, "ESE");
        System.out.println(abcced);
        Assert.assertTrue(abcced);
        abcced = exist(board, "ABCED");
        System.out.println(abcced);
        Assert.assertFalse(abcced);

        board = new char[][]{{'C', 'A', 'A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}};
        abcced = exist(board, "AAB");
        System.out.println(abcced);
    }


}
