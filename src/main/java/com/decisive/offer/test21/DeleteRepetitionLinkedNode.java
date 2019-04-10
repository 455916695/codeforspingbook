package com.decisive.offer.test21;

import com.decisive.common.LinkedNode;

/**
 * 删除重复数据
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * <p>
 * 1  1  2  3  3  4  5  5
 */
public class DeleteRepetitionLinkedNode {

    /**
     * 使用使用双指针  （前提：链表的是有序的）  考虑的情况不全，存在问题
     */
    public LinkedNode delete(LinkedNode root) {

        if (root == null || root.getNext() == null) {
            return root;
        }
        LinkedNode pre = root.getNext(); //前指针
        LinkedNode aft = root;            //后指针
        while (pre != null) {
            if (pre.getData() == aft.getData()) {  //此处的重复，应该是数据重复
                while (pre != null && pre.getData() == aft.getData()) {
                    pre = pre.getNext();
                }                              //此处删除有存在相同的问题，头部 中部  尾部 删除数据
                root = delete(root, aft, pre);
                if (pre == null) {
                    return root;
                }
                pre = pre.getNext();
            } else {
                pre = pre.getNext();
                aft = aft.getNext();
            }
        }
        return root;
    }

    private LinkedNode delete(LinkedNode root, LinkedNode aft, LinkedNode pre) {
        if (pre == null) {
            if (root == aft) {
                return null;
            } else {
                LinkedNode temp = root;
                while (temp != null && temp.getNext() != aft) {
                    temp = temp.getNext();
                }
                temp.setNext(null);
            }
        } else {
            aft.setData(pre.getData());
            aft.setNext(pre.getNext());
        }
        return root;
    }

}
