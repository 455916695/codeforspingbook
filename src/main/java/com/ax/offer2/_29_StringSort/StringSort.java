package com.ax.offer2._29_StringSort;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *  字符串排序
 *      输入一个字符串，打印出该字符串中字符的所有排序，
 *         例如：输入字符串 abc ,则打印出有字符 a、b、c所能排列出来的所有字符串abc、acb、bac、bca、cab、cba
 * */
public class StringSort {
    /**
     *  分析:
     *      1.第一遍：将第一个字符与后面的字符交换位置，产生出新的字符
     *
     *      2.如果第一字符就是最后一个字符，打印出字符串
     *         如果不是重复第一步
     *
     * */
    public void stringSort(String sortStr){
        if(StringUtils.isEmpty(sortStr)) {
            return;
        }
        HashSet<String> result = new HashSet();
        HashSet<String> hashSet = stringSort(sortStr, 0, sortStr.length() - 1, result);
        for (String s : hashSet) {
            System.out.println(s);
        }

    }

    private HashSet<String> stringSort(String sortStr, int count, int length,HashSet<String> resultSet) {
        if(count == length) { //是第一字符，就是最后一个字符
            resultSet.add(sortStr);
            return resultSet;
        }
        char[] chars = sortStr.toCharArray();
        HashSet<String> hashSet = new HashSet<>();    //去掉重复的排序
        for (int i = count;i<=length;i++){
            char temp = chars[count];
            chars[count] = chars[i];
            chars[i] = temp;
            hashSet.add(new String(chars));
        }
        count++;
        for (String  str : hashSet) {
            stringSort(str.toString(),count,length,resultSet);
        }
        return resultSet;
    }

}
