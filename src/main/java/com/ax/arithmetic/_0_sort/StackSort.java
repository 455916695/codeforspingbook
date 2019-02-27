package com.ax.arithmetic._0_sort;

import java.util.List;

/**
 *  堆排序
 *
 * */
public class StackSort {

    public static <T extends Comparable<? super T>> List<T> sort(List<T> list) {
//        1.构建大顶堆
        for (int  i = list.size()/2-1;i>=0;i--){         //从第一个非叶子节点开始遍历，从右到左，从下到上的调整每一个根节点与叶子节点的大小关系
//            从第一个非叶子节点从下至上，从右至左调整结构
            adjustHeap(list,i,list.size());
        }

//        2.调整堆结构 + 交换堆顶元素与末尾元素
        for (int j = list.size()-1;j>0;j--){
            swap(list,0,j);//将堆顶元素与末尾元素进行交换
            adjustHeap(list,0,j);
        }

        return  list;
    }

    private static <T extends Comparable<? super T>> void swap(List<T> list, int i, int j) {
        T t = list.get(i);
        list.set(i,list.get(j));
        list.set(j,t);
    }

    private static  <T extends Comparable<? super T>> void adjustHeap(List<T> list,int i,int length) {
        T temp = list.get(i);  //取出第i个元素
        // 从i节点的左子节点开始
        for(int  k = i*2 + 1 ;k<length; k = k*2+1) {
            // 判断是否存在右子节点，如果存在，判断 左右子节点的大小
            if( k+1<length && list.get(k).compareTo(list.get(k+1))<0) {
                k++;
            }
            //判断 第k 个节点与 第 i个节点的大小，如果 第 k 个节点比第i 节点大，就进行交换
            if(list.get(k).compareTo(temp)>0) {
                list.set(i,list.get(k));
                i = k;
            }else {
                break;
            }
        }
        list.set(i,temp);  // 将temp 值放到最终的位置
    }
}
