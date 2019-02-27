package com.ax.offer2._53_SumN;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import jdk.nashorn.internal.ir.ReturnNode;

import java.awt.*;
import java.util.ArrayList;

/**
 * 求 1 + 2 + ... + n
 *      题目：
 *          求 1 + 2 + ... + n，要求不能使用乘除法，
 *          for、while、if、、else、switch、case等关键字及条件判断语句（A? B:C）
 */
public class SumN {

    public int sum(int n) {  //  递归代替循环，异常代替结束条件
        try {
            int i = 1 / n;
        } catch (Exception e) {
            return 0;
        }
        return sum(n - 1) + n;
    }

}
