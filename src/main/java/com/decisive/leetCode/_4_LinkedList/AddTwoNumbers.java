package com.decisive.leetCode._4_LinkedList;


import com.decisive.common.ListNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 判断参数是否合法
        if (l1 == null || l2 == null) return l1 == null ? l2 : l1;
        //两个链表相加，得到相加后的结果
        ListNode result = addTwoListNode(l1, l2); //返回的是相加的最后节点
        //进位处理
        addOne(result);
        //返回结果
        return result;
    }

    private void addOne(ListNode result) {
        int temp = 0;
        while (result != null) {
            if (temp > 0)
                result.val += temp--;
            if (result.val >= 10) {
                temp = 1;
                result.val -= 10;
                if (result.next == null) {
                    result.next = new ListNode(1);
                    break;
                }
            }
            result = result.next;
        }
    }

    private ListNode addTwoListNode(ListNode l1, ListNode l2) {
        ListNode tempList1 = l1;
        ListNode tempList2 = l2;
        ListNode result = null;
        while (l1 != null && l2 != null) {
            l1.val += l2.val;
            l2.val += (l1.val - l2.val);
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            result = tempList1;
        } else {
            result = tempList2;
        }
        return result;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l1_1 = new ListNode(4);
        ListNode l1_2 = new ListNode(3);
        ListNode l2 = new ListNode(5);
        ListNode l2_1 = new ListNode(6);
        ListNode l2_2 = new ListNode(4);

        l1.next = l1_1;
        l1_1.next = l1_2;

        l2.next = l2_1;
        l2_1.next = l2_2;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode listNode = addTwoNumbers.addTwoNumbers(l1, l2);

        print(listNode);
    }

    public static void print(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val);
            System.out.print(" , ");
            listNode = listNode.next;
        }
    }
}
