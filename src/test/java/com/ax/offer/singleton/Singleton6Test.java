package com.ax.offer.singleton;

import org.junit.Assert;
import org.junit.Test;

public class Singleton6Test {

    @Test
    public void test() {
        Singleton6 firstSingleton = Singleton6.INSTANCE;
        firstSingleton.setName("firstSingleton");
        System.out.println(firstSingleton.getName());

        Singleton6 secondSingleton = Singleton6.INSTANCE;
        secondSingleton.setName("secondSingleton");
        System.out.println(secondSingleton.getName());

        Singleton6[] enumConstants = Singleton6.class.getEnumConstants();
        for (Singleton6 singleton6 : enumConstants){
            System.out.println(singleton6.getName());
        }


    }


    @Test
    public void Singleton5Test() {

        Singleton5 singleton5 = Singleton5.getSingleton5();
        Singleton5 singleton6 = Singleton5.getSingleton5();
        Singleton5 singleton7 = Singleton5.getSingleton5();

        Assert.assertEquals(singleton5,singleton6);
        Assert.assertEquals(singleton5,singleton7);

    }

}
