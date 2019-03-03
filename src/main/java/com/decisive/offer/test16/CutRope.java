package com.decisive.offer.test16;

/**
 * 切绳子
 * 把一根绳子剪成多段，并且使得每段的长度乘积最大。
 */
public class CutRope {  //这道题如何进行计算，

    /**
     * 动态规划的算法,  将大问题划分为小问题，但是解决小问题的是否需要注意是否正确
     * <p>
     * 将大问题，划分成小问题，将多刀的问题转化成 基于 一刀的问题  （小问题：一刀的最大值）
     */
    public int cutRopeMax(int length) {
        //参数校验
        int[] resultArray = new int[length + 1];
        resultArray[1] = 0;
        resultArray[2] = 1;
        for (int i = 2; i <= length; i++) {
            for (int j = 1; j < i; j++) {
                resultArray[i] = Math.max(resultArray[i], Math.max((i - j) * j, resultArray[j] * (i - j))); //内部的比较，（i-j）*j  是为了计算出只需一刀就能解决问题的方式
            }
        }
        return resultArray[length];
    }

    /**
     * 贪心算法
     * 尽可能的切出3，
     */
    public int cutRopeMaxD(int length) {

        if (length <= 1) {
            return 0;
        }
        if (length == 2) {
            return 1;
        }

        if (length == 3) {
            return 2;
        }

        int count = 0;
        count = length / 3;
        length %= 3;
        int pow = (int) Math.pow(3, count);
        if (length == 0)
            return pow;
        if (length == 1)
            return (pow / 3) * 4;
        return pow * length;
    }

}
