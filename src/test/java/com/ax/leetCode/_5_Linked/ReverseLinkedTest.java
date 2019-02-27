package com.ax.leetCode._5_Linked;


import com.ax.leetCode.publicResource.ListNode;
import org.junit.Test;

public class ReverseLinkedTest {

    @Test
    public void test() {

        ReverseLinked rl = new ReverseLinked();

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        ListNode listNode1 = rl.reverseList(listNode);

        System.out.println(listNode1.val);

    }

}
