package com.decisive.leetCode._2_math;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Vector;

/**
 * 矩阵置零
 */
public class SetZeroes {

    public void setZeroes(int[][] matrix) {
        //一: 判断第一行中是否存在0
        boolean rowHave = firstRowHaveZero(matrix);
        //二：判断第一列中是否存在0
        boolean colHave = firstColHaveZero(matrix);
        //遍历集合，如果出现了0，在第一行和第一列对应位置中记录下来
        recordZero(matrix);
//        遍历第一行，对列置0
        colZetZero(matrix);
//        遍历第一列，对行置0
        rowZetZero(matrix);
        if (rowHave) firstRowZetZero(matrix);
        if (colHave) firstColZetZero(matrix);
    }

    private void firstColZetZero(int[][] matrix) {
        cZetZero(matrix, 0);
    }

    private void firstRowZetZero(int[][] matrix) {
        rZetZero(matrix, 0);
    }

    private void rowZetZero(int[][] matrix) {
        //遍历第一列，
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                //对指定行置0
                rZetZero(matrix, i);
            }
        }
    }

    private void rZetZero(int[][] matrix, int row) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = 0;
        }

    }

    private void colZetZero(int[][] matrix) {
        //遍历第一行，
        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0)
                cZetZero(matrix, i);
            //对指定列置0
        }
    }

    private void cZetZero(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }

    /**
     * 遍历数组，寻找出现的零
     */
    private void recordZero(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    //修改第一行对应位置为0
                    matrix[0][j] = 0;
                    //修改第一列中对应的位置为0
                    matrix[i][0] = 0;
                }
            }
        }
    }

    private boolean firstColHaveZero(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) return true;
        }
        return false;
    }

    /**
     * 判断第一行中是否存在 0
     */
    private boolean firstRowHaveZero(int[][] matrix) {

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) return true;
        }
        return false;
    }


    public static void main(String[] args) {

        int[][] matrix = new int[][]{{0, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        SetZeroes setZeroes = new SetZeroes();
        boolean b = setZeroes.firstColHaveZero(matrix);
        System.out.println(b);
        b = setZeroes.firstRowHaveZero(matrix);
        System.out.println(b);

//        setZeroes.recordZero(matrix);
//        setZeroes.colZetZero(matrix);
//        setZeroes.rowZetZero(matrix);
//        setZeroes.firstRowZetZero(matrix);
//        setZeroes.firstColZetZero(matrix);
        setZeroes.setZeroes(matrix);
        setZeroes.print(matrix);
    }

    private void print(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" , ");
            }
            System.out.println("");
        }
    }

}
