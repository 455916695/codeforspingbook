package com.ax.offer2._52_lastNumberInCircle;

import com.sun.org.apache.bcel.internal.generic.LLOAD;
import sun.security.util.Length;

/**
 * 圆圈中最后剩下的数字
 * 0,2，...，n-1这n个数字排成一个圆圈，从数字0开始每次从这个圆圈里删除第m个数字，
 * 求这个圆圈里剩下的最后一个数字
 */
public class LastNumberInCircle {
    /**
     * 方法一：
     * 使用环形链表模拟圆圈的经典解法，
     * 方法二：
     * 分析每次被删除的数字的规律并直接计算出圆圈中最后剩下的数字
     */

    //自己的想法   模拟圆圈进行删除，得到最后的数据
    public Integer lastNumber(int[] numArray, int m) {

        if (numArray == null || numArray.length < 1 || m <= 0) {    //判断 数组的合法性
            return null;
        }
        if (numArray.length == 1) {
            return numArray[0];
        }
        int lenght = numArray.length;
        int index = 0;
        while (lenght > 1) {

            index = jsIndex(m + index, lenght);  //计算出 index  要删除index

            deleteNum(numArray, index, lenght); //删除指定的数据

            lenght--;//数组长度减一
        }
        return numArray[0];
    }

    //删除数组中指定索引的值
    private void deleteNum(int[] numArray, int index, int lenght) {
        for (int i = index + 1; i < lenght; i++) {
            numArray[i - 1] = numArray[i];
        }
    }

    // 计算index 值，
    private int jsIndex(int m, int lenght) {
        int index = (m - 1) % lenght;
        return index;
    }

}
