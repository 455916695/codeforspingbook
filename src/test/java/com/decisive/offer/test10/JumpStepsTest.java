package com.decisive.offer.test10;


import org.junit.Assert;
import org.junit.Test;

public class JumpStepsTest {

    @Test
    public void test() {

        JumpSteps js = new JumpSteps();
        int count = js.count(5);
        Assert.assertEquals(8,count);
    }


}
