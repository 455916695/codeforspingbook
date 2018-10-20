package com.ax.offer.twodimensionalarray;

import static  org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class TwoDimensionalArrayTest {

    @Test
    public  void  findRepetitionNumTest(){

        int[] numArray = null;

        Integer repetitionNum = TwoDimensionalArray.findRepetitionNum(numArray);

        ;assertNull(repetitionNum);

//        numArray = new int[1];
        numArray = new int[]{1};

        repetitionNum = TwoDimensionalArray.findRepetitionNum(numArray);

        ;assertNull(repetitionNum);

    }

    @Test
    public void  findNum() {
        int[] numArray = new int[]{4,5,4,1,2,3};

        int repetitionNum = TwoDimensionalArray.findRepetitionNum(numArray);

        assertEquals(4,repetitionNum);
    }

}
