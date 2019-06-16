package com.decisive.leetCode._5_Array;

import org.junit.Test;

/**
 * 返回该章节
 * 跳跃游戏
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个位置。
 * 示例 1:
 * 输入: [2,3,1,1,4]
 * 输出: true
 * 解释: 从位置 0 到 1 跳 1 步, 然后跳 3 步到达最后一个位置。
 * 示例 2:
 * 输入: [3,2,1,0,4]
 * 输出: false
 * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
 */
public class CanJump {

    //如果判断出自己是否能够跳跃到指定位置
    //当前位置距离目标位置的距离


    public boolean canJump(int[] nums) {
        //第一个思路：递归的进行跳跃，类似于跳楼梯

        //参数是否合法
        if (nums == null || nums.length < 1 || nums[0] < 0) {
            return false;
        }

        boolean[] flag = new boolean[nums.length];
        flag[0] = true;
        for (int i = 1; i < nums.length; i++) {
            //每次判断一个位置能否跳跃
            for (int j = 0; j < i; j++) {
                //我们只需判断当前节点能否直接跳跃到目标节点即可
                if (nums[j] >= (i - j) && flag[j]) {
                    flag[i] = true;
                    break;
                }
            }
        }

        return flag[nums.length - 1];
    }


    public boolean canJump_2(int[] nums) {
        //判断参数是否合法

        //动态规划 思路
        int endIndex = nums.length - 1;
        for (int i = endIndex - 1; i >= 0; i--) {
            if (nums[i] >= (endIndex - i)) {
                endIndex = i;
            }
        }
        if (endIndex == 0) {
            return true;
        }
        return false;
    }


    @Test
    public void test_canJump() {

        boolean b = canJump(new int[]{2, 3, 1, 1, 4});

        System.out.println(b);

        b = canJump(new int[]{3, 2, 1, 0, 4});

        System.out.println(b);
        b = canJump(new int[]{0, 2, 3});

        System.out.println(b);

    }

    @Test
    public void test_canJump_2() {
        boolean b = canJump_2(new int[]{2, 3, 1, 1, 4});
        System.out.println(b);

        b = canJump_2(new int[]{3, 2, 1, 0, 4});
        System.out.println(b);

        b = canJump(new int[]{0, 2, 3});
        System.out.println(b);
    }

}
