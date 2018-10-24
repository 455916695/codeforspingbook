package com.ax.arithmetic;

import java.util.ArrayList;
/**
 *  冒泡排序
 *
 *        相邻元素前后交换、把最大的排到最后。
 *        时间复杂度 O(n²)
 * */
public class BubbleSort {

    public ArrayList<Integer> bubbleSmall(ArrayList<Integer> arrayList) {
        //根据冒泡排序思路：每次循环，找到最大一个数，放到本次循环的最后一个位置
        if (arrayList == null){
            return null;
        }

        for (int i = 0 ;i<arrayList.size();i++){
            for(int j = 0;j<arrayList.size()-1 - i;j++) {
                if(arrayList.get(j ) <  arrayList.get(j+1)) {  //每次循环找到最小的一个值，放到最后
                    int temp = arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1,temp);
                }
            }
        }


        return  arrayList;
    }


    public ArrayList<Integer> bubbleBig(ArrayList<Integer> arrayList) {
        //根据冒泡排序思路：每次循环，找到最大一个数，放到本次循环的最后一个位置
        if (arrayList == null){
            return null;
        }

        for (int i = 0 ;i<arrayList.size();i++){
            for(int j = 0;j<arrayList.size()-1 - i;j++) {
                if(arrayList.get(j ) >  arrayList.get(j+1)) {//每次循环找到最大的一个值，放到最后
                    int temp = arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1,temp);
                }
            }
        }


        return  arrayList;
    }



}
