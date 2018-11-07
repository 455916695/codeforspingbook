package com.ax.offer._14_shearLine;

import org.junit.Assert;
import org.junit.Test;

public class ShearLineTest {

    @Test
    public void integerBreakTest() {
        ShearLine shearLine = new ShearLine();
        int length = shearLine.integerBreak(5);
        Assert.assertEquals(6,length);
    }

}
