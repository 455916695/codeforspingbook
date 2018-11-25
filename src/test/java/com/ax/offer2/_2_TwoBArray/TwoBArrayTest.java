package com.ax.offer2._2_TwoBArray;

import org.junit.Assert;
import org.junit.Test;

public class TwoBArrayTest {

    @Test
    public  void test () {


        boolean numTwoArray = TwoBArray.findNumTwoArray(new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}}, 1);

        Assert.assertEquals(true,numTwoArray);

    }
}
