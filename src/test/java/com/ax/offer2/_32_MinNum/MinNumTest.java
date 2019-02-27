package com.ax.offer2._32_MinNum;

import org.junit.Test;

public class MinNumTest {

    @Test
    public  void  testIll() {

        MinNum minNum = new MinNum();

        try {
            minNum.findMinNum(null,5);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        for (int i : minNum.findMinNum(new int[]{3, 2, 4, 5, 6}, 10)) {
            System.out.println(i);
        }

    }

    @Test
    public  void  test() {

        MinNum mn = new MinNum();

        int[] minNum = mn.findMinNum(new int[]{5, 4, 8, 6, 1, 2, 3, 7}, 6);

        for (int i : minNum) {
            System.out.println(i);
        }


    }


    @Test
    public  void  testIll2() {

        MinNum minNum = new MinNum();

        try {
            minNum.foundMinNum(null,5);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        for (int i : minNum.foundMinNum(new int[]{3, 2, 4, 5, 6}, 10)) {
            System.out.println(i);
        }

    }

    @Test
    public  void  test2() {

        MinNum mn = new MinNum();

        int[] minNum = mn.foundMinNum(new int[]{5, 4, 8, 6, 1, 2, 3, 7}, 2);

        for (int i : minNum) {
            System.out.println(i);
        }


    }







}
