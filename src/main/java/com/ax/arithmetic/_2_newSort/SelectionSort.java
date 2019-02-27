package com.ax.arithmetic._2_newSort;

import com.ax.arithmetic.interfaceSort.SortAbstract;

/**
 * 选择排序：
 * 内容：每次从数组找到最小的数据，并放到数组中对应的位置
 */
public class SelectionSort extends SortAbstract {

    public void sort(Comparable[] elements) {
        if (elements == null)
            throw new RuntimeException("paramter is sort");

        int min = 0;
        for (int i = 0; i < elements.length; i++) {
            min = i;
            for (int j = i + 1; j < elements.length; j++)
                if (less(elements[j], elements[min])) {
                    min = j;
                }
            exch(elements, min, i);
        }

        //校验一下
        boolean sorted = isSorted(elements);
        System.out.println(sorted);
    }
}
