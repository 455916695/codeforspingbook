package com.ax.arithmetic;

import com.ax.arithmetic._0_sort.RadixSort;
import org.junit.Test;

public class RadixSortTest {


    @Test
    public void   radixSortTest () {

        int[] array = new int[]{9,5,4,8,6,3,7,1,2};

        RadixSort.radixSort(array);

        for (int i : array) {
            System.out.println(i);
        }


    }
    @Test
    public void   radixSortForNullTest () {

        int[] array = null;

        try {
            RadixSort.radixSort(array);

        }catch (Exception e){

        }



    }


}
