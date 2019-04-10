package com.decisive.leetCode._1_string;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * 示例:
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 说明:
 * 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
 */
public class LetterCombinations {  //没有写出来
    List<String> list = new ArrayList();
    char[][] chars = new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
    public List<String> letterCombinations(String digits) {
        //遍历字符；来寻找出对应的每个字节
        if (digits.isEmpty()) {
            return list;
        }
        //递归回溯，让其
        StringBuffer temp = new StringBuffer(); //用来记录每次的字符串结果
        int index = 0;  //用来记录遍历到字符串哪个字符
        int length = digits.length(); //用来记录字符串的长度
        strToStringList(digits, length, index, temp);
        return list;
    }

    private void strToStringList(String digits, int length, int index, StringBuffer temp) {
        if (index >= length) {
            list.add(temp.toString());
            return;
        }
        char[] aChar = chars[digits.charAt(index) - '2'];
        for (int i = 0; i < aChar.length; i++) {
            temp.append(aChar[i]);
            strToStringList(digits, length, index + 1, temp);
            temp.delete(temp.length() - 1, temp.length());
        }
    }


    @Test
    public void test_letterCombinations() {

        List<String> list = letterCombinations("23");

        print(list);
    }

    private void print(List<String> list) {

        if (list != null) {
            for (String s : list) {
                System.out.print(s);
                System.out.print(",");
            }
        } else {
            System.out.println("list  is  null");
        }


    }
}