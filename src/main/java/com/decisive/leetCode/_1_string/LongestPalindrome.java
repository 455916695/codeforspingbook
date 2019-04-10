package com.decisive.leetCode._1_string;

/**
 * 寻找字符串中最长回文字符串
 */
public class LongestPalindrome {

    int[] result = new int[]{0, 0, 1}; //  0 保存 起始  1 保存  终点  2 保存长度
    int[] tempLeft = new int[]{0, -1, 0};
    int[] tempCentre = new int[]{0, -1, 0};

    public String longestPalindrome(String s) {
        //判断字符串是否合法
        if (s == null || s.length() < 2) return s;
        // 循环遍历字符串
        int length = s.length();
        for (int i = 0; i < s.length(); i++) {
            //从遍历的字符为边、为中心、 寻找最长回文字符串
            int[] temp = findStr(s, i, length);
            //判断出长度最大的结果
            if (temp[2] > result[2]) {
                result[0] = temp[0];
                result[1] = temp[1];
                result[2] = temp[2];
            }
        }
        //返回结果
        String substring = s.substring(result[0], result[1] + 1);
        return substring;
    }

    private int[] findStr(String s, int index, int length) {
        //判断index 是否合法 此处省略
        //做为左边边界
//        int[] tempLeft = finStrFromLeft(s, index);
        int[] tempLeft = finStrFromIndex(s, index, index, index + 1, length, this.tempLeft);
        //做为中心
//        int[] tempCentre = findStrFromCentre(s, index);
        int[] tempCentre = finStrFromIndex(s, index, index - 1, index + 1, length, this.tempCentre);
        //计算出最大值
        return (tempLeft[2] = tempLeft[1] - tempLeft[0] + 1) > (tempCentre[2] = tempCentre[1] - tempCentre[0] + 1) ? tempLeft : tempCentre;
    }

    private int[] finStrFromIndex(String s, int index, int left, int high, int length, int[] temp) {
        while (left >= 0 && high < length && s.charAt(left) == s.charAt(high)) {
            temp[0] = left;
            temp[1] = high;
            left--;
            high++;
        }
        return temp;
    }

    //==============================================================
    private static int[] findStrFromCentre(String s, int index) {
        int length = s.length();
        int left = index - 1;
        int high = index + 1;
        int[] temp = new int[]{index, index - 1, 0};
        while (left >= 0 && high < length && s.charAt(left) == s.charAt(high)) {
            temp[0] = left;
            temp[1] = high;
            left--;
            high++;
        }
        return temp;
    }

    private static int[] finStrFromLeft(String s, int index) {
        int length = s.length();
        int left = index;
        int high = index + 1;
        int[] temp = new int[]{index, index - 1, 0};
        while (left >= 0 && high < length && s.charAt(left) == s.charAt(high)) {
            temp[0] = left;
            temp[1] = high;
            left--;
            high++;
        }
        return temp;
    }

    public static void main(String[] args) {
//        String s = longestPalindrome("12");
//        System.out.println(s);

//        int[] strFromCentre = findStrFromCentre("11211", 2);
//        int[] ints = finStrFromIndex("11211", 2, 2 - 1, 2 + 1, "11211".length());
//        System.out.println(strFromCentre[0] + " " + ints[0]);
//        System.out.println(strFromCentre[1] + " " + ints[1]);
//        System.out.println(strFromCentre[2] + " " + ints[2]);
//
//        strFromCentre = finStrFromLeft("211112", 2);
//        ints = finStrFromIndex("211112", 2, 2, 2 + 1, "211112".length());
//        System.out.println(strFromCentre[0] + " " + ints[0]);
//        System.out.println(strFromCentre[1] + " " + ints[1]);
//        System.out.println(strFromCentre[2] + " " + ints[2]);

        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String babad = longestPalindrome.longestPalindrome("cbbd");

        System.out.println(babad);
    }

}
