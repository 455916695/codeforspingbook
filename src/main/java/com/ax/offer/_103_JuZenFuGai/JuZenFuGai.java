package com.ax.offer._103_JuZenFuGai;

/**
 *  矩形覆盖
 *      题目描述
            我们可以用 2*1 的小矩形横着或者竖着去覆盖更大的矩形。
            请问用 n 个 2*1 的小矩形无重叠地覆盖一个 2*n 的大矩形，总共有多少种方法？

            本问题与跳台阶问题类似, 可以一次覆盖一个宽度，可以一次覆盖两个宽度
 * */
public class JuZenFuGai {


    public int means(int target) {
        if( target <= 2) {
            return  target;
        }

        int[] ways = new int[]{1,2,0};

        for (int i = 3; i<= target;i++){
            ways[2] = ways[1] +ways[0];
            ways[0] = ways[1];
            ways[1] = ways[2];
        }
        return ways[2];
    }

}
