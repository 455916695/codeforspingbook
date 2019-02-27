package com.ax.offer2._39_StringDeleteRepetition;

import java.util.HashMap;

/**
 *  输入一个字符串，删除其中重复的字符
 *      例如输入：google    输出：gole
 *
 *         特点：每遍历一个字符,都需要知道其在字符串中是否出现过
 *
 * */
public class StringDeleteRepetition {

    public String deltStrRepetiton(String oldStr) {
        if(oldStr == null) {
            return oldStr;
        }

        HashMap<Character, Integer> hashMap = lookDelStr(oldStr);

        char[] resultArray = new char[hashMap.size()];

        int  index = 0;
        for (char c : oldStr.toCharArray()) {
            if(hashMap.containsKey(c)) {
                hashMap.remove(c);
                resultArray[index++] = c;
            }
        }

        return  new String(resultArray);

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
