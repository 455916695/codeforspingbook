package com.decisive.base;
/**
*  类在被调用静态资源时，会被初始化
* */
public class ClassLoadStaticTest {
    public static String hello = "hello";
    public static final String WORLD = "WORLD";

    static {
        System.out.println("ClassLoadStaticTest 被初始化了 ");
    }

    public static void main(String[] args) {

        System.out.println(ClassLoadChild.hello);
        /**
         *   ClassLoadStaticTest 被初始化了
         *   HelloWorld
         * */

    }

}

class ClassLoadChild extends ClassLoadStaticTest {
    static {
        System.out.println("ClassLoadChild 被初始化了 ");
    }
}

class TestClass {
    public static void main(String[] args) {
        System.out.println(ClassLoadChild.WORLD);
        /**
         *  运行结果
         *    WORLD
         * */

    }
}