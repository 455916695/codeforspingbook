package com.decisive.offer.test3;


import org.junit.Assert;
import org.junit.Test;

public class ArrayFindNumTest {

    @Test
    public void test() {

        ArrayFindNum arrayFindNum = new ArrayFindNum();
        boolean num = arrayFindNum.findNum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 7);

        Assert.assertTrue(num);
        arrayFindNum.findNum(null, 7);

    }

}
