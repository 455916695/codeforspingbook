package com.decisive.leetCode._2_math;

public class CountPrimes {
    private static boolean[] notPrime;

    //统计所有小于非负整数 n 的质数的数量。
    // /*	 * 输入: 10     
    // * 输出: 4
    // * 解释: 小于 10 的质数一共有 4 个,
    // 它们是 2, 3, 5, 7	 *	 * */
    public int countPrimes(int n) {
        if (n < 1)
            return 0;
        if (notPrime == null || notPrime.length < n) {
            notPrime = new boolean[n];  // 定义对象
        } else {
            return count(notPrime, n);
        }
        notPrime[0] = true;    // 0 不是质数
        notPrime[1] = true;    // 1 不是质数
        for (int i = 2; i * i < n; i++) {  //遍历根号个
            if (!notPrime[i]) {
                for (int j = 2 * i; j < n; j += i) {
                    notPrime[j] = true;
                }
            }
        }
        return count(notPrime, n);
    }

    /**
     *  正常情况下如何找一个数是否质数 （从2开始，找是否能被该数整除，若能则不是质数）
     *
     *
     * */

    private int count(boolean[] notPrime, int n) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (!notPrime[i]) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CountPrimes cp = new CountPrimes();

        int i = cp.countPrimes(12);

        System.out.println(i);
    }

}
