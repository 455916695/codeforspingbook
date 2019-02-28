package com.decisive.offer.test8;


import org.junit.Test;

public class DoubleStackQueueTest {

    @Test
    public void test() {
        DoubleStackQueue dsq = new DoubleStackQueue();

        dsq.push(5);
        dsq.push(4);
        dsq.push(3);
        dsq.push(2);
        dsq.push(1);

        int i = 1;
        while (i++ <= 5) {
            System.out.println(dsq.pop());
        }
    }

}
