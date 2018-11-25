package com.ax.offer.singleton;

/**
 *   一、单例模式
 *      静态内部类实现
 *          1.节约了资源
 *          2.由  JVM  提供了线程安全
 * */
public class Singleton5   {  //问题拓展，Singleton5 的派生类也需要实现单例模式，如何操作比较好

    private Singleton5() {
    }
    /**
     *  当Singleton5 被加载时， 静态内部类并没有被加载
     * */
    private static  class SingletonCla  {
        private final static Singleton5 SINGLETON_5 = new Singleton5();
    }

    /**
     *   调用  getSingleton5(） 的时候，SingletonCla  才被初始化
     * */
    public static Singleton5 getSingleton5() {
        return SingletonCla.SINGLETON_5;
    }
}
