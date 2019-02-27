package com.ax.offer2._37_FirstOnlyOne;

import org.springframework.util.StringUtils;

import java.util.HashMap;

/**
 * 第一个只出现一次的字符
 * 在字符串中找出第一个只出现一次的字符
 * 例如:"abaccdeff",则输出"b"
 */
public class FirstOnlyOne {

    /**
     * 分析：
     * 循环遍历字符串，记录下每次遍历的字符，与其出现的次数（存入hashMap中，以字符为键，出现的次数为值）
     * <p>
     * 循环遍历HashMap,找到第一个次数为1 的字符，返回
     */
    public Character foundFirstOnlyOne(String str) {

        if (StringUtils.isEmpty(str)) {
            return null;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>(65536);

        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        for (char aChar : chars) {
            if (hashMap.get(aChar) == 1) {
                return aChar;
            }
        }
        throw new RuntimeException("该字符串不符合条件");
    }

}
