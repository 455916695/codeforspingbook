package com.ax.offer2._49_revolveStr;

import org.springframework.util.StringUtils;

/**
 * 旋转字符
 * 字符串的左旋转操作是把字符串前面的若干字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋操作的功能。
 * 比如输入字符串"abcdfg"和数字2，该函数将返回左旋2位得到的结果"cdefgab"
 */
public class RevolveStr {

    /**
     * 思路： 左旋多少位， 就相当于把字符串划分为两个单词，
     * 然后将两个单词交换位置
     */
    public String resverseStr(String target, int bitNum) {
        /**
         *   分析：
         *      情况一：字符串为空
         *      情况二：bitNum 大于 字符串长度
         *      情况三：bitNum  大于 字符串长度,且是字符串长度的整数倍
         *      情况四: 普通情况
         * */
        if (StringUtils.isEmpty(target) || target.length() <= 1) {
            return target;
        }

        int length = target.length();
        bitNum = bitNum % length;
        if (bitNum == 0) {
            return target;
        }
        char[] chars = target.toCharArray();
        resverse(chars, 0, length - 1);  // 整体翻转
        resverse(chars, 0, bitNum - 1);  //每个 "单词”  局部单词进行翻转
        resverse(chars, bitNum, length-1);      // 另一“单词”进行翻转

        return new String(chars);
    }

    /**
     * 注意边界问题: 是否是想要翻转的 边界
     */
    private void resverse(char[] chars, int low, int high) {
        if (chars == null || chars.length == 1) {
            return;
        }
        while (low < high) {
            char temp = chars[low];
            chars[low] = chars[high];
            chars[high] = temp;
            low++;
            high--;
        }
    }

}
