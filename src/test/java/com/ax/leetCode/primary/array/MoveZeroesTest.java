package com.ax.leetCode.primary.array;

import org.junit.Test;

public class MoveZeroesTest {

    @Test
    public void test() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = new int[]{1, 0, 2, 0, 3, 4};
        moveZeroes.moveZeroes(nums);

        for (int num : nums) {
            System.out.println(num);
        }


    }

}
