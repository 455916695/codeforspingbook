package com.decisive.leetCode._2_math;

/**
 * 计算 1 的个数
 */
public class HammingWeight {
    private int result = 0;

    public int hammingWeight(int n) {
        while (n != 0) {
            if ((n & 1) == 1) result++;
            n >>= 1;
        }
        return result;
    }

    public int hammingWeight2(int n) {
        if (n == 0) return 0;
        while ((n = n & (n - 1)) != 0) {
            result++;
        }

        return result;
    }



    public static void main(String[] args) {

        HammingWeight h = new HammingWeight();
        int i = h.hammingWeight2(11);
        System.out.println(i);
    }

}
