package com.decisive.offer.test11;

/**
 * 矩形覆盖
 * 我们可以用 2*1 的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1 的小矩形无重叠地覆盖一个 2*n 的大矩形，总共有多少种方法？
 */
public class RectangleCover {
    //可以通过列举的方式，寻找出题目的规律
    public int rectangleCover(int n) {
        if (n < 2) {
            return n;
        }
        int pre = 1;
        int alt = 2;
        int t = 0;
        for (int i = 3; i <= n; i++) {
            t = alt;
            alt = alt + pre;
            pre = t;
        }
        return alt;
    }

}
