package com.ax.thread;


import org.junit.Test;

public class MyThreadToRunnableTest {

    @Test
    public void myThreadToRunnableTest() throws InterruptedException {

        Thread myThread1 = new Thread(new MyThreadToRunnable());
        Thread myThread2 = new Thread(new MyThreadToRunnable());
        Thread myThread3 = new Thread(new MyThreadToRunnable());

        myThread1.start();
        myThread2.start();
        myThread3.start();

        Thread.sleep(10000);
    }

}
