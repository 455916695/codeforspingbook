package com.ax.offer.twodimensionalarray;

import org.junit.Assert;
import org.junit.Test;

public class TwoDimensionalArrayTest {


    @Test
    public void  findRepetitionDataTest() {
            Integer[][] numArray  = new Integer[][]{{1, 4, 7, 11, 15},{2, 5, 8, 12, 19},{3, 6, 9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};

            TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

            Integer repetitionData = twoDimensionalArray.findRepetitionData(200, numArray);

            Assert.assertNull(repetitionData);
    } @Test
    public void  findRepetitionDataTest2() {
            Integer[][] numArray  = new Integer[][]{{1, 4, 7, 11, 15},{2, 5, 8, 12, 19},{3, 6, 9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};

            TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

            boolean repetitionData = twoDimensionalArray.Find(300, numArray);

        Assert.assertFalse(repetitionData);
//            Assert.assertTrue(repetitionData);
    }
}
