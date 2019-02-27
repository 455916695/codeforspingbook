package com.ax.leetCode.primary.array;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {

        int[] result = plusOne(digits, digits.length - 1);

        return result;
    }

    private int[] plusOne(int[] digits, int bitNum) {
        if (bitNum < 0) {
            //扩大数组范围
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            result[1] = 0;
            System.arraycopy(result, 2, digits, 1, digits.length - 1);
            return result;
        }
        if (++digits[bitNum] == 10) {
            digits[bitNum] = 0;
            digits = plusOne(digits, bitNum - 1);
        }
        return digits;
    }

    /**
     * 循环版
     */
    public int[] plusOneX(int[] digits) {

        boolean jFlag = false; //进位标志
//        boolean eFlag = false; //溢出标志
        for (int i = digits.length - 1; i >= 0; i--) {
            jFlag = false;
            if (++digits[i] == 10) {
                jFlag = true;
                digits[i] = 0;
//                if (i == 0) {
//                    eFlag = true;
//                }
            }
            if (!jFlag) {  //如果没有进位就
                return digits;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        System.arraycopy(result, 1, digits, 0, digits.length - 1);
        return result;

    }


}
