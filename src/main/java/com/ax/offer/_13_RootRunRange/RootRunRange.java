package com.ax.offer._13_RootRunRange;

/**
 * 13. 机器人的运动范围
 * 题目描述：
 * 地上有一个 m 行和 n 列的方格。一个机器人从坐标 (0, 0) 的格子开始移动，每一次只能向左右上下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于 k 的格子。
 * 例如，当 k 为 18 时，机器人能够进入方格 (35,37)，因为 3+5+3+7=18。
 * 但是，它不能进入方格 (35,37)，因为 3+5+3+8=19。请问该机器人能够达到多少个格子？
 */
public class RootRunRange {

    private static final int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    private int cnt = 0;  // 步数统计
    private int rows;
    private int cols;
    private int threshold;  // 限制值
    private int[][] digitSum; //计算出对应点的值

    public int movingCount(int threshold, int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.threshold = threshold;
        //将上述局部参数转化为全局参数
        initDigitSum(); //初始化对应的数组
        boolean[][] marked = new boolean[rows][cols];
        dfs(marked, 0, 0);

        return cnt; //返回所记录的步数
    }

    private void initDigitSum() {
        int[] digitSumOne = new int[Math.max(rows, cols)];
        for (int i = 0; i < digitSumOne.length; i++) {  //处理  数字个位数上的值
            int n = i;
            while (n > 0) {
                digitSumOne[i] += n % 10;
                n /= 10;
            }
        }
        this.digitSum = new int[rows][cols];
        for (int i = 0; i < this.rows; i++)
            for (int j = 0; j < this.cols; j++)
                this.digitSum[i][j] = digitSumOne[i] + digitSumOne[j];

    }

    private void dfs(boolean[][] marked, int r, int c) {
        //判断是否处于边界
        if (r < 0 || r >= rows || c < 0 || c >= cols || marked[r][c])
            return;

        marked[r][c] = true;  //表示此处以及走过，
        if (this.digitSum[r][c] > this.threshold) //判断所落格子是否符合规则
            return;
        cnt++;          //统计步数++
        for (int[] n : next) {   //回溯 上下左右
            dfs(marked, r + n[0], c + n[1]);
        }

    }

}
































