package com.ax.offer.printlinked;

import java.util.ArrayList;
import java.util.Stack;

/**
 *  从尾到头打印链表
 *           题目描述
 * 输入链表的第一个节点，从尾到头反过来打印出每个结点的值。
 * */
public class PrintLinked {

    /**
     *  方案一：
     *      使用stack
     * */
    public  ArrayList<Integer> printLink(ListNode listNode){

        Stack<Integer> stack = new Stack<>();

        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        while ( !stack.isEmpty()){
            arrayList.add(stack.pop());
        }

        return  arrayList;
    }


    /**
     * 方案二：
     *      递归
     *
     * */
    public ArrayList<Integer> printLink2(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(listNode != null ) {
            arrayList.addAll( printLink2(listNode.next));
            arrayList.add(listNode.val);
        }
        return  arrayList;
    }


    /**
     *  方案三：
     *      使用头插法
     * */
    public ArrayList<Integer> printLink3(ListNode listNode) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        //TODO  未完待续

        return  arrayList;
    }


}
