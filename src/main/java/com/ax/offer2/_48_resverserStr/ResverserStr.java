package com.ax.offer2._48_resverserStr;

import org.springframework.util.StringUtils;

/**
 * 翻转单词顺序 (思想比较巧妙的题目)
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符顺序不变。
 *     为简单起见，标点符号和普通字母一样处理。
 *     例如输入字符串"I am  student.",则输出 "student. a  am I".
 */
public class ResverserStr {

    /**
     * 思路： 先翻转整个句子，再翻转每个单词
     */
    /**
     *  关键: 如何通过空格，获取每个单词的 起始于终止索引
     *
     * */

    public String resverseStr(String string) {

        if (StringUtils.isEmpty(string)) {
            return string;
        }
        char[] chars = string.toCharArray();
        resverse(chars, 0, chars.length-1);  //翻转整个句子

        string = new String(chars);

        //问题如何获取每个单词的开始与结束
        int low = -1;
        int high = string.indexOf(' ',0 );    //  可能会存在一个问题，多个空白连在一起
                                                              // String 的 indexOf(' ' ,0);  从 0 开始找寻第一个 ' ' 的索引位
        while (high > 0) {
            if(high - low > 1) {
                resverse(chars,low+1,high-1);
                low = string.indexOf(' ',low+1);
                high = string.indexOf(' ',high+1 );
            } else {
                low = string.indexOf(' ',low+1);
                high = string.indexOf(' ',high+1 );
            }
        }
        return  new String(chars);
    }

    private void  resverse(char[] chars, int low, int high) {
        if(chars == null  || chars.length < 1 ) {
            return ;
        }
        while (low < high){
            char temp = chars[high];
            chars[high] = chars[low];
            chars[low] = temp;
            high -- ;
            low ++;
        }
    }


}
