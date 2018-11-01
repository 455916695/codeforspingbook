package com.ax.test;

public class StringRe {

        public String rotateString(String A, int n, int p) {
            // write code here
            //将指定长度的数组，旋转指定位置
            A =  reverse(A,0,n-1);
            A =  reverse(A,0,p-1);
            A = reverse(A,p,n-1);
            return A;
        }

        // 思路是旋转，，
        public String reverse(String A,int left ,int right) {
            char[] chars = A.toCharArray();
            while(left < right) {
                char  t = chars[left];
                chars[left] = chars[right];
                chars[right] = t;
                left ++;
                right --;
            }
            return new  String(chars);
        }

}
