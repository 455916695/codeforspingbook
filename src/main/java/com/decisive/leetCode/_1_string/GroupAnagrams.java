package com.decisive.leetCode._1_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 字谜分组
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 */
public class GroupAnagrams {

    /**
     * 问题的分析：
     * 第一：最终结果需要分组  此时需要考虑到HashMap
     * 第二：如何区分到每个组中呢，  将内容排序，排序后做为键 存放到 HashMap 中
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length < 1) return new ArrayList<List<String>>();

        List<List<String>> result = new ArrayList();

        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (String str : strs) {
            // 对 str 进行处理，
            char[] chars = str.toCharArray();

            Arrays.sort(chars);  // str 进行排序

            String strKey = String.valueOf(chars);

            if (hashMap.containsKey(strKey)) {
                hashMap.get(strKey).add(str);  //如果存在这个键 ，就值存放对应的List中
            } else {
                List<String> list = new ArrayList();
                list.add(str);
                hashMap.put(strKey, list);
            }
        }
        return new ArrayList(hashMap.values());
    }




}
