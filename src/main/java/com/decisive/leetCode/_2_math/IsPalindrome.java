package com.decisive.leetCode._2_math;

import java.util.BitSet;

/**
 * 回文数字
 */
public class IsPalindrome {

    //不转化成为字符串， 就反向转化为数字进行判断
    public boolean isPalindromeNum(int x) {
        //计算出
        if (x < 0) return false;
        if (x >= 0 && x < 10) return true;

        int temp = x;
        int tempRes = 0;
        while (  temp != 0) {
            tempRes = tempRes * 10 + temp % 10;
            temp /= 10;
        }

        if (  tempRes == x)
            return true;
        return false;

    }


    public boolean isPalindrome(int x) {
        if (x >= 0 && x < 10) return true;

        boolean result = isPalindrome(x + "");

        return result;
    }

    private boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            if (s.charAt(low) != s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }


    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();

        boolean palindrome = isPalindrome.isPalindrome(-1);
        System.out.println(palindrome);
        palindrome = isPalindrome.isPalindrome(1);
        System.out.println(palindrome);
        palindrome = isPalindrome.isPalindrome(10);
        System.out.println(palindrome);
        palindrome = isPalindrome.isPalindrome(111191111);
        System.out.println(palindrome);
        System.out.println("=========================================================");
        palindrome = isPalindrome.isPalindromeNum(1);
        System.out.println(palindrome);
        palindrome = isPalindrome.isPalindromeNum(10);
        System.out.println(palindrome);
        palindrome = isPalindrome.isPalindromeNum(111191111);
        System.out.println(palindrome);
    }

}
