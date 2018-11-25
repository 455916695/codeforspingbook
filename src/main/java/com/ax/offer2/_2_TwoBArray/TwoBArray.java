package com.ax.offer2._2_TwoBArray;

/**
 *   二维数组
 *
 * */
public class TwoBArray {

    public static boolean  findNumTwoArray(int[][] array,int num) {

        if(array == null || array.length <=0  || array[0] == null ) {
            return false;
        }
        int rows = 0;
        int cols = array[0].length-1;
        while (rows < array.length && cols >=0){
            if( num >array[rows][cols]) {
                rows ++;
            }else if (num <array[rows][cols]){
                cols --;
            }else {
                return true;
            }
        }
        return  false;
    }

}
