package com.ax.test;


import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class StringReTest {

    @Test
    public void  StringReTest() throws UnsupportedEncodingException {

        StringRe stringRe = new StringRe();

        String string = stringRe.rotateString("PQWIVLQQ", 8, 5);
        System.out.println(string);

        String str = new String(string.getBytes("GBK"),"UTF-8");

    }

    @Test
    public void test() {
        double d = 0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001;
        double d2 = 0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002;
        if(d == 0) {
            System.out.println(d);
        }else if (d == d2){
            System.out.println(d2);
        }
    }

    @Test
    public void test3() {
        double d = 1.0/0.0;  // Infinity
        System.out.println(d/(1.0/0.0) ); // NaN


    }


}
