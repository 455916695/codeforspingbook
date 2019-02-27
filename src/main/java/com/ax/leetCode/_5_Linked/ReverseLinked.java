package com.ax.leetCode._5_Linked;

import com.ax.leetCode.publicResource.ListNode;

public class ReverseLinked {

    public ListNode reverseList(ListNode head) {
        //遍历链表，并将链表存入栈中，遍历出栈
        if(head.next == null) {
            return head;
        }

        ListNode[]  reverseNode = reverse(head);

        return reverseNode[0];
    }

    private ListNode[] reverse(ListNode head) {
        if(head.next == null) {
            ListNode[] listNodes = new ListNode[2];
            listNodes[0] = head;
            listNodes[1] = head;
            return listNodes;
        }
        ListNode[]  reverseNode = reverse(head.next);
        reverseNode[1].next = head;
        reverseNode[1] = head;
        head.next = null;
        return reverseNode;
    }

}
