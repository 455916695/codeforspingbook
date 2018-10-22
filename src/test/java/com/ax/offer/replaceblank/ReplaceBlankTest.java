package com.ax.offer.replaceblank;


import org.junit.Assert;
import org.junit.Test;

public class ReplaceBlankTest {

    @Test
    public void replaceBlankTest() {

        ReplaceBlank replaceBlank = new ReplaceBlank();

        String afterStr = replaceBlank.replaceBlank(new StringBuffer("xxx xx x"));

       Assert.assertEquals("xxxoooxxooox",afterStr);
    }

}
