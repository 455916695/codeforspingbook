package com.ax.test;

import org.junit.Test;

/**
 *  测试byte 包装类是否与String类 一样，不可修改引用
 * */
public class ByteTest {

    public void add(Byte b) {
        System.out.println(b);
         b = ++b;
    }

    @Test
    public  void  ByteTest() {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a);
        add(b);
        System.out.println(b);
    }

}
