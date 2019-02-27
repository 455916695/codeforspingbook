package com.ax.offer2._45_ArrayCountOneNum;


import org.junit.Assert;
import org.junit.Test;

public class ArrayCountOneNumTest {

    @Test
    public void testNull() {

        ArrayCountOneNum acon = new ArrayCountOneNum();

        int[] ints = acon.foundCountOneNum(null);
        Assert.assertNull(ints);
        ints = acon.foundCountOneNum(new int[]{1});
        Assert.assertNull(ints);
        ints = acon.foundCountOneNum(new int[]{3});
        Assert.assertNull(ints);
    }

    @Test
    public void testIll() {

        ArrayCountOneNum acon = new ArrayCountOneNum();

        try {
            acon.foundCountOneNum(new int[]{1, 2, 3, 4, 5, 6});
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        try {
            acon.foundCountOneNum(new int[]{1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9});
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {

        ArrayCountOneNum acon = new ArrayCountOneNum();

        int[] ints = acon.foundCountOneNum(new int[]{1, 1, 2, 2, 3, 3, 4, 5});
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }


}
