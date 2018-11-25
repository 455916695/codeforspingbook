package com.ax.offer2._1_Singleton;


import com.ax.offer2._1_Singleton.Singleton;
import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void SingletonTest() {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        Assert.assertEquals(singleton,singleton2);
    }

}
