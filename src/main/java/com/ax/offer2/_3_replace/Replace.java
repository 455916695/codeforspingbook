package com.ax.offer2._3_replace;

import org.springframework.util.StringUtils;

/**
 *  替换字符串中的 空格
 *
 * */
public class Replace {


    public String replcae(String str,String  reValue) {

        String s = str.replaceAll(" ", reValue);

        return  s;

    }

    /**
     *  自己实现，字符串替换：注意替换字符可能会使字符增长
     *
     * */
    public static  String  replace(String str,char match,String reValue) {

        if(str == null  || StringUtils.isEmpty(reValue) || match == '\0' ) {
            return str;
        }

        //第一步：拓展数组长度
        int length = reValue.length();
        int lened = 0;  //替换后的字符串长度
        for (int i = str.length()-1; i>=0 ;i-- ){
            if(str.charAt(i) == match) {
                lened += length;
            }else {
                lened ++;
            }
        }

        char[] strChar = new char[lened-- ];

        for (int i = str.length()-1 ; i >= 0 ;i --) {
            if (str.charAt(i) == match ){
                //调用方法在
                for (int j =reValue.length()-1; j >=0 ; j-- ){
                    strChar[lened--] = reValue.charAt(j);
                }
            }else {
                strChar[lened--] = str.charAt(i);
            }
        }

        return  new String(strChar);
    }


}
