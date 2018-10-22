package com.ax.offer.dataduplication;

import static  org.junit.Assert.*;

import org.junit.Test;



public class DataDuplicationTest {

    @Test
    public  void  findRepetitionNumTest(){

        int[] numArray = null;

        Integer repetitionNum = DataDuplication.findRepetitionNum(numArray);

        ;assertNull(repetitionNum);

//        numArray = new int[1];
        numArray = new int[]{1};

        repetitionNum = DataDuplication.findRepetitionNum(numArray);

        ;assertNull(repetitionNum);

    }

    @Test
    public void  findNum() {
        int[] numArray = new int[]{4,5,4,1,2,3};

        int repetitionNum = DataDuplication.findRepetitionNum(numArray);

        assertEquals(4,repetitionNum);
    }

}
