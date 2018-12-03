package com.ax.offer2._13_n_bit_num;


/**
 *  输入一个正整数 n，则 从 1 打印到  最大 n 位数
 * */
public class PrintNBitNumber {

    public static void printNum(int  n) {
        //情况一：n  非法
        //情况二：n 非常大，超出 long 9223372036854775807 能表示的最大值
        if( n <= 0 ) {
            throw new RuntimeException("非法参数输入");
        }
        //使用数组表示
        byte[] numArray = new byte[n];
        while (add(numArray,numArray.length-1)){
           printNumArray(numArray);
        }

    }

    private static void printNumArray(byte[] numArray) {
        boolean flag = true;
        for (int i = 0;i<numArray.length;i++){
            if(flag && numArray[i] == 0 ) {
                continue;
            }
            flag = false;
            System.out.print(numArray[i]);
        }
        System.out.println("");
    }

    //加1  ,并需要准确判断出终止状态
    private static boolean add(byte[] numArray,int bitNum) {
        if(bitNum == -1) {  //如果进入了这个if 就是到了结束的时候了
            numArray[0] = 9;
            return false;
        }
        if((++numArray[bitNum])>9) {   //这个if如果没有进去就是自增加1，进去了就进位
            numArray[bitNum] = 0;
            return add(numArray,bitNum-1);
        }
        return true;
    }

}
