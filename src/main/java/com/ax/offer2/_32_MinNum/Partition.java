package com.ax.offer2._32_MinNum;

public class Partition {


    public  static int partition(int[] numArray, int low, int high, int length) {
        int tempIndex = (int) (Math.random() * (high - low)) + low;
        change(numArray, low, tempIndex);
        int start = low + 1;
        int end = high;
        while (start < end) {
            if (numArray[end] > numArray[low]) {
                end--;
                continue;
            }
            if (numArray[start] <= numArray[low]) {
                start++;
                continue;
            }
            change(numArray, start, end);
        }
        change(numArray, low, start);
        return start;
    }

    public static  void change(int[] numArray, int low, int target) {
        int temp = numArray[low];

        numArray[low] = numArray[target];

        numArray[target] = temp;

    }

}
