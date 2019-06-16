package com.decisive.leetCode._5_Array;

import org.junit.Assert;
import org.junit.Test;

/**
 * 搜索二维矩阵 II
 * <p>
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
 * <p>
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 */
public class SearchMatrix {

    //对角线访问？

    /**
     * 从特殊的二维矩阵中，寻找到指定目标值
     */
    public boolean searchMatrix(int[][] matrix, int target) {

        boolean result = false;
        //此处需要对参数进行判断
        if (matrix == null || matrix.length < 1) {
            return result;
        }

        //循环遍历二位数组，从中寻找出合适的值
        int row = 0;
        int col = matrix[row].length - 1;

        while (row <= matrix.length - 1 && col >= 0) {
            if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                result = true;
                break;
            }
        }

        return result;
    }


    @Test
    public void test_searchMatrix() {
        int[][] matrix = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};

        boolean b = searchMatrix(matrix, 21);
        System.out.println(b);
        Assert.assertTrue(b);

        b = searchMatrix(matrix, 20);
        System.out.println(b);
        Assert.assertFalse(b);

    }


}