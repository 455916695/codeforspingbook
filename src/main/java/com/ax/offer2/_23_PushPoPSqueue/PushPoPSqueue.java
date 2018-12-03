package com.ax.offer2._23_PushPoPSqueue;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * 输入两个序列 A、B
 * A 是入栈序列
 * B 是出栈序列，
 * 判断 B  是不是 A 的出栈序列
 */
public class PushPoPSqueue {   //此处代码还存在着问题，可能会出现崩溃的情况

    Integer count = 0; //入栈数
    /**
     * 情况一: 参数为null
     * 情况二: 参数长度不一致
     * 情况三：两参数的长度相同，但内容不相同，比如  1，2,3,4,5     2,3,4，5,6
     * 情况四：正常情况
     */
    public boolean isPopSqueue(int[] pushArray, int[] popArray) {
        count = 0;
        if (popArray == null || pushArray == null || (pushArray.length != popArray.length)) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();
        boolean result = false;

        //正常情况,
        //先遍历 B ，得到 B 中的数字，
        for (int i = 0; i < popArray.length; i++) {
            //去栈中找，若栈顶数字是，则弹出，并进入下一循环
            try {
                if (popArray[i] != stack.peek()) {
                    //若不是，循环，将 A 中的数 一直入栈，每入一次栈就判断一次
                    result = isPopSqueueForNum(pushArray,stack,popArray[i]);
                } else {
                    stack.pop();
                    result = true;
                }
            } catch (EmptyStackException e) {
                //若不是，循环，将 A 中的数 一直入栈，每入一次栈就判断一次
                result = isPopSqueueForNum(pushArray,stack,popArray[i]);
            }
            if (!result) {
                return result;
            }
        }
        return result;
    }


    public  boolean isPopSqueueForNum(int[] pushArray,Stack<Integer> stack,int popNum) {

        while (count < pushArray.length) {   //若不是，循环，将 A 中的数 一直入栈，每入一次栈就判断一次

            stack.push(pushArray[count++]);  //找到与 popArray[i] 对应的数退出,循环

            if (popNum == stack.peek()) {  //若 A 遍历完毕，依然没有找到对应的数字，return false
                stack.pop();
                return  true;
            }
        }
        return false;
    }

}
