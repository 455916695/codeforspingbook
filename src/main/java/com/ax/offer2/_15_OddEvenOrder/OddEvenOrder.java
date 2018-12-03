package com.ax.offer2._15_OddEvenOrder;

/**
 *  给定一个数组
 *      要求：将数组中的数据，按奇数排在前面，偶数排在后面
 * */
public class OddEvenOrder {

    public  int[] oddEvenOrder(int[] numArray) {
        //情况一：非法参数;
        //情况二：正常情况;
        if(numArray == null) {
            return numArray;
        }
        int low = 0;
        int high = numArray.length - 1;
        while (low != high) {
            if (judge(numArray,low) != 0 ){  //找偶数
                low++;
                continue;
            }
            if(judge(numArray,high) != 1) {  //找奇数
                high -- ;
                continue;
            }
            //找到了奇数与偶数 ，交换数据
            int temp = numArray[low];
            numArray[low] = numArray[high];
            numArray[high] = temp;
        }
        return numArray;
    }

    private int judge(int[] numArray, int pNum) {  //是奇数，返回1，不是奇数返回0
        if((numArray[pNum] & 1 )== 1) {  //此处 思考，正负数 是否有影响
            return 1;
        }
        return 0;
    }

}
