package com.ax.test.interfaceTest;

public interface TestInterface<Test> {

    void  test();
    public  abstract void  test2() throws  Exception;

    abstract void a();
    static void s() {
    }
    default void d(){

    }
    void b();//默认用abstract修饰
    int a = 0;//默认用static final 修饰

}
