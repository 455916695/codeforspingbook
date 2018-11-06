package com.ax.test;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaSort {

    @Test
    public void  sortTest( ){
        List<Integer> ints = Arrays.asList(1,2,3,4,5);

        Collections.sort(ints);

        for (Integer anInt : ints) {
            System.out.println(anInt);
        }


    }


}
