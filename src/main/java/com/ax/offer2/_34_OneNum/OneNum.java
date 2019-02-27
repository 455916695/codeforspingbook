package com.ax.offer2._34_OneNum;

/**
 * 1到 n  整数中  1 出现的次数
 * 题目：输入一个整数n,求从1到n 这n 个整数的十进制表示中1 出现的次数
 * 例如：
 * 输入12，从 1 到 12 这些整数中包含 1 的数字有  1 ，10 ，11，和 12 一共出现了 5 次
 */
public class OneNum {
    /**
     * 通过分析计算出相应的数据
     */
    public int oneNum(int num) {
        if (num < 1) {
            return 0;
        }
        String numStr = num + "";
        int length = numStr.length();   //换一种方式 获取数据的位数
        int[] powerNine = new int[length];  //比 m-1  小 1
        int[] powerTen = new int[length];  //比 m-1  小 1
        int[] lenFac = new int[length - 1];        //length的阶乘
        power(powerNine, 9);  //计算出 9 的相应的次方，并存入数组
        power(powerTen, 10);  //计算出 9 的相应的次方，并存入数组
        lenFac(lenFac);       //计算出 位数的阶乘
        int result = oneNum(num, powerNine, powerTen, lenFac, length);
        return result;
    }

    private int oneNum(int num, int[] powerNine, int[] powerTen, int[] lenFac, int length) {

        if (num < 10) {
            if (num > 0) {
                return 1;
            }
            return 0;
        }

        //计算A
        int resultA = oneNum(num % powerTen[length - 1], powerNine, powerTen, lenFac, length - 1);
        //计算B
        int resultB = 0;
        if ((num / powerTen[length - 1]) > 1) {
            resultB = makeB(2, length - 1, powerTen);
        } else {
            resultB = num%powerTen[length-1] +1;
        }
        //计算C


        int resultC = 0;
        if((num / powerTen[length - 1]) > 1) {
            resultC = (num / powerTen[length - 1]) * makeC(length - 1, powerNine, lenFac);
        }else {
            resultC =  makeC(length - 1, powerNine, lenFac);
        }


        return resultA + resultB + resultC;
    }

    private int makeC(int length, int[] powerNine, int[] lenFac) {
        int result = 0;
        for (int i = 1; i <= length; i++) {
            result += (lenFac[length - 1] * powerNine[length - i]) / (lenFac[i - 1]);
        }
        return result;
    }

    private int makeB(int n, int m, int[] powerTen) {
        int result = 1;
        for (int i = 1; i < n; i++) {
            result *= powerTen[m];
        }
        return result;
    }

    private void lenFac(int[] lenFac) {
        if (lenFac == null || lenFac.length < 1) {
            return;
        }
        lenFac[0] = 1;
        for (int i = 1; i < lenFac.length; i++) {
            lenFac[i] = lenFac[i - 1] * (i + 1);
        }
    }

    private void power(int[] powerNine, int num) {
        if (powerNine == null || powerNine.length < 1) {
            return;
        }
        powerNine[0] = 1;
        for (int i = 1; i < powerNine.length; i++) {
            powerNine[i] = powerNine[i - 1] * num;
        }
    }


}
