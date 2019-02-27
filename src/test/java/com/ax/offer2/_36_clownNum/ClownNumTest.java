package com.ax.offer2._36_clownNum;


import org.junit.Assert;
import org.junit.Test;

public class ClownNumTest {

    @Test
    public void testIll() {

        ClownNum clownNum = new ClownNum();
        try {
            clownNum.foundUglyNumber(-1);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {

        ClownNum clownNum = new ClownNum();

        int integer = clownNum.foundUglyNumber(1);
        Assert.assertEquals(1, integer);
        integer = clownNum.foundUglyNumber(8);
        Assert.assertEquals(10, integer);

        integer = clownNum.foundUglyNumber(10);
        System.out.println(integer);
    }


}
