package com.ax.leetCode._5_Linked;

import com.ax.leetCode.publicResource.ListNode;
import org.junit.Test;

public class IsPalindTest {

    @Test
    public  void  test() {

        IsPalind  ip = new IsPalind();

        ListNode ln = new ListNode(0);
        ln.next = new ListNode(0);
        boolean palindrome = ip.isPalindrome(ln);

        System.out.println(palindrome);

    }

}
