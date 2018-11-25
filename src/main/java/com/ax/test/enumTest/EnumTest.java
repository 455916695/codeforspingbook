package com.ax.test.enumTest;

import org.junit.Test;

public class EnumTest {

    @Test
    public  void  test() {

        MyEnum onlyone = null;

        if (onlyone == null){
            System.out.println("onlyone  为 null");
            onlyone  = MyEnum.ONLYONE;  //自有在被调用时，才会创建对象
        }

    }

}
