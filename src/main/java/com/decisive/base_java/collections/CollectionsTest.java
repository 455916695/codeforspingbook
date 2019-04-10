package com.decisive.base_java.collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 测试 Collections  的方法
 */
public class CollectionsTest {

    public static void main(String[] args) {

        List<Integer> strings = Collections.nCopies(4, 2);
        print(strings);

        ArrayList<CollectionsTest> objects = new ArrayList<>(20);
        Collections.fill(objects, new CollectionsChild());  //添加子类就不会报错 Collection.fill( List<? super T> list,new CollectionsChild())
    }

    public static void print(List<Integer> list) {
        for (Integer s : list) {
            System.out.print(s);
            System.out.print(",");
        }
        System.out.println("");
    }
}

class CollectionsChild extends CollectionsTest {
}