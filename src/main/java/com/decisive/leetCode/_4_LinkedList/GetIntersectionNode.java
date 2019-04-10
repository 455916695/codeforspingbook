package com.decisive.leetCode._4_LinkedList;

import com.decisive.common.ListNode;
import org.junit.Assert;

import java.util.List;

/**
 * 相交链表
 * <p>
 * 编写一个程序，找到两个单链表相交的起始节点。
 */
public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //判断参数合法性
        if (headA == null || headB == null)
            return null;

        //遍历两次链表 分别获取他们的长度，计算出差值，让长的个先跑，  然后一起跑，再找到相同的节点
        int lengthA = length(headA);
        int lengthB = length(headB);

        //除去差值
        headA = listToGo(headA, lengthA - lengthB);
        headB = listToGo(headB, lengthB - lengthA);

        //寻找相同的起始节点
        ListNode result = findSameNode(headA, headB);

        return result;
    }

    private ListNode findSameNode(ListNode headA, ListNode headB) {

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    private ListNode listToGo(ListNode headA, int i) {
        while (i-- > 0 && headA != null) {
            headA = headA.next;
        }
        return headA;
    }

    private int length(ListNode headA) {
        int result = 0;

        while (headA != null) {
            result++;
            headA = headA.next;
        }

        return result;
    }


    public static void main(String[] args) {
        GetIntersectionNode gin = new GetIntersectionNode();

        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);

        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        int length = gin.length(listNode);

        Assert.assertEquals(4, length);

        ListNode temp = gin.listToGo(listNode, -1);
        print(temp);



    }

    public static void print(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val);
            listNode = listNode.next;
            if (listNode != null)
                System.out.print(" , ");
        }
    }
}
