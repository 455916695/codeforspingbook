package com.ax.arithmetic._0_sort;

import java.util.ArrayList;
import java.util.List;

/**
 *  归并排序
 *        先将数组分开：在每个各自的小区间内实现排序,再合并
 * */
public class MergeSort {


    public <T extends Comparable<? super T>>  ArrayList<T>  sort(ArrayList<T>  list) {

        ArrayList<T> tempList = new ArrayList(list.size());  //创建临时集合，供给递归过程中使用，避免递归时反复创建集合

        sort(list,0,list.size()-1,tempList);

        return  list;
    }

    /**
     *  归并排序中的分
     *
     * */
    private <T extends Comparable<? super T>> void sort(ArrayList<T> list,int left,int right,ArrayList<T> tempList) {

        if(left < right) {
            int min = (left + right)/2;

            sort(list,left,min,tempList);  //分左边
            sort(list,min+1,right,tempList);  //分右边

            merge(list,left,min,right,tempList); //合并
        }

    }
    //循环比较 左右两边的数据的大小，按顺序添加到临时列表中，再将数据复制到list中
    private <T extends Comparable<? super T>> void merge(ArrayList<T> list,int left,int min,int right,ArrayList<T> temp){
            int i = left;
            int r = min+1;
            int t = temp.size();

            // 进行左右两边区域的数据判断
            while (i<= min && r<=right){
                if(list.get(i).compareTo(list.get(r))<0){
                    temp.add(list.get(i++));
                }else {
                    temp.add(list.get(r++));
                }
            }

            // 将左边区域剩余的数据加入到temp中
            while (i <= min){
                temp.add(list.get(i++));
            }

            // 将右边区域剩余的数据加入到temp中
            while (r <= right){
                temp.add(list.get(r++));
            }

            // 将临时 templist中的数据复制到  list中
        while (left <= right){
            list.set(left++,temp.get(t++));
        }
    }

}
