package com.decisive.leetCode._1_string;


import org.junit.Assert;
import org.junit.Test;

public class PlainStrTest {

    @Test
    public void test() {

        PlainStr ps = new PlainStr();

        boolean palindrome = ps.isPalindrome("A   ArraySet a");
        palindrome = ps.isPalindrome("A man, a plan, a canal: Panama");

        Assert.assertTrue(palindrome);
    }


}
