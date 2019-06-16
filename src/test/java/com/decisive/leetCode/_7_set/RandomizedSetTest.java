package com.decisive.leetCode._7_set;


import org.junit.Test;

public class RandomizedSetTest {

    @Test
    public void test() {

        long l = System.currentTimeMillis();

        RandomizedSet rs = new RandomizedSet();

        for (int i = 0; i < 1000; i++) {
            rs.insert(i);
        }

        for (int i = 0; i < 1000; i++) {
            rs.remove(i);
        }

        long l1 = System.currentTimeMillis();

        System.out.println(l1 - l);
    }


}
