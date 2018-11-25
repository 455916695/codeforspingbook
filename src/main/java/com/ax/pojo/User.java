package com.ax.pojo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class User implements Comparator{

    int age;

    public int compareTo(Object o) {
        User u = null;

        if(o instanceof User) {
            u = (User)o;
        }
        if(u.age == this.age) {
            return 0;    //返回 0 的时候说明, 比较的结果是相等的
        }
//        ....

        return 0;
    }


    public int compare(Object o1, Object o2) {
        return 0;
    }
}
