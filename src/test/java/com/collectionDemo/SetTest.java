package com.collectionDemo;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public void addTest() {


        HashSet set = new HashSet();

        //HashSet 内部使用 HashMap  但在存值的时候  把要添加的数据保存到 key 中，value只是保存一个Object 对象
        set.add("");

    }

}
