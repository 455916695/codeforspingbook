package com.decisive.leetCode._5_Array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * 零钱兑换
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 * 示例 1:
 * 输入: coins = [1, 2, 5], amount = 11
 * 输出: 3
 * 解释: 11 = 5 + 5 + 1
 * 示例 2:
 * 输入: coins = [2], amount = 3
 * 输出: -1
 * 说明:
 * 你可以认为每种硬币的数量是无限的。
 */
public class CoinChange {

    //暂时没有解决该题
    public int coinChange(int[] coins, int amount) {

        //考虑广度优先遍历试试，
        ArrayList<Coin> arrayList = new ArrayList();
        Coin coin = new Coin(amount, true);
        Coin flag = new Coin(0, false);
        arrayList.add(coin);
        arrayList.add(flag);

        int result = 0;

        while (arrayList.size() > 0) {

            Coin temp = arrayList.get(0);
            arrayList.remove(0);

            if (temp.flag) {
                if (temp.sun == 0) {
                    return result;
                } else if (temp.sun < 0) {
                    continue;
                } else {
                    for (int i = 0; i < coins.length; i++) {
                        Coin t = new Coin(temp.sun - coins[i], true);
                        arrayList.add(t);
                    }
                }
            } else {
                if (arrayList.size() > 0) {
                    arrayList.add(flag);
                    result++;
                } else {
                    break;
                }
            }

        }

        return -1;
    }

    class Coin {
        // 金额
        int sun;
        //标志位
        boolean flag;

        public Coin(int sun, boolean flag) {
            this.sun = sun;
            this.flag = flag;
        }
    }

    @Test
    public void test_coinChange() {
        int num = coinChange(new int[]{1, 2, 5}, 11);

        System.out.println(num);

        num = coinChange(new int[]{2}, 3);

        System.out.println(num);

        num = coinChange(new int[]{1, 2, 5}, 100);

        System.out.println(num);
    }

}
