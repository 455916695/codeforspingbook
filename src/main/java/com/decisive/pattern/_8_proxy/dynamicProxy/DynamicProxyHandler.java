package com.decisive.pattern._8_proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * 使用案例
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;   // 个人估计----这是被代理对象

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**************proxy:" + proxy.getClass() + ",method:" + method + ",args:" + args);

        if (args != null) {
            for (Object arg : args) {
                System.out.println("  " + arg);
            }
        }
        System.out.println("方法调用前");
        Object invoke = method.invoke(proxied, args);  //这就是在调用方法
        System.out.println("方法调用后");

        return invoke;  //返回方法调用结果
    }
}


class SimpleDynamicProxy {
    public static void consumer(TestInterface testInterface) {
        testInterface.print();
        testInterface.print(1);
        testInterface.print("z");
        testInterface.print("z", 1);
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        consumer(testClass); //个人感觉这更像是一种装饰者模式

        // Insert a proxy and call again
        ClassLoader classLoader = TestInterface.class.getClassLoader();
        Class[] classes = new Class[]{TestInterface.class};  // 这里存在一个疑惑？？？？？
        InvocationHandler invocationHandler = new DynamicProxyHandler(testClass); // 这里传参的作用？？？

        TestInterface proxy = (TestInterface) Proxy.newProxyInstance(classLoader, classes, invocationHandler);  // 代理对象进行动态初始化
        consumer(proxy);
    }
}
