package com.ax.offer2._50_NDiceSum;


import org.junit.Test;

public class ManyDiceSumTest {

    @Test
    public void test() {

        ManyDiceSum mds = new ManyDiceSum();
        float v = mds.sumProbability(2, 5);  // 1 4 ，4  1， 2 3 ，3 2 ，   12
        System.out.println(v);
        ManyDiceSum.printProbability(5);

    }


}
