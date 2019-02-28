package com.decisive.offer.test10;

/**
 * 问题：青蛙跳台阶
 * <p>
 * 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */
public class JumpSteps {

    public int count(int n) {
        if (n <= 2) {
            return n;
        }
        int pre = 1;
        int aft = 2;
        for (int i = 3; i <= n; i++) {
            int temp = aft;
            aft = aft + pre;
            pre = temp;
        }
        return aft;
    }
}
