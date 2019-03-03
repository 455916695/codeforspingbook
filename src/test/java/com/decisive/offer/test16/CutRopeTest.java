package com.decisive.offer.test16;


import org.junit.Assert;
import org.junit.Test;

public class CutRopeTest {

    @Test
    public void test() {

        CutRope cr = new CutRope();
        int i = 0;
        int i1 = 0;
        i = cr.cutRopeMax(7);
        i1 = cr.cutRopeMaxD(7);
        Assert.assertEquals(12,i);
        Assert.assertEquals(12,i1);

        i = cr.cutRopeMax(9);
        i1 = cr.cutRopeMaxD(9);

        Assert.assertEquals(27,i);
        Assert.assertEquals(27,i1);

        i = cr.cutRopeMax(10);
        i1 = cr.cutRopeMaxD(10);

        Assert.assertEquals(36, i);
        Assert.assertEquals(36,i1);

    }


}
