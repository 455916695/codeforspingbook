package com.ax.offer2._11_bitOperation;

import java.util.BitSet;

/**
 *  位运算
 *     输入一个整数，统计这整数二进制中的1的个数
 *
 * */
public class BitOperation {

    /**
     *  方法一：使用无符号右移
     * */
    public static int  counterOne(int num) {
        int count = 0;
        while (num != 0 ){
            if(( num & 1) == 1) {  //位运算比较快    一个奇怪的现象，% 运算的结果只有 31 个1
                count ++;
            }
            num =  num >>> 1;    //要记得无符号右移  与  有符号右移的区别
        }
        return count;
    }

    /**
     * 方法二：使用左移,循环的次数，等于整数的位数
     * */
    public static int counterOneForLeftMove(int num){
        if (num == 0)
            return 0;

        int count = 0;
        int i = 1;
        while ( i != 0) {
            if ((num & i) != 0 ){
                count++;
            }
            i = i<<1;
        }
        return  count;
    }

    /**
     * 方法三：(对一个数减1，再与自己进行& 运算) 这样的运算
     *          每进行一次都会使整数的最右边 的1 变成0 ，
     *          也就是说，能进行这样的运算几次，就说明有几个1
     * */
    public  static  int counterOneForJY(int num) {


        int count = 0;
        while ( num != 0 ){
            count ++ ;
            num  &= (num - 1);
        }
        return count;
    }

}
