package com.decisive.offer.test15;


import org.junit.Assert;
import org.junit.Test;

public class RobotRunTest {

    @Test
    public void test() {
        RobotRun rr = new RobotRun();

        int i = rr.countStep(3, 3, 2);
        System.out.println(i);
        Assert.assertEquals(6, i);

        i = rr.countStep(10, 10, 2);
        System.out.println(i);
        Assert.assertEquals(6, i);
    }
}
