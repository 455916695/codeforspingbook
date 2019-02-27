package com.ax.arithmetic.interfaceSort;

public interface ISort {

    /**
     *  排序
     * */
    public void sort(Comparable[] elements);

    /**
     *  比较 s 与  b 的大小， S 小于  b  返回true
     * */
    public boolean less(Comparable s,Comparable b);

    /**
     *  交换 f  与  t  的位置
     * */
    public void  exch(Comparable[] elements,int f,int t);

    /**
     * 判断某个数组是否是有序的
     * */
    public boolean isSorted(Comparable[] elements);

    /**
     *  循环遍历指定数组
     * */
    public void show(Comparable[] elements);
}
