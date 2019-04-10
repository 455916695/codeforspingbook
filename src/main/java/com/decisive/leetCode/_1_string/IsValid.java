package com.decisive.leetCode._1_string;

import java.util.LinkedList;

public class IsValid {

    public boolean isValid(String s) {
        // 使用 栈， 如果是 左括号  入栈
        // 如果是 右括号  ，从栈中弹出 一个 判断是不是对应的
        if (s == null || s.length() < 1) {
            return true;
        }

        LinkedList<Character> linkedList = new LinkedList<Character>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    linkedList.push('(');
                    break;
                case '（':
                    linkedList.push('（');
                    break;
                case '[':
                    linkedList.push('[');
                    break;
                case '{':
                    linkedList.push('{');
                    break;
                case ')':
                    if (linkedList.isEmpty() || linkedList.pop() != '(') return false;
                    break;
                case '）':
                    if (linkedList.isEmpty() || linkedList.pop() != '（') return false;
                    break;
                case ']':
                    if (linkedList.isEmpty() || linkedList.pop() != '[') return false;
                    break;
                case '}':
                    if (linkedList.isEmpty() || linkedList.pop() != '{') return false;
                    break;
            }

        }
        if (linkedList.isEmpty())
            return true;

        return false;
    }

    public static void main(String[] args) {
        IsValid isValid = new IsValid();
        boolean valid = isValid.isValid("()");
        System.out.println(valid);
    }
}
