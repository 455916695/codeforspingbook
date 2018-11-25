package com.ax.offer2._3_replace;


import org.junit.Assert;
import org.junit.Test;

public class ReplaceTest {


    @Test
    public void testsStrRe() {

        Replace  replace = new Replace();

        String xx = replace.replcae("Hello World !", "XX");

        Assert.assertEquals("HelloXXWorldXX!",xx);

    }

    @Test
    public void  replaceTest() {

        String replace = Replace.replace("Hello World  !", ' ', "XXOO");

        Assert.assertEquals("HelloXXOOWorldXXOOXXOO!",replace);

    }


    @Test
    public void replace2Test() {
        String xx = Replace.replace("", '\0', "XX");
        System.out.println(xx);
    }

}
