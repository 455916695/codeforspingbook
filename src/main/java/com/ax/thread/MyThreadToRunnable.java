package com.ax.thread;

public class MyThreadToRunnable implements Runnable  {

    public    void run() {

        for (int i =0;i<1000;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.currentThread().sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }

}
