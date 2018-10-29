package com.ax.offer.parenthesesgenerates;

import java.util.List;

/**
 *  括号生成
 *         输入n  表示生成 n 对合法格式的括号，编写函数输出所有可能
 * */
public class ParenthesesGenerates {

    /**
     *  留下一个问题，利用栈，将这个递归实现，转换成迭代实现
     *
     * */
    public void parenthesesGenerates(int  left , int right, String out, List<String> list) {
        if(left < 0 || right < 0 || left >right) {
            return;
        }

        if(0 == left && right ==0) {  //此处存在一些迷糊
            list.add(out);
            return;
        }

        parenthesesGenerates(left - 1,right,out+"(",list);
        parenthesesGenerates(left ,right-1,out+")",list);

    }

}
