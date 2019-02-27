package com.ax.leetCode._5_Linked;

import com.ax.leetCode.publicResource.ListNode;

public class LinkedMidNode {
    public ListNode middleNode(ListNode head) {
        //首先思考一下，想要找到中间节点
        // 第一： 链表是否有序
        // 第二： 链表的长度，将
        int length = 0;
        ListNode temp = head;

        while(temp != null){
            length ++;
            temp = temp.next;
        }

        int mid = length>>1;
        if((length & 1) != 1) {
            mid ++;
        }

        temp = head;
        while(mid-- > 1) {
            temp = temp.next;
        }

        return temp;
    }



}
