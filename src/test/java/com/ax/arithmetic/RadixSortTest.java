package com.ax.arithmetic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class RadixSortTest {


    @Test
    public void   radixSortTest () {

        int[] array = new int[]{9,5,4,8,6,3,7,1,2};

        RadixSort.radixSort(array);

        for (int i : array) {
            System.out.println(i);
        }


    }


}
