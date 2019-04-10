package com.decisive.sort;

import java.util.List;

/**
 * 选择排序
 * 每次从后面的数组中选出最小的数字，与前面的交换
 */
public class SelectionSort implements Sort {

    @Override
    public void sort(int[] nums) {
        if (nums == null || nums.length < 2) return;
        int length = nums.length - 1;
        for (int i = 0; i < length; i++) {
            int index = findMin(nums, i);
            swap(nums, i, index);
        }
    }

    @Override
    public void sort(List nums) {
    }

    private int findMin(int[] nums, int i) {
        int result = i;
        for (; i < nums.length; i++) {
            result = nums[result] > nums[i] ? i : result;
        }
        return result;
    }

    private void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}


class Selectioned {

    /**
     * 选择排序
     **/
    public <T extends Comparable<? super T>> void sort(T[] t) {
        //校验参数是否合法
        if (t == null || t.length < 1) {
            return;
        }

        for (int i = 0; i < t.length - 1; i++) {
            int tempIndex = i;
            for (int j = i + 1; j < t.length; j++) {
                if (t[j].compareTo(t[tempIndex]) < 0) {
                    tempIndex = j;
                }
            }
            if (tempIndex != i) {
                swap(t, tempIndex, i);
            }
        }
    }

    //问题一：这个泛型表示的范围
    private <T extends Comparable<? super T>> void swap(T[] t, int tempIndex, int i) {
        T temp = t[tempIndex];
        t[tempIndex] = t[i];
        t[i] = temp;
    }
}