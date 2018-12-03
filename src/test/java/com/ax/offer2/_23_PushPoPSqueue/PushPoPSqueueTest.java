package com.ax.offer2._23_PushPoPSqueue;

import org.junit.Assert;
import org.junit.Test;

public class PushPoPSqueueTest {

    @Test
    public void test() {

        PushPoPSqueue pps = new PushPoPSqueue();

        boolean popSqueue = pps.isPopSqueue(null, null);
        Assert.assertFalse(popSqueue);

        popSqueue = pps.isPopSqueue(new int[]{1,2,3}, new int[] {1,2,3,4});
        Assert.assertFalse(popSqueue);

        popSqueue = pps.isPopSqueue(new int[]{1,2,3,4,5}, new int[] {4,3,5,1,2});
        Assert.assertFalse(popSqueue);

        boolean popSqueue1 = pps.isPopSqueue(new int[]{1, 2, 3}, new int[]{3, 2, 1});
        Assert.assertTrue(popSqueue1);

    }

}
