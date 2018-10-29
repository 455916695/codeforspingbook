package com.ax.arithmetic;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QuickSortTest {

    @Test
    public  void  quickSortForNullTest(){

        List<Integer> list = null;

        QuickSort quickSort = new QuickSort();

        list = quickSort.quickSort(list);

        Assert.assertNull(list);

    }

    @Test
    public  void  quickSortTest(){

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);

        QuickSort quickSort = new QuickSort();

        list = quickSort.quickSort(list);
//
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(3);

        Assert.assertEquals(arrayList,list);
    }


}
