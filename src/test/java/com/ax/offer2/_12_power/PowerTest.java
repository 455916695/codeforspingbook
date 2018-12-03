package com.ax.offer2._12_power;

import org.junit.Test;

public class PowerTest {

    @Test
    public void test() {
        Power power = new Power();
        double power1 = power.Power(2, 2);
        System.out.println(power1);

        power1 = power.Power(2, 0);
        System.out.println(power1);

        power1 = power.Power(2, -2);
        System.out.println(power1);

        power1 = power.Power(0, 2);
        System.out.println(power1);

        try {
            double power2 = power.Power(0, -2);
            System.out.println(power2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }




}
