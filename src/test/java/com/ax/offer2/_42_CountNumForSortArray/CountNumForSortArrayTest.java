package com.ax.offer2._42_CountNumForSortArray;

import org.junit.Assert;
import org.junit.Test;

public class CountNumForSortArrayTest {

    @Test
    public void testFountFirstIndex() {
        CountNumForSortArray cnfsa = new CountNumForSortArray();
        int i = cnfsa.fountFirstIndex(new int[]{0, 1, 1, 2, 2, 3}, 2);
        Assert.assertEquals(3,i);
    }

    @Test
    public void testFountLastIndex() {
        CountNumForSortArray cnfsa = new CountNumForSortArray();
        int i = cnfsa.fountLastIndex(new int[]{0, 1, 1, 2, 2, 3}, 2);
        Assert.assertEquals(4,i);
    }

    @Test
    public void test() {
        CountNumForSortArray cnfsa = new CountNumForSortArray();
        int i = cnfsa.countNum(new int[]{0,1,1,2,2,2,2,3},2);
        Assert.assertEquals(4,i);
    }

}
