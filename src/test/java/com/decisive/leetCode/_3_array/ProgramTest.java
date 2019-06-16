package com.decisive.leetCode._3_array;

import org.junit.Test;

public class ProgramTest {


    public int removeDuplicates(int[] nums) {

        //判断是否为null
        if (nums == null || nums.length == 0) {
            return 0;
        }

        //若为null 或长度不足直接返回
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }

        return index + 1;

    }


    @Test
    public void test() {

        int i = removeDuplicates(new int[]{1, 1, 1});

        System.out.println(i);

    }

}
