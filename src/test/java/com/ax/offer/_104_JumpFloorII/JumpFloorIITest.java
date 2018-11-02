package com.ax.offer._104_JumpFloorII;

import org.junit.Assert;
import org.junit.Test;

/**
 *  疯狂跳台阶
 *
 * */
public class JumpFloorIITest {

    @Test
    public void jumpFloorTest(){

        JumpFloorII jumpFloorII = new JumpFloorII();

        int i = jumpFloorII.jumpFloorII(2);

        Assert.assertEquals(2,i);

    }
}
