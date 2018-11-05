package com.ax.thread.manythread;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;

import static org.springframework.test.context.transaction.TestTransaction.start;

public class Test {

    @org.junit.Test
    public  void thredTest() throws InterruptedException {
        Vector<Thread> arrayList = new Vector<Thread>(3);
        Thread thread1 = new Thread(new MyThread());
        thread1.setName("线1");
        Thread thread2 = new Thread(new MyThread());
        thread2.setName("线2");
        Thread thread3 = new Thread(new MyThread());
        thread3.setName("线3");
        arrayList.add(thread1);
        arrayList.add(thread2);
        arrayList.add(thread3);

        System.out.println(arrayList);
        for (int i = 0;i<arrayList.size();i++) {
            Thread thread = arrayList.get(i);
            thread.start();

        }

        Thread.currentThread().sleep(1000);
    }

}
