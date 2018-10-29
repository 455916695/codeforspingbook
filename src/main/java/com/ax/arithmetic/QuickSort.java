package com.ax.arithmetic;

import java.util.List;

/**
 *   快速排序
 *          对于有序数组，遍历的速度很快，一遍就可以了
 * */
public class QuickSort {


    /**
    *  快速排序
    *
     * @param dataList*/
    public <T extends  Comparable<? super T>> List<T> quickSort(List<T> dataList) {

        if(dataList == null){
            return  dataList;
        }

        List<T> list = quickSort(dataList,0,dataList.size()-1);

        return  list;
    }

    private  <T extends Comparable<? super T>> List<T> quickSort(List<T> dataList, int left, int right){

        // 判断条件
        if(dataList == null || left > right) {
            return dataList;
        }

        // 进行处理
        // 从左边获取基准数
        T temp = dataList.get(left);

        //获取左边 索引值
        int i = left;   //左边
        int j = right;  //右边

        // 进入循环
        while (i<j){

//            从左边开始寻找比基准数小的数据
            while (temp.compareTo(dataList.get(j))<0 && i <j ){
                j--;
            }

//          从右边开始寻找比基准数大的数据
            while ( temp.compareTo(dataList.get(i))>=0 && i<j ){
                i++;
            }

//          从左边找完了，从右边也找完了，且 两边没有相遇，就交换数据
            if(i < j) {
                T t = dataList.get(i);
                dataList.set(i,dataList.get(j));
                dataList.set(j,t);
            }
        }

//       完成上述循环，表示找到了基准数的位置
        dataList.set(left,dataList.get(i));
        dataList.set(i,temp);

        dataList = quickSort(dataList, left, i - 1);    //递归处理左边的结果
        dataList = quickSort(dataList, i + 1, right);    //递归处理右边的结果

        return dataList;
    }


}




































