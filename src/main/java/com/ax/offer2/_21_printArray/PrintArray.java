package com.ax.offer2._21_printArray;

/**
 * 顺时针打印矩阵
 */
public class PrintArray {

    /**
     * 情况一: 输入的参数不是合法的矩阵
     * 情况二：
     */
    public void printAll(int[][] numArray) {
        if (numArray == null) {
            return;
        }
        int hLength = numArray.length;
        if (hLength < 0) {
            throw new RuntimeException("非法参数");
        }
        int wLenght = numArray[0].length;
        for (int[] ints : numArray) {
            if (ints == null || ints.length != wLenght) {
                throw new RuntimeException("非法参数");
            }
        }
        int start = 0;
        while (start <= hLength / 2 && start <= wLenght / 2) {
            printR(numArray,hLength-1,wLenght-1,start);
            start++;
        }
    }

    /**
     * 注意判断每圈的拐点
     * @param numArray
     * @param hLength
     * @param wLength
     * @param start
     */
    private void printR(int[][] numArray, int hLength, int wLength, int start) {

        //输出上行
        for (int i = start;i <= wLength-start;i++){
            System.out.println(numArray[start][i]);
        }
        //输出右列
        for (int i = start+1;i <= hLength-start;i++){
            System.out.println(numArray[i][wLength-start]);
        }
        //输出下行
        for (int i = wLength -start-1;i>=start;i--){  //此处是否需要大于等于
            System.out.println(numArray[hLength-start][i]);
        }
        //输出左列
        for (int i = hLength-start-1;i>start;i--){  //此处是否需要大于等于
            System.out.println(numArray[i][start]);
        }

    }

}
