package com.ax.offer2._40_ArrayInversion;

import sun.security.util.Length;

/**
 * 数组中的逆序对：
 * 在数组中的两个数字如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对
 * 输入一个数组，求出这个数组中的逆序对的总数
 * <p>
 * 在数组中两两进行比较，并使他们有序
 * 再在这两个有序的数组中进行寻找逆序对，  以有序的前提下，寻找逆序对会快一些
 */
public class ArrayInversion {

    public int foundInversionNum(int[] arrayNum) {

        if (arrayNum == null || arrayNum.length < 2) {
            return 0;
        }

        int[] temp = new int[arrayNum.length];
        int count = countNum(arrayNum, 0, arrayNum.length - 1, temp);

        return count;
    }

    private int countNum(int[] arrayNum, int low, int high, int[] temp) {

        if (low >= high) {
            return 0;
        }
        int mid = low + ((high - low) >> 1);

        int rightCount = countNum(arrayNum, low, mid, temp);
        int leftCount = countNum(arrayNum, mid + 1, high, temp);

        int mergeCount = merge(arrayNum, low, mid, high, temp);

        return rightCount + leftCount + mergeCount;
    }

    private int merge(int[] arrayNum, int low, int mid, int high, int[] temp) {  //mid  是右边的 右边界   mid + 1 是 左边的  左边界

        int ls = mid;
        int le = low;
        int rs = high;
        int re = mid + 1;
        int index = high;
        int count = 0;

        while (le <= ls && re <= rs) {
            if (arrayNum[ls] > arrayNum[rs]) {
                temp[index--] = arrayNum[ls--];
                count += (rs - re + 1);
            } else {
                temp[index--] = arrayNum[rs--];
            }
        }

        while (le <= ls) {
            temp[index--] = arrayNum[ls--];
        }
        while (re <= rs) {
            temp[index--] = arrayNum[rs--];
        }

        while (high >= low) {
            arrayNum[high] = temp[high];
            high--;
        }
        return count;
    }


}
