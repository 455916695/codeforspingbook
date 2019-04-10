package com.decisive.common;

/**
 * 通用工具类
 */
public class CommonUtils {

    public static void print(int[] nums) {
        if (nums == null) return;
        for (int num : nums) {
            System.out.print(num);
        }
        System.out.println("");
    }

}
