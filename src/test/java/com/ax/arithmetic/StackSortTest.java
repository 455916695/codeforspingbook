package com.ax.arithmetic;


import com.ax.arithmetic._0_sort.StackSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StackSortTest {

    @Test
    public  void  stackSortTest () {

        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(100);
        arrayList.add(111111);
        arrayList.add(111);

        List<Integer> sort = StackSort.sort(arrayList);

        System.out.println(sort.toString());
    }

}
