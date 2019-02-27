package com.ax.offer2._50_NDiceSum;

/**
 * n 个骰子的点数
 * 把n个骰子扔在地上，所有骰子朝上一面的点数之和为s.
 * 输入n,打印出s的所有可能的值出现的概率。
 */
public class ManyDiceSum {
    // TODO  n个骰子的点数问题， 其循环解法，没有掌握，还不能独立的写出相关代码
    /**
     * n 个骰子之和 等于  target  的概率
     * */
    /**
     * 递归：
     * f(n) =  f(1) + f（n-1）;(n >= 2)
     * f(1) =  1,2,3,4,5,6    (n  = 1)
     */
    public float sumProbability(int n, long target) {

        if (n < 0 || target < n || target > 6 * n) {
            return 0;   // 不可能出现的情况
        }
        if (n == 0 && target == 0) {
            return 1;
        }
        //计算出现和为 target 的次数
        //  0 位表示 出现的次数，  1 位 表示当前的总和
        int[] count = new int[]{0};
        countTar(n, n, target, count, 0);

        float p = (float) (count[0] / Math.pow(6, n));

        return p;
    }

    private void countTar(int n, int m, long target, int[] count, int sum) {
        if (m < 1) {
            return;
        }
        if (m == 1) {
            for (int i = 1; i <= 6; i++) {
                if (sum + i == target) {
                    count[0]++;
                }
            }
        }
        for (int i = 1; i <= 6; i++) {
            if (sum + i < target) {
                countTar(n, m - 1, target, count, sum + i);
            }
        }
    }

    //===============================================================================================================================================================
    //TODO 来自书上的代码
    static final int MAX_VALUE = 6;

    public static void printProbability(int number) {
        if (number < 1) {
            return;
        }

        int[][] probabilites = new int[2][MAX_VALUE * number + 1];

        int flag = 0;   //标记，用来循环切换使用上述两个数组,这小技巧使用的很巧妙，可以任意切换

        for (int i = 1; i <= MAX_VALUE; i++)   //第一个骰子
            probabilites[flag][i] = 1;

        //处理剩下的 骰子
        for (int k = 2; k <= number; k++) {
            for (int j = 0; j < k; j++)
                probabilites[1 - flag][j] = 0;  //清空即将要使用的数组

            for (int i = k; i <= MAX_VALUE * k; i++) {     // i 从 k  开始，可以理解为 ，第 k 个骰子的合，不可能小于 k ，所有前面不用遍历
                probabilites[1 - flag][i] = 0;    //这行代码是否需要
                for (int j = 1; j <= i && j <= MAX_VALUE; j++) {
                    probabilites[1 - flag][i] += probabilites[flag][i - j];    //第二次循环的每个结果，都是上次循环结果的 m - 1,m-2,m-3,m - 4,m-5,m-6的结果和
                }
            }

            flag = 1 - flag;
        }

        double pow = Math.pow(MAX_VALUE, number);  //计算出所有的可能
        for (int  i = number ; i <= MAX_VALUE * number;i++){
            System.out.println((float) probabilites[flag][i]/pow);
        }
    }

}
