package com.ax.atomicClass;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 测试 原子类
 *
 * @author dell3020mt-50
 */
public class AtomicClassTest {

//    private volatile String name;

    public void atomicIntTest() {

        AtomicInteger atomicInteger = new AtomicInteger();

//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 1000 * 60 * 24, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();
        ExecutorService singleThreadPool = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
        singleThreadPool.execute(() -> System.out.println(Thread.currentThread().getName()));
        singleThreadPool.shutdown();


    }

    public class TimerTaskThread extends Thread {
        public TimerTaskThread() {
            super.setName("TimerTaskThread");
            // do something
        }
    }

}
