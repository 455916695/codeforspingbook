package com.ax.arithmetic._2_newSort;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class SelectionSortTest {

    @Test
    public void test() {
        SelectionSort ss = new SelectionSort();

        ss.sort(new String[]{"2","1","4","5","3","6"});
    }


}
