package com.ax.offer2._22_MinStack;

import org.junit.Assert;
import org.junit.Test;

public class MinStack2Test {

    @Test
    public void test() {

        MinStack2 minStack2 = new MinStack2();
        minStack2.push(2);
        minStack2.push(3);
        minStack2.push(4);
        minStack2.push(5);
        minStack2.push(1);
        minStack2.push(1);

        int min = minStack2.min();
        Assert.assertEquals(1, min);


        minStack2.pop();
        minStack2.pop();
        minStack2.pop();
        minStack2.pop();
        minStack2.pop();

        min = minStack2.min();
        Assert.assertEquals(2, min);

        try {
            minStack2.pop();
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            minStack2.min();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
