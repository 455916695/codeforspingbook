package com.decisive.pattern._8_proxy.dynamicProxy;

/**
 * 这是测试接口
 */
public interface TestInterface {

    public abstract void print();

    public abstract void print(int num);

    public abstract void print(String str);

    public abstract void print(String str, int num);

    class TestClass implements TestInterface {
        @Override
        public void print() {
            System.out.println("我是接口的内部类");
        }

        @Override
        public void print(int num) {
            System.out.println("我是接口的内部类" + num);
        }

        @Override
        public void print(String str) {
            System.out.println("我是接口的内部类" + str);
        }

        @Override
        public void print(String str, int num) {
            System.out.println("我是接口的内部类" + str + " ==" + num);
        }
    }
}
