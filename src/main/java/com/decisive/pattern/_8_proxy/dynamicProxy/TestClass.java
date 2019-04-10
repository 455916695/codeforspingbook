package com.decisive.pattern._8_proxy.dynamicProxy;

public class TestClass implements TestInterface {
    @Override
    public void print() {
        System.out.println("我实现了 TestInterface 接口" + "无参方法");
    }

    @Override
    public void print(int num) {
        System.out.println("我实现了 TestInterface 接口" + "带参方法 int" + num);
    }

    @Override
    public void print(String str) {
        System.out.println("我实现了 TestInterface 接口" + "带参方法 String" + str);
    }

    @Override
    public void print(String str, int num) {
        System.out.println("我实现了 TestInterface 接口" + "带参方法 String int" + str + "==" + num);
    }
}
