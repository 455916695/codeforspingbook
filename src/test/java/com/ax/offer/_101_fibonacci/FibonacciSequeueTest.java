package com.ax.offer._101_fibonacci;


import org.junit.Assert;
import org.junit.Test;

public class FibonacciSequeueTest {


    @Test
    public void fibonacciTest() {

        FibonacciSequeue fibonacciSequeue = new FibonacciSequeue();

        int fibonacci = fibonacciSequeue.fibonacci(0);

        Assert.assertEquals(0,fibonacci);

        fibonacci = fibonacciSequeue.fibonacci(1);

        Assert.assertEquals(1,fibonacci);

        fibonacci = fibonacciSequeue.fibonacci(3);

        Assert.assertEquals(2,fibonacci);

        fibonacci = fibonacciSequeue.fibonacci(4);

        Assert.assertEquals(3,fibonacci);

    }


    @Test
    public void fibonacciTest2() {

        FibonacciSequeue fibonacciSequeue = new FibonacciSequeue();

        int fibonacci = fibonacciSequeue.fibonacciDT(0);

        Assert.assertEquals(0,fibonacci);

        fibonacci = fibonacciSequeue.fibonacciDT(1);

        Assert.assertEquals(1,fibonacci);

        fibonacci = fibonacciSequeue.fibonacciDT(3);

        Assert.assertEquals(2,fibonacci);

        fibonacci = fibonacciSequeue.fibonacciDT(4);

        Assert.assertEquals(3,fibonacci);

        fibonacci = fibonacciSequeue.fibonacciDT(5);

        Assert.assertEquals(5,fibonacci);

    }

}
