package com.ax.offer2._1_Singleton;

/**
 *  懒汉 、饿汉 、线程安全的懒汉模式、双重判断锁、都存在着一些问题
 * */
public class Singleton {

    private Singleton () {}

    private static class  Singl {
        private static final Singleton SINGLETON = new Singleton();
    }

    public static  Singleton getSingleton(){
        return Singl.SINGLETON;
    }
}
