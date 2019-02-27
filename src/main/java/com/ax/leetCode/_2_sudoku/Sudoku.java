package com.ax.leetCode._2_sudoku;

public class Sudoku {  //错误
    public boolean isValidSudoKu(char[][] board) {  //之前的错误，是因为使用的辅助空间不足，
        boolean[][] rowFlag = new boolean[9][9];
        boolean[][] colFlag = new boolean[9][9];
        boolean[] sFlag = new boolean[9];

        for (int m = 1; m <= 9; m++) {
            int row = 0;
            if (m % 3 == 0) {
                row = ((m / 3) - 1) * 3;
            } else {
                row = (m / 3) * 3;
            }
            int col = 0;
            if (m % 3 == 0) {
                col = 6;
            } else {
                col = ((m % 3) - 1) * 3;
            }
            for (int i = row; i <= row + 2; i++) {
                for (int j = col; j <= col + 2; j++) {
                    if ('.' != board[i][j]) {
                        int index = board[i][j] - '1';
                        if (sFlag[index] || colFlag[i][index] || rowFlag[index][j]) {
                            return false;
                        }
                        sFlag[index] = true;
                        colFlag[i][index] = true;
                        rowFlag[index][j] = true;
                    }
                }
            }
            for (int k = 0; k < 9; k++) {
                sFlag[k] = false;
            }
        }
        return true;
    }
}





























