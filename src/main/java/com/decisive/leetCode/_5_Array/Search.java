package com.decisive.leetCode._5_Array;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.junit.Assert;
import org.junit.Test;

import java.util.Queue;

/**
 * 搜索旋转排序数组
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * 你可以假设数组中不存在重复的元素。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 */
public class Search {

    /**
     * 数组有序，可以考虑二分查找
     */
    public int search(int[] nums, int target) {

        int index = -1;

        if (nums == null || nums.length < 1) {
            return index;
        }

        int minIndex = findMin(nums);

        if (minIndex == 0) {
            index = binarySearch(nums, 0, nums.length - 1, target);
        } else if (nums[0] < target) {
            index = binarySearch(nums, 0, minIndex - 1, target);
        } else if (nums[0] > target) {
            index = binarySearch(nums, minIndex, nums.length - 1, target);
        } else {
            index = 0;
        }

        return index;
    }


    private int binarySearch(int[] nums, int left, int right, int target) {

        if (left < 0 || left > right || right < 0) {
            return -1;
        }

        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    /**
     * 寻找指定数组中的最小值
     */
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int mid;
        while (left < right) {

            //计算中间值
            mid = left + ((right - left) >>> 1);

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            }

        }
        return right;
    }

    @Test
    public void test_findMin() {
        int min = findMin(new int[]{4, 5, 6, 7, 0, 1, 2});

        System.out.println(min);

        min = findMin(new int[]{1});

        System.out.println(min);
    }

    @Test
    public void test_binarySearch() {
        int i = binarySearch(new int[]{1, 2, 3, 4, 5, 6}, 0, 5, 3);

        System.out.println(i);
    }

    @Test
    public void test_search() {
        int search = search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);

        System.out.println(search);

        search = search(new int[]{4, 5, 6, 7, 0, 1, 2}, 10);

        System.out.println(search);

        search = search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1);

        System.out.println(search);

        search = search(new int[]{1, 3}, 3);

        System.out.println(search);
    }

}
