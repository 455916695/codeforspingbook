package com.decisive.leetCode._5_Array;

import org.junit.Test;

/**
 * 寻找峰值
 * <p>
 * 峰值元素是指其值大于左右相邻值的元素。
 * <p>
 * 给定一个输入数组 nums，其中 nums[i] ≠ nums[i+1]，找到峰值元素并返回其索引。
 * <p>
 * 数组可能包含多个峰值，在这种情况下，返回任何一个峰值所在位置即可。
 * <p>
 * 你可以假设 nums[-1] = nums[n] = -∞。
 */
public class FindPeakElement {

    //思路：最简单的想法，是直接进行遍历寻找
    //思路二：由于解法的时间复杂度是 O(longN) ，所以可以考虑一下二分法 （但是不确认 时间复杂度可以达到 longN）







    //思路三： 题目中说 你可以假设  nums[-1] = nums[n] = -无穷大，且只需要返回任何一个峰值所在位置即可，  题目就可以转化为寻找最大值
    public int findPeakElement(int[] nums) {
        //思路三： 题目中说 你可以假设  nums[-1] = nums[n] = -无穷大，且只需要返回任何一个峰值所在位置即可，  题目就可以转化为寻找最大值
        //此处需要做参数合法校验，省略
        //特殊情况
        if (nums.length == 1) {
            return 0;
        }

        //二分法寻找最大值
        int index = findNumIndex(nums);

        return index;
    }

    private int findNumIndex(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (right - left) / 2 + left;

            //左边数存在无序
            if (nums[left] > nums[mid]) {
                //说明左边存在一个局部峰值
                right = mid - 1;
            } else if (nums[right] > nums[mid]) {
                //说明右边存在一个局部峰值
                left = mid + 1;
            } else if (nums[mid] >= nums[right] && nums[mid] >= nums[left]) {
                //判断一下该值会不会是局部峰值
                if (mid == left || mid == right) {
                    return mid;
                }
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                    return mid;
                }
                //若不是缩短左右
                left++;
                right--;
            }
        }
        //如果没有寻找到适合的值
        return right;
    }

    @Test
    public void test_findPeakElement() {

        int peakElement = findPeakElement(new int[]{2, 1});

        System.out.println(peakElement);

        peakElement = findPeakElement(new int[]{1,2, 1});

        System.out.println(peakElement);

    }

}
