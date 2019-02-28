package com.decisive.offer.tes1;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.VoidType;

/**
 * 问题描述：
 * 实现单例模式，
 * 方式一：懒汉模式
 * 方式二：饥饿模式
 * 方式三：双重锁校验
 * 方式四：内部类模式
 * 方式五：枚举
 */
public class Singleton {

    private Singleton singleton;

    private Singleton() {
    }

    ;

    public Singleton getSingleton() {
        if (singleton == null) {
            return singleton = new Singleton();
        } else {
            return singleton;
        }
    }
}

class SingletonTwo {

    private final SingletonTwo SINGLETONTWO = new SingletonTwo();

    private SingletonTwo() {
    }

    public SingletonTwo getSingletonTwo() {
        return SINGLETONTWO;
    }

}

class SingletonThree {

    private volatile SingletonThree singletonThree;  //volatile

    private SingletonThree() {
    }

    public SingletonThree getSingletonThree() {
        if (singletonThree == null) {
            synchronized (SingletonThree.class) {
                if (singletonThree == null) {
                    singletonThree = new SingletonThree();
                }
            }
        }
        return singletonThree;
    }
}

class SingletonFour {  //创建一个静态内部类，在静态内部类中创建一个常量

    private SingletonFour() {
    }

    private static class Singleton {
        private static final SingletonFour SINGLETONFOUR = new SingletonFour();
    }

    public SingletonFour getSingletonFour() {
        return Singleton.SINGLETONFOUR;
    }
}

enum SinletonFive {

    SINLETON_FIVE;
    /**
     *  在枚举中添加相应的成员变量，
     */

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
