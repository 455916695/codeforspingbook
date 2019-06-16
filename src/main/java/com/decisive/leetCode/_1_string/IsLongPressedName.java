package com.decisive.leetCode._1_string;

import org.junit.Test;

public class IsLongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        //思路：
        //以name字符串为主，进行遍历，并同时使用临时变量保存name当前遍历的结果，

        if (name == null || name.length() < 1) {
            if (typed == null || typed.length() < 1) {
                return true;
            } else {
                return false;
            }
        }

        int temp = -1;

        int tIndex = 0;
        for (int i = 0; i < name.length(); i++) {
            char nameChar = name.charAt(i);
            if ( tIndex < typed.length() &&typed.charAt(tIndex) == nameChar) {
                tIndex++;
            } else {
                while (tIndex < typed.length() && typed.charAt(tIndex) != nameChar) {
                    if (temp >= 0) {
                        if (name.charAt(temp) != typed.charAt(tIndex)) {
                            return false;
                        } else {
                            tIndex++;
                        }
                    } else {
                        return false;
                    }
                }
                if (tIndex >= typed.length()) {
                    return false;
                } else {
                    tIndex++;
                }
            }
            temp = i;
        }
        if (tIndex < typed.length() - 1) {
            return false;
        }
        return true;
    }


    @Test
    public void test_isLongPressedName() {
        boolean longPressedName = isLongPressedName("pyplrz", "ppyypllr");
        System.out.println(longPressedName);
    }

}
