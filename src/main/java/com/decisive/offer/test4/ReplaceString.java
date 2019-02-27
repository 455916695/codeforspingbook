package com.decisive.offer.test4;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为 We Are Happy. 则经过替换之后的字符串为 We%20Are%20Happy。
 * O(n) + O(1)
 */
public class ReplaceString {
    /**
     * 由于要求的规定，不能生成新的数组，所以只能从原有字符串上进行替换,     受限制与所给的参数，如果所给的参数不是StringBuffer 问题该怎么写，那么空间的限制可能无法遵守，
     */
    public String replace(StringBuffer stringBuffer) {
        int oldLength = stringBuffer.length() - 1;
        for (int i = 0; i <= oldLength; i++) {  //第一步扩充原有的数组
            if (stringBuffer.charAt(i) == ' ') {
                stringBuffer.append("  ");
            }
        }

        int newLength = stringBuffer.length() - 1;
        while (oldLength >= 0 && newLength > oldLength) {
            char c = stringBuffer.charAt(oldLength--);
            if (c == ' ') {
                stringBuffer.setCharAt(newLength--, '0');
                stringBuffer.setCharAt(newLength--, '2');
                stringBuffer.setCharAt(newLength--, '%');
            } else {
                stringBuffer.setCharAt(newLength--, c);
            }
        }
        return stringBuffer.toString();
    }


}
