package com.ax.offer2._36_clownNum;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 丑数
 * 题目：
 * 我们把只包含因子 2/3/5 的数作丑数（Ugly Number）。
 * 求按从小到大的顺序的第1500个丑数。
 * 例如:
 * 6、8都是丑数，但14 不是，因为它包含了因子7.习惯上我们把1当做第一个丑数。
 */
public class ClownNum {

    private ArrayList<Integer> uglyNum = new ArrayList<>();
    private int t2Index;
    private int t3Index;
    private int t5Index;
    private int maxIndex;

    {
        uglyNum.add(1);
        uglyNum.add(2);
        uglyNum.add(3);
        uglyNum.add(4);
        uglyNum.add(5);
        uglyNum.add(6);
        uglyNum.add(9);

        maxIndex = 6;
        t5Index = 1;
        t3Index = 3;
        t2Index = 4;
    }

    public Integer foundUglyNumber(int index) {

        if (index <= 0) {
            throw new RuntimeException("非法参数");
        }
        if (index <= uglyNum.size()) {
            return uglyNum.get(index - 1);
        }

        while (uglyNum.size() < index) {
            foundNextUglyNum();
        }

        return uglyNum.get(index - 1);

    }

    private void foundNextUglyNum() {
        //获取下一个
        int t2Num = uglyNum.get(t2Index) * 2;
        int t3Num = uglyNum.get(t3Index) * 3;
        int t5Num = uglyNum.get(t5Index) * 5;

        int min = t2Num;
        //求出最小值
        min = t2Num > t3Num ? t3Num > t5Num ? t5Num : t3Num : t2Num > t5Num ? t5Num : t2Num;

        uglyNum.add(min);
        maxIndex++;

        //更新 t2 t3 t5
        updateT();
    }

    private void updateT() {
        while (uglyNum.get(t2Index) * 2 <= uglyNum.get(maxIndex))
            t2Index++;

        while (uglyNum.get(t3Index) * 3 <= uglyNum.get(maxIndex))
            t3Index++;

        while (uglyNum.get(t5Index) * 5 <= uglyNum.get(maxIndex))
            t5Index++;
    }
}
