package com.ax.arithmetic;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BubbleSortTest {

    @Test
    public  void testSort() {

        BubbleSort bubbleSort = new BubbleSort();


        ArrayList<Integer> bubble = bubbleSort.bubbleSmall(null);

        Assert.assertNull(bubble);
    }

    @Test
    public  void  sortTestForNotNull() {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(10);

        BubbleSort bubbleSort = new BubbleSort();
        ArrayList<Integer> bubbleBig = bubbleSort.bubbleBig(arrayList);
        for (Integer integer : bubbleBig){
            System.out.println(integer);
        }

        ArrayList<Integer> bubbleSmall = bubbleSort.bubbleSmall(arrayList);
        for (Integer integer : bubbleSmall){
            System.out.println(integer);
        }
    }

}
