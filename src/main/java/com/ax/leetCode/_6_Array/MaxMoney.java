package com.ax.leetCode._6_Array;

public class MaxMoney {
    public int maxProfit(int[] prices) {
        //问题：一、只允许完成一笔交易，如何确定利润最大化
        //思路一: 一个数一个数的进行比较得到最大值
        int low = 0;
        int high = prices.length - 1;
        int result = 0;

        while (low < high) {
            if (prices[low] > prices[low + 1]) {
                low++;
                continue;
            }
            for (int i = low + 1; i <= high; i++) {
                int temp = prices[i] - prices[low];
                if (result < temp) {
                    result = temp;
                }
            }
            low++;
        }

        return result;
    }

}
