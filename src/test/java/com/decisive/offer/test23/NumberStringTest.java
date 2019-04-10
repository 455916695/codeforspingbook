package com.decisive.offer.test23;

import org.junit.Assert;
import org.junit.Test;

public class NumberStringTest {


    /*
    如，字符串 "+100","5e2","-123","3.1416" 和 "-1E-16" 都表示数值。
 * 但是 "12e","1a3.14","1.2.3","+-5" 和 "12e+4.3" 都不是。

    * */

    @Test
    public void test() {
        NumberString ns = new NumberString();
        boolean number = ns.isNumber("+100");
        Assert.assertTrue(number);
        number = ns.isNumber("5e2");
        Assert.assertTrue(number);
        number = ns.isNumber("-123");
        Assert.assertTrue(number);
        number = ns.isNumber("3.1416");
        Assert.assertTrue(number);
        number = ns.isNumber("-1E-16");
        Assert.assertTrue(number);



        number = ns.isNumber("12e");
        Assert.assertFalse(number);
        number = ns.isNumber("1a3.14");
        Assert.assertFalse(number);
        number = ns.isNumber("1.2.3");
        Assert.assertFalse(number);
        number = ns.isNumber("+-5");
        Assert.assertFalse(number);
        number = ns.isNumber("12e+4.3");
        Assert.assertFalse(number);
    }

}
