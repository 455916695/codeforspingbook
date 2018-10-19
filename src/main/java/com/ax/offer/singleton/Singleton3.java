package com.ax.offer.singleton;
/**
 *  一、单例模式
 *      双重校验锁：
 *          对局部上锁
 * */
public class Singleton3 {

    /**
     *  在成员变量上加  volatile 关键字
     * */
    private volatile static  Singleton3 singleton3;

    private  Singleton3(){}

    public static Singleton3 getSingleton3() {
        if(singleton3 == null) {
            synchronized (Singleton3.class ){
                if (singleton3 ==null){
                    return  singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
