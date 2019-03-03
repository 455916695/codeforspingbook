package com.decisive.offer.test17;

/**
 * 计算一个二进制数据中，一的个数
 */
public class BinaryOneNum {

    /**
     * 小技巧:  n & n-1   =====>  n 的二进制 减末尾 1
     *   O(logM) 时间复杂度解法，其中 M 表示 1 的个数。
     */
    public int countOne(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num &= (num - 1);
        }
        return count;
    }


    public int counOneD(int num) {
        int count = 0;
        while ((num & 1) != 0) {
            count++;
            num >>>= 0b1;
        }

        return count;
    }

    public int countOneDD(int num) {
        int count = 0;
        int n = 1;
        while ((n & num) != 0) {
            n <<= 1;
            count++;
        }
        return count;
    }


}
