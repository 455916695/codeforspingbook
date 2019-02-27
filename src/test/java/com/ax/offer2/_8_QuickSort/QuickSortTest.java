package com.ax.offer2._8_QuickSort;

import org.junit.Test;

public class QuickSortTest {

    @Test
    public void  quickSortTest() {
        QuickSort quickSort = new QuickSort();

        Integer[] array = {1,2,3,2,2,2,2,2,4};

        quickSort.quickSort(array);

        for (Integer integer : array) {
            System.out.println(integer);
        }
    }
}
