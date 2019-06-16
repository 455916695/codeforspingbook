package com.decisive.leetCode._1_string;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成括号
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * 例如，给出 n = 3，生成结果为：
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 */
public class GenerateParenthesis {
    List<String> result = null; //要返回的结果

    public List<String> generateParenthesis(int n) {
        //判断参数是否合法
        //递归调用，回溯算法
        result = new ArrayList();
        StringBuffer temp = null; //临时变量
        int left = n;   //括号剩余数量
        int right = n;  //右括号剩余数量
        long index = 0;// 遍历的深度 防止n 特别大
        long length = n << 1;  //需要遍历的深度
        recall(left, right, length, index, temp);
        return result;
    }

    private void recall(int left, int right, long length, long index, StringBuffer temp) {
        if (index >= length) {
            result.add(temp.toString());
            return;
        }
        if (index == 0) {
            temp = new StringBuffer();
        }
        //要么添加左括号
        if (left > 0) {
            temp.append("(");
            left--;
            recall(left, right, length, index + 1, temp);
            temp.delete(temp.length() - 1, temp.length());
            left++;
        }
        //要么添加右括号
        if (right > left) {
            temp.append(")");
            right--;
            recall(left, right, length, index + 1, temp);
            temp.delete(temp.length() - 1, temp.length());
            right++;
        }
    }


    @Test
    public void test_generateParenthesis() {
        List<String> list = generateParenthesis(3);

        print(list);
    }

    private void print(List<String> list) {
        int index = 0;
        if (list != null) {
            for (String s : list) {
                System.out.print(s);
                System.out.println(index++);
            }
        } else {
            System.out.println("list is null");
        }
    }

}
