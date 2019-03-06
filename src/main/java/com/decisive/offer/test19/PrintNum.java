package com.decisive.offer.test19;

/**
 * . 打印从 1 到最大的 n 位数
 * 输入数字 n，按顺序打印出从 1 最大的 n 位十进制数。
 * 比如输入 3，则打印出 1、2、3 一直到最大的 3 位数即 999。
 */
public class PrintNum {

   private boolean max = false;     //使用标志位，记录数据是否达到最大值

    /**
     * 思路：
     * 一：要注意大数范围， n 位数 可能会超出
     * 二：所以要实现 数字的 增加
     */
    public void printNum(int n) {

        int[] nums = new int[n]; //使用数组记录数据

        while (!max) {
            printNum(nums);
            numAdd(nums, n - 1);
        }
    }

    /**
     * 数据自增++
     */
    private void numAdd(int[] nums, int bitNum) {
        if (max) return;  //如果数据已经是最大值，返回

        nums[bitNum]++; //数据指定位++
        if (nums[bitNum] >= 10) {  //说明需要进位了
            if (bitNum == 0) {
                max = true;
                max(nums);
            } else {
                nums[bitNum] = 0;
                numAdd(nums, bitNum - 1);
            }
        }

    }

    /**
     * 是数据变为最大值
     */
    private void max(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = 9;
        }
    }

    /**
     * 打印出相关数据
     */
    private void printNum(int[] nums) {
        boolean flag = false;

        for (int num : nums) {
            if(num != 0 || flag){
                flag = true;
                System.out.print(num);
            }
        }
        System.out.println("");

    }

}
