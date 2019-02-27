package com.ax.offer2._32_MinNum;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * 输入一个数组，实现
 * 输入n 个整数，找出其中最小的 k 个数，
 * 例如：
 * 输入 4、5、1、6、2、7、3、8
 * 则：
 * 最小的 4个数字是 1、2、3、4。
 */
public class MinNum {

    /**
     * 分析：
     * 一：null
     * 二：numArray 的长度小于 k
     * 三：正常情况，数组允许修改
     */
    public int[] findMinNum(int[] numArray, int k) {

        if (numArray == null) {
            throw new RuntimeException("非法参数");
        }

        if (k > numArray.length) {
            return numArray;
        }

        int length = numArray.length - 1;
        int index = Partition.partition(numArray, 0, length, length);

        while (index != k - 1) {
            if (index > k - 1) {
                index = Partition.partition(numArray, 0, index - 1, length);
            } else {
                index = Partition.partition(numArray, index + 1, length, length);
            }
        }

        int[] result = new int[k];

        System.arraycopy(numArray, 0, result, 0, k);

        return result;
    }


    /**
     * 方法二：输入的数组不允许修改，或者数组过大，内存装不下的情况下
     * 使用容器解决问题
     */
    public int[] foundMinNum(int[] numArray, int k) {

        if (numArray == null || numArray.length < k) {
            return numArray;
        }

        TreeSet<Integer> treeSet = new TreeSet();

        for (int i : numArray) {
            if (treeSet.size() < k) {
                treeSet.add(i);
            } else {
                //判断  treeSet 的最大值是否比 i 大
                Integer maxNum = treeSet.last();
                //如果比 i 大  ,删除 最大值，添加 i
                if (maxNum > i) {
                    treeSet.remove(maxNum);
                    treeSet.add(i);
                }
            }
        }

        int[] result = new int[k];

        int count = 0;
        for (Integer integer : treeSet) {
            result[count ++] = integer;
        }

        return result;

    }


}
