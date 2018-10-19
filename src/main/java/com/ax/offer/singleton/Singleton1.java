package com.ax.offer.singleton;
/**
 *   1.单例模式
 *      懒汉实现方式
 *         :缺点： 存在线程安全问题，当多线程访问时会出现线程安全问题
 * */
public class Singleton1 {

    private   static Singleton1 singletonClass ;

    private Singleton1( ) {
    }

    public static Singleton1 getSingletonClass() {
        if(singletonClass != null) {
           return  singletonClass;
        }
        return  singletonClass = new Singleton1();
    }
}
