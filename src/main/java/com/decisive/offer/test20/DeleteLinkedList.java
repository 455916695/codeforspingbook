package com.decisive.offer.test20;

import com.decisive.offer.common.LinkedNode;

import java.util.LinkedList;

/**
 * 在O(1)时间内删除链表节点
 */
public class DeleteLinkedList {

    /**
     * 思路：将目标节点的下一个节点的值，赋值给目标节点，然后删除下一个节点
     */
    public LinkedNode delete(LinkedNode root, LinkedNode target) {
        /**
         *  参数判断，目标节点是否是指定节点
         * */
        /**
         *  参数情况： 目标节点 在头   中   末尾
         * */
//        判断参数合法性：  此处省略判断
        if (target == null) return root;
        if (target == root) { //如果是头节点  //此处代码好像可以合并
            root = target.getNext();
            return root;
        }
        if (target.getNext() == null) { // 如果是尾节点
            LinkedNode temp = root;
            while (temp != null && temp.getNext() != target) {
                temp = temp.getNext();
            }
            temp.setNext(target.getNext()); //此处曾出现错误
            return root;
        }
        //中间节点
        LinkedNode temp = target.getNext();   //此处缺少非null 判断
        target.setData(temp.getData());
        target.setNext(temp.getNext());
        return root;
    }


}
