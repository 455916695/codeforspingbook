package com.ax.arithmetic;

import com.ax.arithmetic._0_sort.MergeSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 *  归并排序的测试
 * */
public class MergeSortTest {

    @Test
    public void  mergeSortForNullTest() {

        MergeSort mergeSort = new MergeSort();

        ArrayList<Integer> arrayList = new ArrayList<>();

        ArrayList<Integer> arrayList1 = new ArrayList<>();

        mergeSort.sort(arrayList);

        Assert.assertEquals(arrayList1,arrayList);
    }



    @Test
    public void  mergeSortTest() {

        MergeSort mergeSort = new MergeSort();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(500);

        ArrayList<Integer> arrayList1 = new ArrayList<>();

        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(3);
        arrayList1.add(3);
        arrayList1.add(500);

        mergeSort.sort(arrayList);

        Assert.assertEquals(arrayList1,arrayList);
    }

}
