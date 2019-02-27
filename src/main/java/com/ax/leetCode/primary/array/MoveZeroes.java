package com.ax.leetCode.primary.array;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if (nums == null) {
            throw new RuntimeException("非法参数");
        }
        int count = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (++count != i)
                    nums[count] = nums[i];
            }
        }

        for (int i = count + 1; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroes2(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int len = nums.length;
        int notZero = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[notZero++] = nums[i];
            }
        }

        while (notZero < len) {
            nums[notZero++] = 0;
        }
    }

}
