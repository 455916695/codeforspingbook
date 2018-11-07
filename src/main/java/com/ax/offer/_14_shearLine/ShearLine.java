package com.ax.offer._14_shearLine;

import java.util.Map;

/**
 *  14. 剪绳子
 *      题目描述
             把一根绳子剪成多段，并且使得每段的长度乘积最大。
             n = 2
             return 1 (2 = 1 + 1)
             n = 10
             return 36 (10 = 3 + 3 + 4)
 * */
public class ShearLine {

    /**
     * 贪心算法实现：
     *      尽可能的剪长度为3的
     * */
    public int integerBreak(int n) {
        if(n <2) {
            return 0;
        }
        if ( n==2){
            return 1;
        }
        if(n==3) {
            return 2;
        }

        int tem3 = n/3;
        if((n - tem3*3 )== 1) {
            tem3 --;
        }
        int tem2 = (n - tem3* 3)/2;

        return (int) (Math.pow(3,tem3))* (int) (Math.pow(2,tem2));
    }

}
