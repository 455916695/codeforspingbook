package com.decisive.offer.test18;


import org.junit.Assert;
import org.junit.Test;

public class NumberPowerTest {

    @Test
    public void test() {
        NumberPower np = new NumberPower();
        double pow = np.pow(2, 2);
        System.out.println(pow);

        pow = np.pow(5, 3);
        System.out.println(pow);
    }

}
