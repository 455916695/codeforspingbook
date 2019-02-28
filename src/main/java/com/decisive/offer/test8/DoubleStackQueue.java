package com.decisive.offer.test8;

import java.util.Stack;

/**
 *  问题：使用双栈实现队列
 *          用两个栈来实现一个队列，完成队列的 Push 和 Pop 操作。
 *
 *      审题要细致
 * */
public class DoubleStackQueue {

    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    /**
     *  队列中添加数据
     * */
    public  void  push(int data) {
        in.push(data);
    }

    /**
     *  队列中弹出数据
     * */
    public int pop() {
        //判断 out 中是否为null
        if(out.empty()) {
            while (!in.empty()){
                out.push(in.pop());
            }
        }
        if(out.empty()) {
            throw  new RuntimeException("队列中没有数据");
        }
        return out.pop();
    }


}
