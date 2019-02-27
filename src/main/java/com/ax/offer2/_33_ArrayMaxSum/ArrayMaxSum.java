package com.ax.offer2._33_ArrayMaxSum;

/**
 * 连续子数组的最大和
 * 输入一个整型数组，数组里有正数也有负数。
 * 数组中一个或连续的多个整数组成一个子数组。
 * 求所有子数组的和的最大值
 * 要求时间复杂度为 O(n)
 */
public class ArrayMaxSum {

    /**
     *   分析：
     *       存放两个变量：一个记录当前的子数组的和，一个记录目前最大的子数组的和
     *             修改当前子数组的和关建，就在于 加上第 i 个值后是否 大于 0
     *
     * */
    /**
     * f（i）  个的值：
     * 就是求  数组中的 第 i 个值  与  前 f(i-1) 的值的结果
     * f(i)  --|
     * |  f( i - 1 ) + data[i]        //  i != 0  ||  f（i - 1） >0
     * |   data[i]                   // i == 0  || f(i - 1) <=0
     */
    public int foundMaxSum(int[] numArray) {

        if (numArray == null || numArray.length < 1) {
            throw new RuntimeException("非法参数，数组不能为null");
        }

        int resultSum = 0;  //最终的Sum
        int tempSum = 0;  //临时sum
        for (int i = 0; i < numArray.length; i++) {

            if (tempSum <= 0) {
                tempSum = numArray[i];
            } else {
                tempSum = tempSum + numArray[i];
            }
            if (tempSum > resultSum) {
                resultSum = tempSum;
            }
        }

        return resultSum;
    }

}
