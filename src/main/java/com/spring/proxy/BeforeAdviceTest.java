package com.spring.proxy;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

/**
 * 实现前置增强类 测试
 */
public class BeforeAdviceTest {

    @Test
    public void beforeTest() {

        //1.目标对象
        Target target = new Target();

        //2.前置增强类对象
        MyBeforeAdvice myBeforeAdvice = new MyBeforeAdvice();

        //3.spring提供的代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();

        //4.设置代理目标
        proxyFactory.setTarget(target);

        //5.添加增强
        proxyFactory.addAdvice(myBeforeAdvice);

        //6.生成代理实例
        target = (Target) proxyFactory.getProxy();
        target.execute();

    }

}
