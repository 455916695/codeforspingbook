package com.ax.datastuck.hashSetEr;

import java.util.HashSet;

public class Test {

    @org.junit.Test
    public  void  addTest() {

        HashSet hashSet = new HashSet();
        Person person = new Person("李四", 18);
        hashSet.add(person);
        hashSet.add(person);
        hashSet.add(person);
        hashSet.add(person);

        System.out.println(hashSet);

        for (Object o : hashSet) {
            System.out.println(o);
        }

    }

}
