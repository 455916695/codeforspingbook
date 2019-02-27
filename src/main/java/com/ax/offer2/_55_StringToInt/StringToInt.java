package com.ax.offer2._55_StringToInt;

import org.springframework.util.StringUtils;

/**
 * 字符串转化为整数
 */
public class StringToInt {
    /**
     * 注意边界问题
     */
    public long strToInt(String str) {
        if (StringUtils.isEmpty(str)) {
            throw new RuntimeException("输入的是非法参数");
        }

        long num = 0;
        int flag = 1;
        str = str.trim();
        char[] chars = str.toCharArray();

        if (chars[0] == '+') {
            flag = 1;
        } else if (chars[0] == '-') {
            flag = -1;
        } else if (chars[0] >= '0' && chars[0] <= '9') {
            num = chars[0] - '0';
        } else {
            throw new RuntimeException("输入的是非法参数");
        }
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                num = num * 10 + (chars[i] - '0');
            } else {
                throw new RuntimeException("输入的是非法参数");
            }
        }
        return flag * num;
    }

}
