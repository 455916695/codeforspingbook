package com.spring.proxy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 实现前置增强类
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {

    /**
     * @param method  为目标类的方法
     * @param objects 为目标类方法的入参
     * @param o       为目标类实例
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {

        System.out.println("前置增强类执行了");
    }
}
