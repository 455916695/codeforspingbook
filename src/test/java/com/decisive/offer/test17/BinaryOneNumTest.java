package com.decisive.offer.test17;


import org.junit.Assert;
import org.junit.Test;

public class BinaryOneNumTest {

    @Test
    public void test() {
        BinaryOneNum bon = new BinaryOneNum();
        int i = 0;
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;

        i = bon.countOne(2);
        Assert.assertEquals(1, i);

        i = bon.countOne(5);
        Assert.assertEquals(2, i);

        i = bon.countOne(0);
        Assert.assertEquals(0, i);

    }

}
