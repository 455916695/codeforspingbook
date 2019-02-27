package com.ax.offer2._47_SumNum;

/**
 * 输入一个正数s,打印出所有和为 s 的连续正数序列(至少含有两个数)。
 * 例如输入15，由于 1 + 2 + 4 + 5 = 4 + 5 + 6 = 7 + 8 = 15
 */

import java.util.ArrayList;

/**
 * 特点： 连续正数序列
 */
public class SumNum {
    /**
     *
     * */
    public ArrayList<int[]> found(int target) {
        int samll = 1;
        int big = 2;

        if (target <= 0) {
            return null;
        }

        int sum = 3;
        int mid = target >> 1;
        ArrayList<int[]> arrayList = new ArrayList<>();

        while (samll < mid) {
            if (sum < mid) {
                big++;
                sum += big;
            } else if (sum > mid) {
                sum -= samll;
                samll++;
            } else {
                int[] resultArray = createArray(samll, big);
                arrayList.add(resultArray);
                sum -= samll;
                samll++;
            }
        }
        return arrayList;
    }

    private int[] createArray(int samll, int big) {

        int length = big - samll + 1;

        int[] numArray = new int[length];

        for (int i = 0; i < length; i++) {
            numArray[i] = samll++;
        }

        return numArray;
    }
}
