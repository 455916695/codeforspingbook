package com.ax.offer.singleton;
/**
 *   一、单例模式
 *      懒汉模式：线程安全版
 *             ：  上锁的范围太大，影响效率
 * */
public class Singleton2 {

    private static  Singleton2 singleton2;

    private  Singleton2(){}

    /**
     *  加上  synchronized  修饰符
     * */
    public synchronized static  Singleton2 getSingleton2() {
        if(singleton2 != null) {
            return singleton2;
        }
        return  singleton2 = new Singleton2();
    }
}
