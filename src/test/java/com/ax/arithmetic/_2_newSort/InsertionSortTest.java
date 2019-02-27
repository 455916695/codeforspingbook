package com.ax.arithmetic._2_newSort;


import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void test() {

        InsertionSort is = new InsertionSort();
        String[] str = new String[]{"5", "1", "3", "2", "8"};
        is.sort(str);
        is.show(str);
    }

}
