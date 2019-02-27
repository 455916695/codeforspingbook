package com.ax.offer2._38_deleteStringForOtherString;

import org.springframework.util.StringUtils;

import java.util.HashMap;

/**
 * 输入两个字符串，从第一个字符串中删除在第二个字符串中出现过的所有字符
 * 例如：从第一个字符串“We are students.”中删除在第二个字符串“aeiou”中出现过的字符得到的结果是“W r Stdnts”
 * <p>
 * 特点：需要反复的从某个容器中查找字符，
 */
public class DeleteChar {

    public String deleteCharForStr(String oldStr, String delStr) {
        if (oldStr == null || delStr == null) {
            return oldStr;
        }

        //创建数组
        char[] chars = new char[oldStr.length()];

        //遍历delStr ,记录出现的字符
        HashMap<Character, Integer> delMap = lookDelStr(delStr);

        //遍历oldStr
        int index = 0;
        for (char c : oldStr.toCharArray()) {
            if (!delMap.containsKey(c)) {
                chars[index++] = c;
            }
        }

        return new String(chars);
    }

    private HashMap<Character, Integer> lookDelStr(String delStr) {

        if (delStr == null) {
            return null;
        }

        HashMap<Character, Integer> resultMap = new HashMap<>();

        for (char c : delStr.toCharArray()) {
            if (resultMap.containsKey(c)) {
                resultMap.put(c, resultMap.get(c) + 1);
            } else {
                resultMap.put(c, 1);
            }
        }

        return resultMap;
    }

}
