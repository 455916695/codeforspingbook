package com.spring.threadLocaltest;

import org.junit.Test;

/**
 * 这是用来测试ThreadLocal的
 *
 * @author
 */
public class ThreadLocalTest {

    @Test
    public void test() {

        ThreadLocal threadLocal = new ThreadLocal();
        ThreadLocal threadLocal2 = new ThreadLocal();

        threadLocal.set(true);
        threadLocal2.set(false);

        Boolean o = (Boolean) threadLocal.get();
        Boolean b = (Boolean) threadLocal2.get();

        System.out.println(o);
        System.out.println(b);

    }

}
