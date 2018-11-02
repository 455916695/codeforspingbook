package com.ax.offer._105_minNumberInRotateArray;

/**
 *  旋转数组的最小数字
 *      题目描述
         把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
        输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
         例如数组 {3, 4, 5, 1, 2} 为 {1, 2, 3, 4, 5} 的一个旋转，该数组的最小值为 1。

        题意：从一个升序数组的，旋转数组中，找到最小值

    思路：
        可用二分法:
            1.arrays[m] >= arrays[h] ,说明最小值，在 m -- h  之间，l = m +1;
            2.否则  最小值在  l -- m 之间，让 h = m；
        特殊情况；
            数组允许出现重复，就需要转换思路，从 l -- h  之间进行逐一比较出最小值
 * */
public class MinNumberInRotateArray {

    public int minNumberInRotateArray(int[] nums) {

        if(nums == null || nums.length <=0) {  //如果 数组不存在，就返回一个默认值为0
            return 0;
        }

        int left = 0;
        int high = nums.length-1;

        while (left < high){
            int mid = left + (high-left)/2;   //这样计算的好处，如果数组长度过长，不会出现溢出情况

            if (nums[left] == nums[mid] && nums[mid] == nums[high]){  //比较数据
                return  minNumber(nums,left,high);  //逐步比较最小值
            }
            if(nums[mid] >= nums[high]) {
                left = mid +1;
            }else {
                high = mid;
            }
        }

        return  nums[left];
    }

    /**
     *  遍历 ，找出最小值
     * */
    private int minNumber(int[] nums, int left, int high) {

        for (int i = left;i<high;i++)   {
            if(nums[i] >nums[i+1]) {
                return  nums[i+1];
            }
        }
        return  nums[high];
    }

}
