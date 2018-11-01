package com.ax.test;


import org.junit.Test;

public class StringReTest {

    @Test
    public void  StringReTest() {

        StringRe stringRe = new StringRe();

        String string = stringRe.rotateString("PQWIVLQQ", 8, 5);
        System.out.println(string);

    }


}
