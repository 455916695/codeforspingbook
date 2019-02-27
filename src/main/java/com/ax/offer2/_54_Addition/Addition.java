package com.ax.offer2._54_Addition;

/**
 * 不用加减乘除做加法
 * 写一个函数，求两个整数之和，要求在函数体内不得使用 + 、- 、* 、 /  四则运算符合
 */

/**
 * 位运算
 * 思路：
 * 1.先每位相加
 * 2.再进行进位，如果进位 的时候产生了 进位就再次进位
 */
public class Addition {

    public int add(int addNum, int addedNum) {
        int jw = 0;
        int sum = 0;

        while (addedNum != 0) {
            sum = addNum ^ addedNum;
            jw = (addNum & addedNum) << 1;
            addNum = sum;
            addedNum = jw;
        }
        return addNum;
    }
}
