package com.decisive.offer.test5;

import com.decisive.common.LinkedNode;

import java.util.ArrayList;
import java.util.Stack;


/**
 * 输入链表的第一个节点，从尾到头反过来打印出每个结点的值。
 * */
public class ReversalLinkedList {

    /**
     *  方法一：使用栈存储
     * */
    public ArrayList<Integer> reversalPrint(LinkedNode node) {
        Stack<Integer> stack = new Stack();

        while (node != null) {
            stack.push(node.getData());
            node = node.getNext();
        }
        ArrayList<Integer> arrayList = new ArrayList();
        while (!stack.isEmpty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    /**
     *  方式二：递归
     * */
    public ArrayList<Integer> reversalPrint(LinkedNode node,ArrayList<Integer> arrayList) {
        if(node != null) {
            reversalPrint(node.getNext(),arrayList);
            arrayList.add(node.getData());
        }
        return arrayList;
    }


}
