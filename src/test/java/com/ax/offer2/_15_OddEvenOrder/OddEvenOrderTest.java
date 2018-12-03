package com.ax.offer2._15_OddEvenOrder;

import org.junit.Assert;
import org.junit.Test;

public class OddEvenOrderTest {

    @Test
    public void test() {
        OddEvenOrder oddEvenOrder = new OddEvenOrder();

        int[] ints1 = oddEvenOrder.oddEvenOrder(null);
        Assert.assertNull(ints1);



        int[] ints = oddEvenOrder.oddEvenOrder(new int[]{0,1,2,3,4,5,6,7,8,9});
        for (int i : ints) {
            System.out.println(i);
        }

         ints = oddEvenOrder.oddEvenOrder(new int[]{0});
        for (int i : ints) {
            System.out.println(i);
        }

    }

}
