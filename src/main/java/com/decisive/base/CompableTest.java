package com.decisive.base;

import org.junit.Test;

import java.util.*;

// Comparable  让元素类实现，让其具有比较功能
// Comparator  让一个单独的类实现，将其做为参数，传入对应的集合中
public class CompableTest implements Comparable, Comparator<String> {
    public int compareTo(Object o) {    //来自 Comparable   接口
        //
        return 0;
    }

    public int compare(String o1, String o2) {  //来自 Comparator  接口
        //
        return 0;
    }

}
