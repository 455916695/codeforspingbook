package com.ax.leetCode._2_sudoku;


import org.junit.Test;

public class SudokuTest {

    @Test
    public void test() {
        Sudoku sudoku = new Sudoku();

        char[][] chars = new char[][]{
                  {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '.', '.', '.', '.'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '.'},
                  {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        boolean validSudoKu = sudoku.isValidSudoKu(chars);
        System.out.println(
                validSudoKu
        );
    }
}






























