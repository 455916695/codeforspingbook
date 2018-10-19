package com.ax.thread;


import org.junit.Test;

public class MyThreadTest {

    @Test
    public void myThreadtest() {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        MyThread myThread4 = new MyThread();

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

    }


}
