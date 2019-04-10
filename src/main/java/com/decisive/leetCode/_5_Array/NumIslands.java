package com.decisive.leetCode._5_Array;

import org.junit.Assert;
import org.junit.Test;

/**
 * 统计岛屿数量
 * 岛屿的个数
 * <p>
 * 给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。
 * 一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。
 * 你可以假设网格的四个边均被水包围。
 */
public class NumIslands {
    public int numIslands(char[][] grid) {
        int result = 0;
        //循环遍历二维数组
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                //统计岛的个数
                if (grid[i][j] == '1') {
                    result++;
                    //将遍历过的岛归零
                    int rowL = grid.length - 1;
                    int colL = grid[i].length - 1;
                    deleteIsLand(grid, i, j, rowL, colL);
                }
            }
        }
        //返回结果
        return result;
    }

    private void deleteIsLand(char[][] grid, int row, int col, int rowL, int colL) {

        if (row < 0 || row > rowL || col < 0 || col > colL || grid[row][col] == '0') {
            return;
        }
        grid[row][col] = '0';

//        上下左右
        deleteIsLand(grid, row - 1, col, rowL, colL);
        deleteIsLand(grid, row + 1, col, rowL, colL);
        deleteIsLand(grid, row, col - 1, rowL, colL);
        deleteIsLand(grid, row, col + 1, rowL, colL);
    }


    @Test
    public void test_deleteIsLand() {
        char[][] grid = new char[][]{{'1', '1', '1', '1'}, {'1', '0', '1', '1'}, {'0', '0', '0', '0'}, {'1', '1', '1', '1'}};


        deleteIsLand(grid, 0, 0, 3, 3);

        print(grid);
    }


    @Test
    public void test_numIslands() {
        char[][] grid = new char[][]{{'1', '1', '1', '1'}, {'1', '0', '1', '1'}, {'0', '0', '0', '0'}, {'1', '1', '1', '1'}};


        int i = numIslands(grid);

        System.out.println(i);
        print(grid);
        Assert.assertEquals(2, i);
    }

    private void print(char[][] grid) {
        for (char[] chars : grid) {
            for (char aChar : chars) {
                System.out.print(aChar);
                System.out.print("，");
            }
            System.out.println();
        }


    }

}
