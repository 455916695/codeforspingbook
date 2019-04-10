package com.decisive.leetCode._2_math;

public class MissingNumber {

    public int missingNumber(int[] nums) {

        int result = nums.length;

        //此处缺少对参数的判断
        int temp = nums[0];
        // 循环遍历数组，将每个数字安放到自己的位置上
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i && nums[i] < nums.length) {
                temp = nums[nums[i]]; //先取出对应位置上的数字
                nums[nums[i]] = nums[i];
                nums[i] = temp;

                i--;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        int i = missingNumber.missingNumber(new int[]{3, 0, 1});
        System.out.println(i);
        i = missingNumber.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        System.out.println(i);

        i = missingNumber.missingNumber(new int[]{0});
        System.out.println(i);
    }

}
