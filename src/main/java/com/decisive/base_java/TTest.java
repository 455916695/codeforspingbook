package com.decisive.base_java;

import java.util.ArrayList;
import java.util.List;

/**
 * 这是泛型测试类
 */
public interface TTest<T> {
//    private T T;
    <T> void test(T t);


    class Test implements TTest<Child> {


        @Override    //报错的原因
        public <T> void test(T t) {
//            t.eat();  //这里不能调用：因为有泛型擦除的存在
            List<T> ls = new ArrayList();
            T t1 = ls.get(0);
        }

        public <T extends Person> void test2(T t) {
            t.eat();
            List<T> ls = new ArrayList();
            T t1 = ls.get(0);
            t1.eat();
        }
    }
}
