package com.ax.offer2._39_StringDeleteRepetition;

import org.junit.Assert;
import org.junit.Test;

public class StringDeleteRepetitionTest {

    @Test
    public void test() {

        StringDeleteRepetition sdr = new StringDeleteRepetition();

        String s = sdr.deltStrRepetiton(null);
        Assert.assertNull(s);

        s = sdr.deltStrRepetiton("1223");
        System.out.println(s);

        s = sdr.deltStrRepetiton("   ");
        System.out.println(":"+s+"::");

    }


}
