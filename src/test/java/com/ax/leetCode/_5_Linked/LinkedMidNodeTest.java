package com.ax.leetCode._5_Linked;


import com.ax.leetCode.publicResource.ListNode;
import org.junit.Test;

public class LinkedMidNodeTest {

    @Test
    public void test() {
        LinkedMidNode lmn = new LinkedMidNode();

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        ListNode listNode1 = lmn.middleNode(listNode);

        System.out.println(listNode1.val);

    }


}
