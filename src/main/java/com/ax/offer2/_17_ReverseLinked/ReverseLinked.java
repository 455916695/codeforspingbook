package com.ax.offer2._17_ReverseLinked;

/**
 *   反转链表；
 *      定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头结点
 * */
public class ReverseLinked {

    /**
     *  情况一：参数root为null
     *  情况二：参数root即是头结点，也是尾节点
     *  情况三：参数正常
     * */

    public LinkedNode reverseLinked(LinkedNode root) {

        if(root == null) {
            return null;
        }
        if(root.getNext() == null) {
            return  root;
        }

        LinkedNode beforeNode = root;
        LinkedNode afterNode = null;
        LinkedNode reverseRoot = null;

        while (beforeNode != null){
             afterNode = beforeNode.getNext();
             beforeNode.setNext(reverseRoot);
             reverseRoot = beforeNode;
             beforeNode = afterNode;
        }
        return  reverseRoot;
    }

}
