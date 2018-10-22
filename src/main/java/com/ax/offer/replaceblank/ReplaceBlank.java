package com.ax.offer.replaceblank;

/**
 *  将一个字符串中的空格替换成 "%20"。
 *      Input:
 *        "We Are Happy"
 *      Output:
 *        "We%20Are%20Happy"
 * */
public class ReplaceBlank {
    /**
     *   思路: 将字符串转化为字符数组，
     * */
    public String replaceBlank(StringBuffer inputStr) {

        if(inputStr == null) {
            return null;
        }
        int before = inputStr.length() - 1;  //获取修改前的长度
        //  遍历字符串长度，如果出现空格，就在后面填充任意字符串
        for(int i = 0; i <= before;i++) {
            if(inputStr.charAt(i) == ' ') {
                inputStr.append("  ");
            }
        }
        /*
        *   按照 before 遍历字符串
        * */
        int after = inputStr.length()-1;
        for(int i = before ;i >0;i--) {
            if(inputStr.charAt(i)==' ') {
                inputStr.setCharAt(after--,'o');
                inputStr.setCharAt(after--,'o');
                inputStr.setCharAt(after--,'o');
            }else{
                inputStr.setCharAt(after--,inputStr.charAt(i));
            }
        }
        return inputStr.toString();
    }
}
