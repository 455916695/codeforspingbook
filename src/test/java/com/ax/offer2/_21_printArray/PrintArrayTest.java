package com.ax.offer2._21_printArray;


import org.junit.Test;

public class PrintArrayTest {

    @Test
    public void test() {
        PrintArray printArray = new PrintArray();

        int[][] numArray = new int[][]{new int[]{1, 2, 4}, new int[]{5, 6, 7, 8}, new int[]{9, 10, 11, 12}, new int[]{13, 14, 15, 16}};

        try {
            printArray.printAll(numArray);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        PrintArray printArray = new PrintArray();

        int[][] numArray = new int[][]{new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}, new int[]{9, 10, 11, 12}, new int[]{13, 14, 15, 16}};

        printArray.printAll(numArray);

    }

    @Test
    public void test3() {
        PrintArray printArray = new PrintArray();

        int[][] numArray = new int[][]{new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10}, new int[]{11, 12, 13, 14, 15}, new int[]{16, 17, 18, 19, 20}, new int[]{21, 22, 23, 24, 25}};

        printArray.printAll(numArray);

    }

}
