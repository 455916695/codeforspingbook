package com.ax.offer._104_JumpFloorII;

import org.springframework.stereotype.Controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 *    JumpFloorII变态跳台阶
 *          题目描述
                一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级... 它也可以跳上 n 级。
                求该青蛙跳上一个 n 级的台阶总共有多少种跳法
 *         思路:每一阶都有可能前面的任意阶跳过来的
 * */
public class JumpFloorII {


    public  int jumpFloorII(int target) {
//
//        int[] means = new int[target];
//
//        Arrays.fill(means,1);  //没一阶台阶都有一次性跳上去的可能
//
//        for (int i = 0;i< means.length;i++){
//            for (int j = 0;j<i;j++){
//                means[i] += means[j];
//            }
//        }
//
//        return  means[target-1];

        int[] means = new int[target];


        for(int i = 0;i<target ;i++) {
            means[i] = 1;
        }


        for (int i = 0;i< means.length;i++){
            for (int j = 0;j<i;j++){
                means[i] += means[j];
            }
        }

        return  means[target-1];
    }


}
