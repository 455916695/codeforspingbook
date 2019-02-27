package com.ax.offer2._8_QuickSort;


/**
 *  快速排序
 * */
public class QuickSort {

    public  <T  extends  Comparable<? super  T>>  T[]  quickSort(T[] array) {

        array = quickSort(array,0,array.length-1);

        return array;
    }

    private <T extends  Comparable<? super  T>> T[] quickSort(T[] array, int oldLow , int oldHigh) {
        if(array == null ||  oldLow < 0 || oldHigh >array.length-1 || oldHigh <oldLow) {
            return  array;
        }

        if(oldLow == oldHigh) {
            return array;
        }

        int index = oldLow + (int) (Math.random()*(oldHigh-oldLow));
        swap(array,index,oldLow);

        //首先参数在low  到 high 中选择一个 基数
        index = oldLow ;
        int low = oldLow;
        int high = oldHigh;

        while (true) {
            if(low == high ) {
                swap(array,low,index); //交换数据，指定位置的数据
                break;
            }

            if( array[high].compareTo(array[index]) >0){  //判断high 位置的数据与 index 的数据 ， 如果过high的数据比index 的数据大，继续移动
                high --;
                continue;
            }

            if (array[low].compareTo(array[index]) <= 0){  //判断 low 位置的数据与index的数据，如果 low 的数据比 index小 继续往下移动
                low ++;
                continue;
            }
            swap(array,low,high); //交换数据
        }
        quickSort(array,oldLow,low-1);
        quickSort(array,low+1,oldHigh);

        return array;
    }

    private <T> void swap(T[] array, int low, int index) {

        T temp = array[low];

        array[low] = array[index];

        array[index] = temp;

    }

}
