package com.ax.offer2._8_QuickSort;

import org.junit.Test;

public class QuickSortTest {

    @Test
    public void  quickSortTest() {
        QuickSort quickSort = new QuickSort();

        Integer[] array = {8,3,4,9,2,8,100,9,3,4,5,4,6,9,7,8,9,9,2,1,3,10};

        quickSort.quickSort(array);

        for (Integer integer : array) {
            System.out.println(integer);
        }
    }
}
