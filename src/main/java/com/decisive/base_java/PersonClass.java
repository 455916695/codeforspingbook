package com.decisive.base_java;

import com.decisive.pattern._6_commandmode.Command;

import java.util.ArrayList;
import java.util.List;

public class PersonClass {

}

class Man extends PersonClass {

}

class ChildMan extends Man {

}

class Test<T> {
    public static void main(String[] args) {
        List<? super Man> list = new ArrayList();  // 这个要读作 以 Man 为父类的类型 ???
//        list.add(new PersonClass());
        list.add(new Man());
        list.add(new ChildMan());

        ArrayList add = new ArrayList();
        add.add(new Man());
        List<? extends Man> exList = new ArrayList(add);  //具有任何从Man继承的类型的列表
        main(exList);
        Man man = exList.get(0);
        man = exList.get(1);
        man.equals("");
//        exList.add(new Object());   //拒绝任何类型的添加
//        exList.add(new PersonClass());
//        exList.add(new Man());
//        exList.add(new ChildMan());

    }

    public static <T extends Comparable < ? super  T> > List<T>  main(List  list) {
        list.add(new Man());
        return list;
    }

}

