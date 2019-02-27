package com.ax.offer2._40_ArrayInversion;


import org.junit.Test;

public class ArrayInversionTest {

    @Test
    public void test() {

        ArrayInversion ai = new ArrayInversion();
        int i = ai.foundInversionNum(null);
        System.out.println(i);


        ai = new ArrayInversion();
        i = ai.foundInversionNum(new int[]{7,5,6,4});
        System.out.println(i);

    }


}
