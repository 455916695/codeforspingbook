package com.ax.leetCode.primary.array;


import org.junit.Test;

public class PlusOneTest {

    @Test
    public void test() {

        PlusOne plusOne = new PlusOne();
        int[] ints = plusOne.plusOne(new int[]{9, 9, 9});
        for (int anInt : ints) {
            System.out.println(anInt);
        }


        ints = plusOne.plusOneX(new int[]{9, 9, 9});
        for (int anInt : ints) {
            System.out.println(anInt);
        }


    }

}
