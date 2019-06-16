package com.decisive.leetCode._5_Array;

import org.junit.Assert;
import org.junit.Test;

/**
 * 在排序数组中查找元素的第一个和最后一个位置
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * 如果数组中不存在目标值，返回 [-1, -1]。
 */
public class SearchRange {

    public int[] searchRange(int[] nums, int target) {
        //有序查找第一个要想到的就是二分法
        if (nums == null || nums.length < 1) {
            return new int[]{-1, -1};
        }
        //查询开头
        int start = findNumFirstIndex(nums, 0, nums.length - 1, target);
        //查询结尾
        int end = findNumLastIndex(nums, 0, nums.length - 1, target);

        return new int[]{start, end};
    }

    private int findNumLastIndex(int[] nums, int left, int right, int target) {
        int mid = 0;
        while (left <= right) {
            //计算出中间值
            mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (mid == right || nums[mid + 1] != target) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private int findNumFirstIndex(int[] nums, int left, int right, int target) {
        int mid = 0;
        while (left <= right) {
            //计算出中间值
            mid = left + (right - left) / 2;

            //判断各种情况
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (left == right) {
                return right;
            } else {
                right = mid;
            }

        }
        return -1;
    }


    @Test
    public void test_findNumFirstIndex() {
        int numLastIndex = findNumFirstIndex(new int[]{1, 1, 1, 1, 1, 1}, 0, 5, 1);

        System.out.println(numLastIndex);
        Assert.assertEquals(0, numLastIndex);
    }

    @Test
    public void test_findNumLastIndex() {
        int numLastIndex = findNumLastIndex(new int[]{1, 1, 1, 1, 1, 1}, 0, 5, 1);

        System.out.println(numLastIndex);
        Assert.assertEquals(5, numLastIndex);
    }
}
