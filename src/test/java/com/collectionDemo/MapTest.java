package com.collectionDemo;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class MapTest {

    @Test
    public void hashTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, ClassNotFoundException {

        HashMap hashMap = new HashMap();

        Class<? extends HashMap> aClass = hashMap.getClass();

        Method hash = aClass.getMethod("hash", Object.class);

        hash.setAccessible(true);

        Object invoke = hash.invoke(hashMap, null);

        System.out.println(invoke);
    }

}
