package com.decisive.leetCode._5_Array;

import org.junit.Test;
import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

/**
 * 最长子序列
 * Longest Increasing Subsequence
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
 * 示例:
 * 输入: [10,9,2,5,3,7,101,18]
 * 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 * 说明:
 * 可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。
 * 你算法的时间复杂度应该为 O(n2) 。
 * 进阶: 你能将算法的时间复杂度降低到 O(n log n) 吗?
 */
public class LengthOfLIS {

    public int lengthOfLIS(int[] nums) {

        if (nums == null || nums.length < 1) {
            return 0;
        }

        //如何分析这个问题？  后面与前面的 有关联的
        //记录 i 位前的 子序列
        List<Integer> list = new ArrayList();

        //逆序遍历子序列
        for (int num : nums) {
            updateLis(list, num);
        }

        //返回长度
        return list.size();
    }

    //逆序遍历list，将 num 修改入list
    private void updateLis(List<Integer> list, int num) {

        //逆序遍历list
        int length = list.size();

        if (length == 0 || num > list.get(length - 1)) {
            list.add(num);
            return;
        }

        length--;

        int lastMin = findLastMin(list, length, num);

        list.set(lastMin + 1, num);

    }


    /**
     * 寻找最后一个比 num 小的数据索引
     */
    private int findLastMin(List<Integer> list, int length, int num) {

        int left = 0;
        int right = length;

        // 这里必须是 <=
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (list.get(mid) >= num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    @Test
    public void test_updateLis() {

        List<Integer> arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(9);

        updateLis(arrayList, 5);

        print(arrayList);
    }

    @Test
    public void test_lengthOfLIS() {
        int length = lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
        System.out.println("length:" + length);
    }


    private void print(List<Integer> arrayList) {
        if (arrayList != null) {
            for (Integer integer : arrayList) {
                System.out.print(integer);
                System.out.println("，");
            }
        } else {
            System.out.println("arrayList is null");
        }
    }

}
