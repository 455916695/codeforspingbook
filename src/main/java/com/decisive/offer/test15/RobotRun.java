package com.decisive.offer.test15;

import org.junit.Assert;

/**
 * 机器人运动范围
 * 地上有一个 m 行和 n 列的方格。
 * 一个机器人从坐标 (0, 0) 的格子开始移动，每一次只能向左右上下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于 k 的格子。
 * 例如，当 k 为 18 时，机器人能够进入方格（35, 37），因为 3+5+3+7=18。但是，它不能进入方格（35, 38），因为 3+5+3+8=19。
 * 请问该机器人能够达到多少个格子？
 */
public class RobotRun {

    public static int count = 0;

    /**
     * 机器人从坐标（0,0） 开始
     */
    public int countStep(int row, int col, int target) {
        count = 0;
        //参数校验 省略
        boolean[][] flag = new boolean[row][col];
        return countStep(0, 0, row, col, target, flag);
    }

    private int countStep(int rowIndex, int colIndex, int row, int col, int target, boolean[][] flag) {
        //校验参数是否合法，如果不合法，返回 count
        if (rowIndex < 0 || rowIndex >= row || colIndex < 0 || colIndex >= col || flag[rowIndex][colIndex]) {
            return count;
        }
        //判断参数是否满足条件，如果满足count+1,flag 标记为true
        if (convertDigital(rowIndex, colIndex) <= target){
            count++;
            System.out.println("" + rowIndex + colIndex);
        }
        flag[rowIndex][colIndex] = true;  //标记位不再只是标记是否能够走，而是比标记是否走过
        //进行四个方向的迭代
        countStep(rowIndex - 1, colIndex, row, col, target, flag);
        countStep(rowIndex + 1, colIndex, row, col, target, flag);
        countStep(rowIndex, colIndex - 1, row, col, target, flag);
        countStep(rowIndex, colIndex + 1, row, col, target, flag);
        return count;
    }

    private int convertDigital(int rowIndex, int colIndex) {
        int result = 0;
        result += convertDigital(rowIndex);
        result += convertDigital(colIndex);
        return result;
    }

    private int convertDigital(int num) {
        int result = 0;
        while (num != 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }


    public static void main(String[] args) {
        RobotRun rr = new RobotRun();

        int i = rr.convertDigital(12);

        System.out.println(i);
    }

}
