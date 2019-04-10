package com.decisive.leetCode._1_string;


/**
 * 字符串回文
 */
public class PlainStr {
    public boolean isPalindrome(String s) {
        //记住只比较 字母和数字，忽略字母大小写
        if (s == null || s.equals("")) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            //寻找左边有效数据
            left = findChar(s, left, 1);
            //寻找右边有效数据
            right = findChar(s, right, -1);
            if (left == -1 || right == -1)
                return true;
            //进行比较忽略大小写
            boolean flag = compare(s.charAt(left), s.charAt(right));  // 相等返回true ,不等返回false
            if (!flag) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean compare(char c, char c1) {
        //如果之前没有进行
        if (isLetter(c)) {
            c = toLower(c);
        }
        if (isLetter(c1)) {
            c1 = toLower(c1);
        }
        //是数字还是字母
        if (c == c1) {
            return true;
        }
        return false;
    }

    private char toLower(char c) {
        if (c >= 'A' && c <= 'Z')
            c += 32;
        return c;
    }

    private int findChar(String s, int index, int add) {
        if (index < 0 || index > s.length())
            return -1;
        while (index >= 0 && index < s.length()) {
            if (isLetter(s.charAt(index)) || isNumber(s.charAt(index))) {
                return index;
            }
            index = index + add;
        }
        return -1;
    }

    private boolean isNumber(char ch) {
        if (ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }

    private boolean isLetter(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            return true;
        }
        return false;
    }


}
