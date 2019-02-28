package com.decisive.offer.test9;


import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void test() {

        Fibonacci fibonacci = new Fibonacci();
        int i = fibonacci.fibonacciD(3);
        Assert.assertEquals(2,i);

        int i2 = fibonacci.fibonacciD(4);
        Assert.assertEquals(3,i2);

        int i3 = fibonacci.fibonacciD(5);
        Assert.assertEquals(5,i3);
    }

}
