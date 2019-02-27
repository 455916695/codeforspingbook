package com.ax.leetCode._4_String;

public class ZMString {

    public boolean isAnagram(String s, String t) {
        //字母异位词：
        //   1.判断两个字符串的长度是否相等，不相等不用判断
        //   2.判断两个字符串是否相同，相同，返回false
        //   3.如果只包含 小写字母，可以使用数组存储信息
        //   4.如果包含 unicode 字符，可以使用HashMap保存信息
        if(s==null || t== null || s.length() != t.length() || s.equals(t)) {
            return false;
        }

        int[] sArray = new int[26];
        int[] tArray = new int[26];

        for(int i = 0;i<s.length();i++){
            sArray[s.charAt(i)-'a'] ++;
            tArray[t.charAt(i)-'a'] ++;
        }

        for(int i = 0;i<sArray.length;i++) {
            if(sArray[i] != tArray[i])
                return false;
        }


        String str = new String();

        str.indexOf("");


        return true;



        //===========================================
        //他人的思路：
        //    1.使用两个数组记录  两个字符串，各个字符出现的次数
        //    2.比较两个数组记录，如果不同，就返回false
    }
}
