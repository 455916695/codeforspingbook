package com.ax.leetCode._6_Array;

public class StoneGame {
    public boolean stoneGame(int[] piles) {
        //存在一个问题，在不知道数组内容的情况下，我们并不知道，怎样拿才能获得最大总和
        //什么叫亚历克斯和李 都发挥出最佳水平，
        //统计亚历克斯所拿石子数
        int sum = 0;  //所有的石头数
        int length = piles.length-1;

        for(int i = 0;i<= length;i++) {
            sum += piles[i];
        }

        int countLeft =  sumY(piles,length,0,sum,0,length);  //数组，数组长度，当前亚历克斯拿的石子数目，石子总数，当前拿走了几堆
        int countRight = sumY(piles,length,0,sum,0,length);


        if((countLeft << 1) > sum || (countRight << 1) > sum) {
            return true;
        }
        return false;
    }
    //数组，数组长度，当前亚历克斯拿的石子数目，石子总数，当前拿走了几堆
    public int sumY (int[] piles,int length,int currentNum,int sum,int low,int high) {
        // 一：所拿数目大于一半，
        // 二： low > high
        if((currentNum << 1) > sum  || low > high){
            return currentNum;
        }
        int  countLL =  sumY(piles,length,currentNum+piles[low],sum,low+2,high);
        int  countLR =  sumY(piles,length,currentNum+piles[low],sum,low+1,high-1);

        int  countRR =  sumY(piles,length,currentNum+piles[high],sum,low,high-2);
        int  countRL =  sumY(piles,length,currentNum+piles[high],sum,low+1,high-1);

        //找四个中最大的返回
        int max = countLL;

        if(countLR > max) {
            max = countLR;
        }

        if(countRR > max) {
            max = countRR;
        }

        if(countRL > max) {
            max = countRL;
        }
        return max;
    }
}
