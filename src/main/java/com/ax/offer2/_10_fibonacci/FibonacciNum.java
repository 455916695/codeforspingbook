package com.ax.offer2._10_fibonacci;

/**
 *  计算斐波那契数列
 * */
public class FibonacciNum {


    /**
     *  方法一:循环
     * */
    public static  int  getFibonacciNum(int itemNum) {

        if(itemNum == 0)
            return 0;
        if (itemNum == 1 || itemNum == 2)
            return 1;

        int firstTemp = 1;
        int secondTemp = 1;
        int result = 0;
        for (int i = 3;i <= itemNum;i++ ){
            result = firstTemp + secondTemp;
            secondTemp = firstTemp ;
            firstTemp = result;
        }
        return  result;
    }

    /**
     *  方法二：递归
     * */
    public static  int  getFibonacciNumForDG(int itemNum) {

        if(itemNum == 0)
            return 0;
        if (itemNum == 1 || itemNum == 2)
            return 1;

        return  getFibonacciNumForDG(itemNum -1) + getFibonacciNumForDG(itemNum-2);
    }


}
