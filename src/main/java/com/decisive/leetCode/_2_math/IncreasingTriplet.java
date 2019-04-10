package com.decisive.leetCode._2_math;

/**
 * 寻找数组中  是否存在  三元递增序列
 * <p>
 * 如果存在这样的 i, j, k,  且满足 0 ≤ i < j < k ≤ n-1，
 * 使得 arr[i] < arr[j] < arr[k] ，返回 true ; 否则返回 false 。
 */
public class IncreasingTriplet {

    // 思路：寻找三元递增序列，只要记录下前两个数字，再寻找第三个数字
    public boolean increasingTriplet(int[] nums) {
        //判断参数是否合法
        if (nums == null || nums.length < 3) return false;
        //定义两个变量（存放最小值   与   中间值）
        int MIN = nums[0];
        int MID = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < MIN) {
                MIN = num;
            } else if (num < MID) {
                MID = num;
            } else if (num > MID) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        IncreasingTriplet increasingTriplet = new IncreasingTriplet();

        boolean b = increasingTriplet.increasingTriplet(new int[]{2, 4, -2, -3});


    }

}
