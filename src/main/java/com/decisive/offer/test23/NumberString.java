package com.decisive.offer.test23;

/**
 * 表示数值的字符串
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串 "+100","5e2","-123","3.1416" 和 "-1E-16" 都表示数值。
 * 但是 "12e","1a3.14","1.2.3","+-5" 和 "12e+4.3" 都不是。
 */
public class NumberString {

    /**
     * 该问题初步考虑很简单，但细思较为复杂
     */
    public boolean isNumber(String value) {

        try {
            int num = Integer.parseInt(value);
            return true;
        } catch (Exception e) {
            try {
                double v = Double.parseDouble(value);
                return true;
            } catch (Exception a) {
                return false;
            }
        }
    }
}
