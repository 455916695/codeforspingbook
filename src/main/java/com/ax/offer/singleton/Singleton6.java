package com.ax.offer.singleton;

import org.junit.Test;

/**
 *  一、单例模式
 *      枚举类型
 * */
public enum Singleton6 {

    INSTANCE;


    private  String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
