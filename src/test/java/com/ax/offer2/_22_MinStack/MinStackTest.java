package com.ax.offer2._22_MinStack;

import org.junit.Assert;
import org.junit.Test;

public class MinStackTest {

    @Test
    public void test() {

        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
        minStack.push(5);
        minStack.push(1);
        minStack.push(1);

        int min = minStack.min();
        Assert.assertEquals(1,min);
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.pop();

        min = minStack.min();
        Assert.assertEquals(2,min);

        minStack.pop();
        try {
            minStack.pop();
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        try {
            minStack.min();
        }catch (RuntimeException e){
            e.printStackTrace();
        }


    }


}
