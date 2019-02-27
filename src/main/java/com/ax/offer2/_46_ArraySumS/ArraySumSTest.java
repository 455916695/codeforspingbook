package com.ax.offer2._46_ArraySumS;


import org.junit.Assert;
import org.junit.Test;

public class ArraySumSTest {

    @Test
    public void testNull() {

        ArraySumS ass = new ArraySumS();

        int[] ints = ass.foundNum(null, 1);
        Assert.assertNull(ints);

        ints = ass.foundNum(new int[]{1}, -1);
        Assert.assertNull(ints);

        ints = ass.foundNum(new int[]{1, 2, 3, 4}, -1);
        Assert.assertNull(ints);

        ints = ass.foundNum(new int[]{1, 2, 3, 4}, 10);
        Assert.assertNull(ints);

    }


    @Test
    public void test() {

        ArraySumS ass = new ArraySumS();

        int[] ints = ass.foundNum(new int[]{1, 2, 3, 4}, 4);

        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }


}
