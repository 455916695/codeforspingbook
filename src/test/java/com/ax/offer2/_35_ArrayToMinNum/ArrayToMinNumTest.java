package com.ax.offer2._35_ArrayToMinNum;


import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayToMinNumTest {

    @Test
    public void testNull() {

        ArrayToMinNum atmn = new ArrayToMinNum();

        String s = atmn.minNum(null);

        Assert.assertNull(s);

    }


    @Test
    public void test() {

        ArrayToMinNum atmn = new ArrayToMinNum();

        String s = atmn.minNum(new int[]{1});
        System.out.println(s);
        s = atmn.minNum(new int[]{1, 2, 3});
        System.out.println(s);
        s = atmn.minNum(new int[]{1, 11411, 4});
        System.out.println(s);
        int[] numArray = new int[]{7,6,5,4,3,2,1,0};
        Arrays.sort(numArray,1,7);
        for (int i : numArray) {
            System.out.println(i);
        }

    }


}
