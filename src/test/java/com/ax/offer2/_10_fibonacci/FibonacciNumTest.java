package com.ax.offer2._10_fibonacci;


import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumTest {

    @Test
    public void testXH() {
        int fibonacciNum = FibonacciNum.getFibonacciNum(0);
        Assert.assertEquals(0,fibonacciNum);
        fibonacciNum = FibonacciNum.getFibonacciNum(1);
        Assert.assertEquals(1,fibonacciNum);
        fibonacciNum = FibonacciNum.getFibonacciNum(2);
        Assert.assertEquals(1,fibonacciNum);
        fibonacciNum = FibonacciNum.getFibonacciNum(3);
        Assert.assertEquals(2,fibonacciNum);
        fibonacciNum = FibonacciNum.getFibonacciNum(4);
        Assert.assertEquals(3,fibonacciNum);

    }

    @Test
    public void testDG() {
        int fibonacciNum = FibonacciNum.getFibonacciNumForDG(0);
        Assert.assertEquals(0,fibonacciNum);
        fibonacciNum = FibonacciNum.getFibonacciNumForDG(1);
        Assert.assertEquals(1,fibonacciNum);
        fibonacciNum = FibonacciNum.getFibonacciNumForDG(2);
        Assert.assertEquals(1,fibonacciNum);
        fibonacciNum = FibonacciNum.getFibonacciNumForDG(3);
        Assert.assertEquals(2,fibonacciNum);
        fibonacciNum = FibonacciNum.getFibonacciNumForDG(4);
        Assert.assertEquals(3,fibonacciNum);

    }

}
