package com.ax.arithmetic._1_basics;

/**
 * 欧几里德 的计算最大公约数的算法
 *     如果q 不为0， r 等于  q 除 p 的余数
 *     则 q 与 r 的最大公约数，就是 p 与  q 的最大公约数
 */
public class MaxCommonDivisor {

    public static long maxCommonDivisor(long q, long p) {
        if (q < 0 || p < 0) {
            throw new RuntimeException("非法参数");
        }

        if (q == 0 || p == 0) {
            if (p != 0) {
                return p;
            }
            return q;
        }

        long r = q % p;

        return maxCommonDivisor(r, p);
    }
}
