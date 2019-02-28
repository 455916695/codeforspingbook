package com.decisive.offer.test12;

/**
 * 变态跳台阶
 * 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级... 它也可以跳上 n 级。
 * 求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */
public class AbnormalJump {

    /**
     * 普通分析：
     * 因为可以从任何台阶上，跳转到指定台阶上，所以 当前台阶的可能性等于 之前所有台阶的可能之和
     * 1  2  4
     */
    public int jump(int n) {
        int[] counts = new int[n];
        for (int i = 0; i < n; i++) {
            counts[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                counts[i] += counts[j];
            }
        }

        return counts[n - 1];
    }


    public int jumpD(int n) {
        return (int) Math.pow(2,n-1);  //通过数学推理，可以看见  f(n) = 2* f(n-1)
    }
}
