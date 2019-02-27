package com.ax.offer2._52_lastNumberInCircle;


import org.junit.Test;

public class LastNumberInCircleTest {

    @Test
    public  void  test() {
        LastNumberInCircle lnic = new LastNumberInCircle();
        Integer integer = lnic.lastNumber(new int[]{1,2,3,4,5,6,7,8,9,10}, 0);
        System.out.println(integer);
    }


}
