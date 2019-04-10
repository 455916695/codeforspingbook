package com.spring.pojo.test;

import com.spring.pojo.Car;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *  反射测试
 * */
public class ReflectTest {

    public static Car initObject() throws Throwable {
        //1.通过类装载器获取Car类对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?> clazz = loader.loadClass("com.spring.pojo.Car");

        //2.获取类的默认构造器对象并通过它实例化Car
        Constructor<?> cons = clazz.getDeclaredConstructor((Class[]) null);
        Car car = (Car) cons.newInstance();

        //3.通过反射方法设置属性
        Method setBrand = clazz.getMethod("setBrand", String.class); //根据方法名，和参数类型获取方法对象
        setBrand.invoke(car,"星际1");
        Method setColor  = clazz.getMethod("setColor",String.class); //
        setColor.invoke(car,"蓝色");
        Method setMaxSpeed  = clazz.getMethod("setMaxSpeed",String.class); //
        setMaxSpeed.invoke(car,"200");

        return car;
    }

    public static String  stringS() throws Throwable {
        //1.通过类装载器获取Car类对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?> clazz = loader.loadClass("java.lang.String");
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor((Class) String.class);

        String  str = (String) declaredConstructor.newInstance("你好");
        System.out.println(str);

        Field value = clazz.getDeclaredField("value");
        value.setAccessible(true);

        value.set(str,new char[]{'1','2','3'});
        System.out.println(str);

        return  str ;
    }

    public  static void main(String[] args) throws Throwable {
        Car car = initObject();
        car.introduce();
        String s = stringS();
        System.out.println(s);
    }


    /**
     *  
     * */


}
