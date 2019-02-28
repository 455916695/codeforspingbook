package com.decisive.offer.test12;


import org.junit.Assert;
import org.junit.Test;

public class AbnormalJumpTest {

    @Test
    public void test() {
        AbnormalJump aj = new AbnormalJump();
        int i = aj.jumpD(5);
        int jump = aj.jump(5);
        Assert.assertEquals(i,jump);
    }


}
