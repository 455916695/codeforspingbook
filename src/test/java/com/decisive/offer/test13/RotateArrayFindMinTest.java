package com.decisive.offer.test13;


import org.junit.Assert;
import org.junit.Test;

public class RotateArrayFindMinTest {

    @Test
    public void test() {
        RotateArrayFindMin raf = new RotateArrayFindMin();

        int min = raf.findMin(new int[]{4, 5, 1, 2, 3});

        Assert.assertEquals(min,1);

        min = raf.findMin(new int[]{4, 4, 4, 2, 4});

        Assert.assertEquals(min,2);
    }

}
