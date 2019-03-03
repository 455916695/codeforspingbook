package com.decisive.offer.test18;

/**
 * 数据的整数次方
 */
public class NumberPower {

    /**
     * 思路：看到这个问题，就要想到递归
     */
    public double pow(double num, int powNum) {

        if (powNum == 0) {
            return 1;
        }
        if (num == 0) {
            return 0;
        }
        if (powNum == 1) {
            return num;
        }
        double pow = pow(num, powNum / 2);

        pow = pow * pow;

        if (powNum % 2 == 1) {
            return pow * num;
        }
        return pow;


    }


}
