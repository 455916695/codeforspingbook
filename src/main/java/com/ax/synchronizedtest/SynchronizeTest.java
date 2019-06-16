package com.ax.synchronizedtest;

import org.junit.Test;

public class SynchronizeTest {

    public synchronized static void staticFunction() {
        System.out.println("synchronized static function");
    }


    public synchronized void function() {
        System.out.println("synchronized function");
    }

    @Test
    public void test() {

        SynchronizeTest synchronizeTest = new SynchronizeTest();

        synchronized (synchronizeTest) {

            try {
                synchronizeTest.function();

                SynchronizeTest.staticFunction();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        synchronized (SynchronizeTest.class) {

            try {
                SynchronizeTest.staticFunction();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
