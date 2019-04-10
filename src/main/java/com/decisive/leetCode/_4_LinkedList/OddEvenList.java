package com.decisive.leetCode._4_LinkedList;

import com.decisive.common.ListNode;

/**
 * 奇偶链表
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。
 * 请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * 请尝试使用原地算法完成。
 * 你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 * 示例 1:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 1->3->5->2->4->NULL
 * 示例 2:
 * 输入: 2->1->3->5->6->4->7->NULL
 * 输出: 2->3->6->7->1->5->4->NULL
 * 说明:
 * 应当保持奇数节点和偶数节点的相对顺序。
 * 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
 */
public class OddEvenList {

    public ListNode oddEvenList(ListNode head) {
        //使用临时节点，存储所有的偶数节点，再原地删除所有偶数节点，最后拼接到尾部
        if (head == null || head.next == null || head.next.next == null) return head;

        //记录
        ListNode sing = head;  //奇数的头
        ListNode even = head.next;  //偶数的头

        ListNode singTemp = sing;  //奇数的尾
        ListNode evenTemp = even;  //偶数的尾

        head = even.next;
        for (int i = 3; head != null; i++) {
            //判断是奇数还是偶数
            if ((i & 1) == 0) {
                evenTemp.next = head;
                evenTemp = evenTemp.next;
            } else {
                singTemp.next = head;
                singTemp = singTemp.next;
            }
            head = head.next;
        }

        //偶数的头拼接到奇数的尾部
        singTemp.next = even;

        evenTemp.next = null;  //防止成环

        return sing;
    }


    public static void main(String[] args) {

        OddEvenList o = new OddEvenList();

        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
//        ListNode head3 = new ListNode(4);
//        ListNode head4 = new ListNode(5);
        head.next = head1;
        head1.next = head2;
//        head2.next = head3;
//        head3.next = head4;

        ListNode listNode = o.oddEvenList(head);

        print(listNode);
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
