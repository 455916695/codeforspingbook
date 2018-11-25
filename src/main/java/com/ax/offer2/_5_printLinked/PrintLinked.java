package com.ax.offer2._5_printLinked;

import java.util.Stack;

/**
 *  倒序打印链表
 * */
public class PrintLinked {

    /**
     *   倒序打印链表
     * */
    public void printLinked(LinkedNode linkedNode) {

        if( linkedNode == null ) {
            return;
        }

        Stack<Integer> stack = new Stack();
        while (linkedNode != null) {
            stack.push(linkedNode.getValue());
            linkedNode = linkedNode.getNext();
        }

        while ( !stack.empty()) {
            System.out.println(stack.pop());
        }
    }

}
