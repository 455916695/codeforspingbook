package com.ax.leetCode._6_Array;

import java.util.Stack;

/**
 *  给定一个整数数组 nums ，
 *  找到一个具有最大和的连续子数组（子数组最少包含一个元素），
 *  返回其最大和。
 * */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {  //一下是错误解法
        //遍历数组，
        //如果发现数组前面的和，小于0，
        //判断下一个数字 是否 比 和大，大就直接赋值
        // 就把后一个数字赋值给总和结果
        int result = nums[0];
        int temp = nums[0];

        for(int i = 1;i<nums.length;i++) {
            if(nums[i] < 0 ){
                //判断是否大于temp,如果大于temp,就直接赋值给temp
                if(nums[i] > temp) {
                    temp = nums[i];
                }else{
                    //说明连续中断了
                    if(temp > result) {
                        result = temp;
                        temp = nums[i];
                    }
                }
            }else{
                if(temp < 0) {
                    temp = nums[i];
                }else{
                    temp += nums[i];
                }
            }
        }


        Stack<Integer> stack = new Stack();
        if(!stack.isEmpty()) {
            stack.peek();
            stack.pop();
        }
        return temp > result ? temp : result;
    }

}
