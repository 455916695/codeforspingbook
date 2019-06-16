package com.ax.thread.deadlock;

import org.junit.Test;

/**
 * 实现死锁
 */
public class DeadLock {

    private Object object1 = new Object();
    private Object object2 = new Object();

    @Test
    public void test() throws InterruptedException {

        Thread thread = new Thread() {
            @Override
            public void run() {
                synchronized (object2){

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("获得了objec2");

                    synchronized (object1){

                        System.out.println("获得了objec1");
                    }

                }
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                synchronized (object1){

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("获得了object1");

                    synchronized (object2){

                        System.out.println("获得了object2");
                    }

                }
            }
        };


        thread.start();
        thread2.start();


        Thread.sleep(60*1000);
    }

}

