package com.ax.offer2._7_twoStackQueue;


import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TwoStackQueueTest {

    @Test
    public void twoStackQueueTest() {

        TwoStackQueue  twoStackQueue = new TwoStackQueue();
        twoStackQueue.appendTail(1);
        twoStackQueue.appendTail(2);
        twoStackQueue.appendTail(3);
        twoStackQueue.appendTail(4);

        System.out.println(twoStackQueue.deleteHead());
        System.out.println(twoStackQueue.deleteHead());
        System.out.println(twoStackQueue.deleteHead());
        System.out.println(twoStackQueue.deleteHead());
        try {
            System.out.println(twoStackQueue.deleteHead());
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }

}
