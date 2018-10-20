package com.ax.offer.twodimensionalarray;

/**
 *    二、题目
 *      在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
 *      数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。
 *      请找出数组中任意一个重复的数字。
 * */
public class TwoDimensionalArray {
    /**
     *  思路：遍历数组，判断遍历的值是否与被遍历数据的索引值对应，如果相等就进行下一次循环，如果不相等，就判断对应索引上的值是否与本值相等，如果相等就返回，不相等就交换
     *
     * */
    public static  Integer findRepetitionNum(int[] numArray ){

        if(numArray == null || numArray.length <=1 ) {
            return  null;
        }

        for (int i= 0; i< numArray.length;i++){
            while (numArray[i] != i ){
                if(numArray[i] == numArray[numArray[i]]) {
                    return numArray[i];
                }else {
                    Integer team = numArray[i];
                    numArray[i] = numArray[numArray[i]];
                    numArray[team] = team;

                }
            }
        }

        return  null;
    }

}
