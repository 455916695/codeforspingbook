package com.ax.arithmetic;

/**
 *  基数排序
 *
 *      个人感受：
 *          一个很巧妙的思路,同过比较各位数的值，已达到排序的目的
 *              中间使用计数排序，将各位数出现的此处记录下来，并让它们累加，已达到 对应的值与对应的序列相关联
 *
 * */
public class RadixSort {

    /**
     *  @param  array  数组
     * */
    public static void radixSort(int[] array){
        int exp;  //指数，当对数组按个位进行排序时，exp = 1；
        int max = getMax(array);   //获取数组中的最大值

        //从个位开始，对数组array  按“指数”进行排序
        for (exp = 1 ; max/exp >0 ;exp *= 10)            //max/exp>0  表示最大值，还存在位数没有进行排序
            countSort(array,exp);
    }

    /**
     * @param  array   int[]  表示要进行排序的数组
     * @param  exp    int  表示指数
     * */
    private static void countSort(int[] array, int exp) {

        int[] output = new int[array.length];  //存储“被排序数据”的临时数组
        int[] buckets = new int[10];           //（桶）  或者 （计数排序）

        //将数据出现的次数存储在buckets[] 中
        for (int i = 0;i < array.length;i++){
            buckets[(array[i]/exp)%10] ++;         // 获取要比较位数上的数字，并 在对应的 buckets[] 上++;表示该位数字出现过
        }

        //更改buckets[i]  目的是让更改后的buckets[i]的值，是该数据在output[] 中的位置
        for(int i = 1;i < 10;i++) {
            buckets[i] += buckets[i-1];    // 延续
        }

        //将数据存储到临时数组 output[] 中
        for (int i = array.length-1;i>= 0;i--){                                                      //
            output[buckets[(array[i]/exp)%10]-1] = array[i];   // array[] 中第 i个 的值，对应着output[] 中的  buckets[(array[i]/exp)%10] - 1 位置上
        }

        //将排序好的数据赋值给 array[]
        for (int i = 0;i<array.length;i++)
            array[i] = output[i];

        output = null;
        buckets = null;

    }

    private static int getMax(int[] array) {

        int max = array[0];

        for (int i = 1 ;i < array.length;i++){
            if(array[i] > max) {
                max = array[i];
            }
        }

        return  max;
    }
}
