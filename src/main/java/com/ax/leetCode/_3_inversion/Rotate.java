package com.ax.leetCode._3_inversion;

public class Rotate {

    public void rotate(int[][] matrix) {
        //有一种想法，按圈旋转，宽为1 的旋转 1 - 1 位，宽为2的 旋转 2-1 位，由外向里递归
        //此处需要存在，matrix的校验，此处省略
        rotate(matrix,matrix[0].length,0);
    }

    public void rotate(int[][] matrix,int width,int count){
        if(width <= 1) {
            return ;
        }
        //针对这一圈进行旋转
        //位移一次
        for(int i = 1 ; i <= width-1;i++ ) {
            rotateOneBit(matrix,width,count);
        }
        //递归里面的一圈
        rotate(matrix,width-2,++count);
    }

    public void rotateOneBit(int[][] matrix,int width,int count) {
        int row = count;
        int col = count;
        int temp = matrix[count+1][count];
        for(int i = count+2;i<count+width;i++) {
            matrix[i-1][count] = matrix[i][count];
        }
        for(int i = count+1;i<count+width;i++) {
            matrix[count+width-1][ i-1] = matrix[count+width-1][ i];
        }
        for(int i = count+width-2;i>=count;i--) {
            matrix[i+1][count+width-1] = matrix[i][count+width-1];
        }
        for(int i = count+width-2;i>=count;i--) {
            matrix[count][i+1] = matrix[count][i];
        }
        matrix[count][count] = temp;
    }

}
