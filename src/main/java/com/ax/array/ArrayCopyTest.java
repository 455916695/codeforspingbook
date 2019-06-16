package com.ax.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArrayCopyTest {

    @Test
    public void test() {

        int[] ints = new int[3];

        print(ints);

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
        }

        //  Arrays.copyOf
        int[] newInts = Arrays.copyOf(ints, 4);
        Assert.assertNotEquals(ints, newInts);
        print(newInts);

//        System.arraycopy
        print(ints);
        System.arraycopy(ints, 2, ints, 1, 1);
        ints[2] = 0;
        print(ints);

    }


    private void print(int[] ints) {

        if (ints != null) {
            System.out.print("[");
            for (int anInt : ints) {
                System.out.print(anInt);
                System.out.print(",");
            }
            System.out.println("]");
        } else {
            System.out.println("null");
        }
    }
}
