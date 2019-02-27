package com.ax.offer2._33_ArrayMaxSum;


import org.junit.Assert;
import org.junit.Test;

public class ArrayMaxSumTest {

    @Test
    public void testIll() {
        ArrayMaxSum arrayMaxSum = new ArrayMaxSum();

        try {
            arrayMaxSum.foundMaxSum(null);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        try {
            arrayMaxSum.foundMaxSum(new int[]{});
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void testD() {
        ArrayMaxSum arrayMaxSum = new ArrayMaxSum();

        int i = arrayMaxSum.foundMaxSum(new int[]{1});

        Assert.assertEquals(1, i);

    }

    @Test
    public void testZ() {
        ArrayMaxSum arrayMaxSum = new ArrayMaxSum();

        int i = arrayMaxSum.foundMaxSum(new int[]{1, -2, 3, 10, -4, 7, 2, -5});

        Assert.assertEquals(18, i);

    }


}
