package com.ax.leetCode._5_Linked;

import com.ax.leetCode.publicResource.ListNode;

public class MeagerLinked {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //判断是否存在null
        // 循环比较，交叉赋值
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        ListNode  result = null;
        if(l1.val <= l2.val) {
            result = l1;
            l1 =  l1.next;
        }else{
            result = l2;
            l2 =  l2.next;
        }

        //循环赋值
        ListNode temp = result;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        return result;
    }
}
