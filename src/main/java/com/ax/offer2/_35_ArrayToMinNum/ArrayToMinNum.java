package com.ax.offer2._35_ArrayToMinNum;

import java.util.Arrays;

/**
 * 输入一个数组,将数组中的数据，进行排列组合
 * 输出其中最小的排列组合
 */
public class ArrayToMinNum {
    /**
     * 分析：
     * 思路;
     * 一：
     * 获取所有的排列组合，比较，记录其中最小的值
     * <p>
     * 二：
     * if  ab > ba  ===》  a > b |  ab == ba  ==》 a==b | ab < ba ===》 a  < b
     * 推广：
     * 大数在后，小数在前
     * 问题转化：  排序 ，以及表示
     * 有可能存在大数问题，及其范围超过了 int 的表示范围
     */
    public String minNum(int[] numArray) {
        if (numArray == null || numArray.length < 1) {
            return null;
        }
        if (numArray.length == 1) {
            return numArray[0] + "";
        }
        //为了比较第一位的数据，将
        String[] strArray = intToStr(numArray);
        Arrays.sort(strArray);

        StringBuilder stringBuilder = new StringBuilder();
        for (String s : strArray) {
            stringBuilder.append(s);
        }

        return  stringBuilder.toString();
    }

    private String[] intToStr(int[] numArray) {

        String[] strArray = new String[numArray.length];

        for (int i = 0; i < numArray.length; i++) {

            strArray[i] = numArray[i] +"";

        }
        return strArray;
    }

}
