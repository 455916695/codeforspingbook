package com.ax.arithmetic;


import com.ax.arithmetic._0_sort.InsertSort;
import org.junit.Test;

import java.util.ArrayList;

public class InsertSortTest {

    @Test
    public void insertSortAscTest() {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(10);

        InsertSort insertSort = new InsertSort();
        ArrayList<Integer> arrayList1 = insertSort.insertSortAsc(arrayList);
        for (Integer integer : arrayList1){
            System.out.println(integer);
        }
    }

    @Test
    public void insertSortDecTest() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(10);

        InsertSort insertSort = new InsertSort();
        ArrayList<Integer> arrayList1 = insertSort.insertSortDec(arrayList);
        for (Integer integer : arrayList1){
            System.out.println(integer);
        }
    }


    @Test
    public void insertSortDecStringTest() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("ArraySet");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("Z");
        arrayList.add("X");
        arrayList.add("g");

        InsertSort insertSort = new InsertSort();
        ArrayList<String> arrayList1 = insertSort.insertSortDec(arrayList);
        for (String str : arrayList1){
            System.out.println(str);
        }
    }

}
