package com.ax.test.stringTest;

import org.junit.Test;

import java.util.HashMap;

public class StringTest {

    @Test
    public  void test() {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1 == str1.intern());

        String str2 = new StringBuilder("ja").append("va").toString();  //常量
        System.out.println(str2 == str2.intern());

    }

    @Test
    public  void StringTest() {
        String str = "100";
        String str2 = "1"+new String("00");

        String str3 = "100";
        String str4 = "1"+new String("00");  //new  一片新的地址

        String str5 = "1"+"00";   //直接拼的话，回去常量池中寻找

        System.out.println(str3 == str5);
        System.out.println(str3 == str4);
        System.out.println(str2 == str);
        System.out.println(str2.equals(str));

    }

    @Test
    public  void  testStr() {

        String s = "sss%XXXXX%%YYYY%%%%CC";

        String s1 = s.replaceAll("\\%+", "%");
        System.out.println(s1);

    }
}
