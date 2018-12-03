package com.ax.offer2._22_MinStack;

import java.util.Stack;

/**
 * 具有min函数的栈
 * 即可以有提供获栈中最小值的栈
 * O（1）
 */
public class MinStack2 {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public MinStack2() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public MinStack2(Stack<Integer> dataStack, Stack<Integer> minStack) {
        this.dataStack = dataStack;
        this.minStack = minStack;
    }

    public void push(int value) {
        dataStack.push(value);
        if (minStack.empty() || minStack.peek() > value) {
            minStack.push(value);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public int pop() {
        minStack.pop();
        return  dataStack.pop();
    }

    public int min() {
        Integer peek = minStack.peek();
        return peek;
    }

}
