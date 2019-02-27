package com.ax.offer2._49_revolveStr;


import org.junit.Test;

public class RevolveStrTest {

    @Test
    public void testT() {
        RevolveStr rs = new RevolveStr();

        String s = rs.resverseStr("", 5);
        System.out.println(s);
        s = rs.resverseStr("12345", 5);
        System.out.println(s);
    }

    @Test
    public void testP() {
        RevolveStr rs = new RevolveStr();

        String s = rs.resverseStr("123456", 1);

        System.out.println(s);

    }


}
