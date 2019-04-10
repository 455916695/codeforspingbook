package com.decisive.leetCode._2_math;

import java.util.ArrayList;

public class IsPowerOfThree {
    /**
     * 思路一：采用循环，可以用除法或乘法
     */
    public boolean isPowerOfThree(int n) {
        int temp = 1;
        while (temp <= n) {
            if (temp == n)
                return true;
            temp *= 3;
        }
        return false;
    }

}
