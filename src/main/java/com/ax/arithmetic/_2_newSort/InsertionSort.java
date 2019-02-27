package com.ax.arithmetic._2_newSort;

import com.ax.arithmetic.interfaceSort.SortAbstract;
import org.junit.Test;

/**
 * 插入排序：
 * 内容：循环遍历数组，每次都将遍历到的内容，插入到前数组左边合适的位置
 */
public class InsertionSort extends SortAbstract {

    public void sort(Comparable[] elements) {
        if (elements == null)
            throw new RuntimeException("parameter is null");

        for (int i = 1; i < elements.length; i++) {  //注意是否会产生数组越界异常
            Comparable temp = elements[i];
            int count = 0;
            for (int j = i - 1; j >= 0; j--) {
                //统计左边有多少个比 第 i 个值大的
                if (!less(elements[j], temp)) {
                    count++;
                } else {
                    j = -1;
                }
            }
            for (int k = 1; k <= count; k++) {
                elements[i - k + 1] = elements[i - k];
            }
            elements[i - count] = temp;
        }
        boolean sorted = isSorted(elements);
        System.out.println(sorted);

    }

}
