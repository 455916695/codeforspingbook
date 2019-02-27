package com.ax.offer2._51_straight;

import org.junit.Test;

public class StraightTest {

    @Test
    public void testR() {
        Straight straight = new Straight();
        int i = 50;
        while (i-- > 0) {

            for (int i1 : straight.randomPK(new int[]{2, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4})) {
                System.out.print(i1 + " ");
            }
            System.out.println("");
        }
    }

    @Test
    public void testS() {
        Straight straight = new Straight();
        int[] sA = new int[]{0, 2, 1, 1, 4, 8, 4};
        straight.sort(sA);

        for (int i : sA) {
            System.out.println(i);
        }
    }

    @Test
    public void testT() {
        Straight straight = new Straight();
        int[] sA = new int[]{0, 1, 4, 6,6};

        int[] statistics = straight.statistics(sA);

        for (int statistic : statistics) {
            System.out.println(statistic);
        }

    }

    @Test
    public void test() {
        Straight straight = new Straight();

        boolean straight1 = straight.isStraight();
        System.out.println(straight1);
    }

}
