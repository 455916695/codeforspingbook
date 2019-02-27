package com.ax.offer2._43_BinaryTreeHigh;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeHighTest {

    @Test
    public void test() {
        BinaryTreeHigh  bth = new BinaryTreeHigh();
        int high = bth.foundTreeHigh(null);
        Assert.assertEquals(0,high);

        high = bth.foundTreeHigh(new TwoTree());
        Assert.assertEquals(1,high);

        high = bth.foundTreeHigh(new TwoTree(1,new TwoTree(2,new TwoTree(),null),new TwoTree()));
        Assert.assertEquals(3,high);
    }

}
