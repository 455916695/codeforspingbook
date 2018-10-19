package com.ax.offer.singleton;

/**
 *  一:单例模式
 *      饿汉模式: 没有节约资源
 * */
public class Singleton4 {

    private  final static Singleton4 SINGLETON_4 = new Singleton4();

    private Singleton4(){}

    public static Singleton4 getSingleton4() {
        return SINGLETON_4;
    }
}
