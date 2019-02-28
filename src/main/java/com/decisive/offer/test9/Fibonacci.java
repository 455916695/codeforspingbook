package com.decisive.offer.test9;

/**
 * 问题：计算斐波那契数列
 */
public class Fibonacci {

    /**
     * 计算 斐波那契 第n项
     */
//    递归
    public int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //    迭代
    public int fibonacciD(int n) {
        if (n <= 2) {
            return 1;
        }
        int temp = 1;
        int tempTwo = 1;
        for (int i = 3; i <= n; i++) {
            int t = tempTwo;
            tempTwo = temp + tempTwo;
            temp = t;
        }
        return tempTwo;
    }


}
