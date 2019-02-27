package com.decisive.offer.test4;


import org.junit.Assert;
import org.junit.Test;

public class ReplaceStringTest {

    @Test
    public void test() {

        ReplaceString rs = new ReplaceString();
        String replace = rs.replace(new StringBuffer("Hello,How are you?"));

        Assert.assertEquals("Hello,How%20are%20you?",replace);

    }

}
