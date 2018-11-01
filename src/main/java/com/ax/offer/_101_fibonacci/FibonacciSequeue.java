package com.ax.offer._101_fibonacci;

/**
 *  斐波那契数列
 *         题目：
 *            求斐波那契数列的第 n 项，n <= 39。
 * */
public class FibonacciSequeue {


    //递归的方式实现
    public  int  fibonacci (int n) {
        if( n == 0 || n == 1) {
            return n;
        }
        return  fibonacci(n-1)+fibonacci(n-2);
    }

    // 动态规划  迭代的进行，会导致大量的子部分被重复计算,   保留所需计算项的前两项
    public int fibonacciDT(int n) {
        if(n == 0|| n == 1)
            return n;
        int[] num = new  int[]{0,1,0};
        for (int i=2;i<=n;i++){
            num[2] = num[1] + num[0];
            num[0] = num[1];
            num[1] = num[2];
        }
        return  num[2];
    }


}
