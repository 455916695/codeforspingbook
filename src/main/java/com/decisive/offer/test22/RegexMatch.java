package com.decisive.offer.test22;

import org.springframework.util.StringUtils;

/**
 * 正则表达式匹配
 * 请实现一个函数用来匹配包括 '.' 和 '*' 的正则表达式。
 * 模式中的字符 '.' 表示任意一个字符，而 '*' 表示它前面的字符可以出现任意次（包含 0 次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串 "aaa" 与模式 "a.a" 和 "ab*ac*a" 匹配，但是与 "aa.a" 和 "ab*a" 均不匹配。
 */
public class RegexMatch {  //TODO  第一次看到题目 没有思路

    /**
     * 举例思考:
     * 一: 可能出现的情况   . 表示任意一个   * 表示 任意次
     * 初步思路：同步遍历字符串，再根据不同情况进行解析      需要思考：特殊案例 "","."
     */
    public boolean regexMatch(String value, String regex) {
        //校验 value  regex  是否合法
        if (StringUtils.isEmpty(value) || StringUtils.isEmpty(regex)) {
            return false;
        }
        boolean result = true;
        int i = 0;
        int j = 0;
        for (; i < regex.length() && j < value.length(); i++, j++) {
            if (regex.charAt(i) == '.') {
                if(j >= value.length()) {
                    return false;
                }
            } else if (regex.charAt(i) == '*') {
                char temp = regex.charAt(i - 1);  //此处存在风险
                while (j < value.length() && temp == value.charAt(j)) {
                    j++;
                }
                //此处需要校验是否是超出范围
                if (j >= value.length()) {
                    if (i >= regex.length()) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    j--;
                }
            } else if (regex.charAt(i) != value.charAt(j)) {
                return false;
            }
        }
        if(i ==  regex.length() && j == value.length() ) {
            return true;
        }
        return false;
    }



//    链接：https://www.nowcoder.com/questionTerminal/45327ae22b7b413ea21df13ee7d6429c
//    来源：牛客网
/*
    解这题需要把题意仔细研究清楚，反正我试了好多次才明白的。
    首先，考虑特殊情况：
         1>两个字符串都为空，返回true
         2>当第一个字符串不空，而第二个字符串空了，返回false（因为这样，就无法
            匹配成功了,而如果第一个字符串空了，第二个字符串非空，还是可能匹配成
            功的，比如第二个字符串是“a*a*a*a*”,由于‘*’之前的元素可以出现0次，
            所以有可能匹配成功）
    之后就开始匹配第一个字符，这里有两种可能：匹配成功或匹配失败。但考虑到pattern
    下一个字符可能是‘*’， 这里我们分两种情况讨论：pattern下一个字符为‘*’或
    不为‘*’：
          1>pattern下一个字符不为‘*’：这种情况比较简单，直接匹配当前字符。如果
            匹配成功，继续匹配下一个；如果匹配失败，直接返回false。注意这里的
            “匹配成功”，除了两个字符相同的情况外，还有一种情况，就是pattern的
            当前字符为‘.’,同时str的当前字符不为‘\0’。
          2>pattern下一个字符为‘*’时，稍微复杂一些，因为‘*’可以代表0个或多个。
            这里把这些情况都考虑到：
               a>当‘*’匹配0个字符时，str当前字符不变，pattern当前字符后移两位，
                跳过这个‘*’符号；
               b>当‘*’匹配1个或多个时，str当前字符移向下一个，pattern当前字符
                不变。（这里匹配1个或多个可以看成一种情况，因为：当匹配一个时，
                由于str移到了下一个字符，而pattern字符不变，就回到了上边的情况a；
                当匹配多于一个字符时，相当于从str的下一个字符继续开始匹配）
    之后再写代码就很简单了。
*/

    // 个人感觉: 一定要思考清楚，特殊情况，对于问题的特殊情况，需要考虑情况
    // 这题的特殊情况：就是两个串中 ， 谁空谁不空的问题，



}
