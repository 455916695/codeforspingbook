package com.ax.leetCode._7_Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MinStack {


    //基本思路 双栈
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if(minStack.isEmpty()) {
            dataStack.push(x);
            minStack.push(x);
        }else{
            dataStack.push(x);
            if(getMin() >= x){
                minStack.push(x);
            }else {
                minStack.push(getMin());
            }
        }

    }

    public void pop() {
        if(!dataStack.isEmpty()) {
            dataStack.pop();
            minStack.pop();
        }
    }

    public int top() {
        return dataStack.peek();
        //是否需要抛出异常
    }

    public int getMin() {
        return minStack.peek();
        //是否需要抛出异常
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */