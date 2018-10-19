package com.ax.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.locks.ReentrantLock;

/**
 *   继承 Thread类
 * */
public class MyThread extends Thread  {

    public void run() {

        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);

        SynchronousQueue synchronousQueue = new SynchronousQueue(); //同步队列
        synchronousQueue.add("ss");
        for (int i = 0;i<1000;i++){

            System.out.println(MyThread.currentThread().getName()+":"+ i);
        }
    }


}
