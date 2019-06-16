package com.ax.offer.twodimensionalarray;

import org.junit.Test;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class TwoDimensionalArray {

    /**
     * 输入一个数据，判断指定数组中是否包含该数据
     */
    public Integer findRepetitionData(Integer target, Integer[][] numArray) {
        Integer flag = null;
        if (numArray == null || numArray.length <= 0 || numArray[0] == null || numArray[0].length <= 0) {
            return flag;
        }
        //思路: 从 右上角 、 （右下角） 进行判断并遍历
        int row = 0;
        int col = numArray[0].length - 1;
        while (true) {
            try {
                int res = target.compareTo(numArray[row][col]);
                switch (res) {
                    //  -1  表示目标数 比遍历值小
                    case -1:
                        col--;
                        break;
                    case 0:
                        return numArray[row][col];
                    case 1:
                        row++;
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return flag;
            }
        }
    }


    public boolean Find(Integer target, Integer[][] numArray) {
        boolean flag = false;
        if (numArray == null || numArray.length <= 0 || numArray[0] == null || numArray[0].length <= 0) {
            return flag;
        }
        //思路: 从 右上角 、 （右下角） 进行判断并遍历
        int row = 0;
        int col = numArray[0].length - 1;
        while (true) {
            try {
                int res = target.compareTo(numArray[row][col]);
                switch (res) {
                    //  -1  表示目标数 比遍历值小
                    case -1:
                        col--;
                        break;
                    case 0:
                        return true;
                    case 1:
                        row++;
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return flag;
            }

        }

    }

    /**
     * 这是推荐的代码
     */
    public boolean Find(int target, int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int rows = matrix.length, cols = matrix[0].length;
        int r = 0, c = cols - 1; // 从右上角开始
        while (r <= rows - 1 && c >= 0) {
            if (target == matrix[r][c])
                return true;
            else if (target > matrix[r][c])
                r++;
            else
                c--;
        }
        return false;
    }


}
