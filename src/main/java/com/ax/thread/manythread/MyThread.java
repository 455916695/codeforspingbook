package com.ax.thread.manythread;

public class MyThread  implements Runnable {

    public void run() {
        for (int i = 0;i<= 1000;i++)
            System.out.println(Thread.currentThread().getName()+":"+i);
    }
}
