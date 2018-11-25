package com.ax.test;

import org.junit.Test;

class TestClass {
    public static void hello() {
        System.out.println("hello");
    }
}

public class StaticTest {

    public  static  void testStatic() {
        System.out.println("Hello");

    }

    public static  void main(String[] args) {
        // TODO Auto-generated method stub
        TestClass test=new TestClass();
        test.hello();
        TestClass.hello();
    }
}
