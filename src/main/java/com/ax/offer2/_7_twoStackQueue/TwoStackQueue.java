package com.ax.offer2._7_twoStackQueue;

import java.util.Stack;

/**
 *  用两个栈实现 队列 的添加和删除
 * */
public class TwoStackQueue<T> {

    private  Stack<T> in ;
    private  Stack<T> out;

    public void appendTail(T t) {
        if(in == null) {
            in = new Stack<>();
        }
        in.push(t);
    }

    public T deleteHead() {
        if(out == null) {
            out = new Stack<>();
        }
        if(out.empty()) {
            while (!in.empty()){
                out.push(in.pop());
            }
        }
        if(!out.empty()) {
            return  out.pop();
        }

        throw  new RuntimeException("队列为空");
    }

}
