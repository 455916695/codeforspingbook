package com.ax.leetCode._5_Linked;

import com.ax.leetCode.publicResource.ListNode;

public class IsPalind {
    public boolean isPalindrome(ListNode head) {
        //1.遍历链表，得到链表长度
        int length = length(head);

        //2.计算出中间节点
        int mid = length >>1;
        if((length & 1) == 1) {
            mid ++;
        }
        ListNode midNode = foundMidNode(head,mid);  //如果节点是奇数个，中间那个不算
        //3.反转中间节点后的其他节点
        midNode = resversNode(midNode);
        //4.重新比较两边的是否相同
        return isEquals(head,midNode);
    }

    public boolean isEquals(ListNode head,ListNode midNode) {

        while(midNode != null) {
            if(head.val != midNode.val) {
                return false;
            }
            head = head.next;
            midNode = midNode.next;
        }
        return true;
    }

    /**
     *  反转节点
     */
    public ListNode resversNode(ListNode midNode){
        ListNode tempNode  = null;
        ListNode nextNode = null;
        while(midNode != null) {
            nextNode = midNode.next;
            midNode.next = tempNode;
            tempNode = midNode;
            midNode = nextNode;
        }
        return tempNode;
    }


    /**
     * 获取中间节点，中间节点右边的第一个节点
     */
    public ListNode foundMidNode(ListNode head,int mid){
        int count = 1;
        while(mid >= count) {
            head = head.next;
            count++;
        }

        return head;
    }


    /**
     * 统计长度
     */
    public int length(ListNode head) {
        int length = 0;

        while(head != null) {
            length ++;
            head = head.next;
        }

        return length;
    }

}
