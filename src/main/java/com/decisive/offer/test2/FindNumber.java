package com.decisive.offer.test2;

import org.springframework.expression.spel.ast.ValueRef;

/**
 * 查询数组中重复的数据
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为 7 的数组 {2, 3, 1, 0, 2, 5}，那么对应的输出是第一个重复的数字 2。
 * 要求复杂度为 O(N) + O(1)，也就是时间复杂度 O(N)，空间复杂度 O(1)。
 * 因此不能使用排序的方法，也不能使用额外的标记数组。
 * 牛客网讨论区这一题的首票答案使用 nums[i] + length 来将元素标记，这么做会有加法溢出问题。
 */
public class FindNumber {

    /**
     * 思路：由于复杂度为O(n)+O（1）
     * 所以遍历一次，且（在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内）
     */
    public int find(int[] nums) {
        //首先校验是否出现非法参数
        if (nums == null || nums.length < 2) {
            throw new RuntimeException("非法参数");
        }

        int i = 0;
        while (i < nums.length) {
            System.out.println(1);
//            如果对应的序号存放对应的数据，就进行下一个
            if (i == nums[i]) {
                i++;
                continue;
            }
            if (nums[i] == nums[nums[i]])
                return nums[i];
            swap(nums, i,nums[i]);  //交换数组中，两个指定 索引的数据
        }
        throw new RuntimeException("没有重复的数据");
    }
    /**
     *  交换
     * */
    private void swap(int[] nums, int i,int j) {
        // 交换指定区域上的数据
        int temp = nums[i];//2
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
