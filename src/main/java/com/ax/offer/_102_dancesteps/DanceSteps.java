package com.ax.offer._102_dancesteps;

/**
 *  跳台阶
 *          题目描述
                一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法
 * */
public class DanceSteps  {

//  递归思路
    public int dances(int n) {
        if(n<=2) {
            return n;
        }
        return  dances(n-1)+dances(n-2);
    }

//    迭代思路
    public int dancesDT(int n) {
        //思路:跳台阶的问题是可以迭代的

        if(n <= 2){
            return n;
        }
        int[] means = new int[]{1,2,0};

        for (int i = 3 ; i <= n ;i++){
            means[2] = means[1]+means[0];
            means[0] = means[1];
            means[1] = means[2];
        }
        return means[2];
    }

}
