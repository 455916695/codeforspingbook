package com.ax.arithmetic._0_sort;

import java.util.ArrayList;

/**
 *
 * 插入排序算法实现
           插入排序算法有种递归的思想在里面，它由N-1趟排序组成。初始时，只考虑数组下标0处的元素，只有一个元素，显然是有序的。
           然后第一趟 对下标 1 处的元素进行排序，保证数组[0,1]上的元素有序；
          第二趟 对下标 2 处的元素进行排序，保证数组[0,2]上的元素有序；
             .....
             .....
         第N-1趟对下标 N-1 处的元素进行排序，保证数组[0,N-1]上的元素有序，也就是整个数组有序了。
         它的递归思想就体现在：当对位置 i 处的元素进行排序时，[0,i-1]上的元素一定是已经有序的了。
 * */
public class InsertSort {

    /**
     *   插入排序
     *
     * */
    public <T extends Comparable<? super T>> ArrayList<T> insertSortAsc(ArrayList<T> arrayList) {

        if (arrayList == null)
            return null;

        for (int i = 0 ;i<arrayList.size();i++){

            T temp =  arrayList.get(i);
            int j ;
            for (j = i;j>0 && temp.compareTo(arrayList.get(j-1))<0;j--){
                arrayList.set(j,arrayList.get(j-1));
            }

            arrayList.set(j,temp);
        }

        return arrayList;
    }


    /**
     * decline*/
    public <T extends Comparable<? super T>> ArrayList<T> insertSortDec(ArrayList<T> arrayList) {

        if (arrayList == null)
            return null;

        for (int i = 0 ;i<arrayList.size();i++){

            T temp =  arrayList.get(i);
            int j ;
            for (j = i;j>0 && temp.compareTo(arrayList.get(j-1))>0;j--){
                arrayList.set(j,arrayList.get(j-1));
            }
            arrayList.set(j,temp);
        }
        return arrayList;
    }
}
