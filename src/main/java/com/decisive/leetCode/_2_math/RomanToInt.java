package com.decisive.leetCode._2_math;

/**
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class RomanToInt {
    private int result = 0;
    private int temp;

    public int romanToInt(String s) {
        if (s == null || s.length() < 1)
            return 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int num = romanCharToInt(s.charAt(i));
            add(num);
        }
        return result;
    }

    private int add(int num) {
        if (num > temp) {
            result = result + num - temp - temp;
        } else {
            result = result + num;
        }
        temp = num;
        return result;
    }

    private int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }


    public static void main(String[] args) {
        RomanToInt r = new RomanToInt();

        int result = r.romanToInt("MCMXCIV");

        System.out.println(result);
    }
}
