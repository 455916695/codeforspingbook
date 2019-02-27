package com.ax.offer2._31_CountArray;


import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class CountArrayTest {

    @Test
    public void testNull() {
        CountArray ca = new CountArray();
        try {
            int num = ca.findNum(null);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testC() {
        CountArray ca = new CountArray();

        int[] numArray = new int[]{1, 2, 3, 2, 2, 2, 2, 2, 2, 4};
        int num = ca.findNum(numArray);

        Assert.assertEquals(2,numArray[num]);

        int i = ca.countNum(new int[]{1, 2, 3, 2, 2, 2, 2, 2, 2, 4});
        Assert.assertEquals(2,i);
    }


}
