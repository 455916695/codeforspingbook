package com.ax.offer2._30_eightQueenProblem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * 八皇后问题
 * 在8 X 8 的国际象棋上摆放8个皇后，使其不能相互攻击，即任意两个皇后不得处于同一行、同一列或者同一对角线上
 * 得出摆放
 */
public class EightQueenProblem {
    /**
     * 定义出一个 长度为8 的数组，用 0~ 7 的数据初始化这个数组 （ 用户下标表示所在行，数组中的值表示所在的列）
     * 1.  再这个求这个数组的排列    （每个排列都满足，不在同一行与不在同一列的条件）
     * 2.  计算出符合条件的排列       （判断每个排列是否满足不在同一对角线的情况)
     */

    public void eightQueenProblem() {

        int[] numArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7};

        ArrayList<int[]> result = sortArray(numArray, 0, numArray.length - 1, new ArrayList<int[]>());

        System.out.println("共有"+result.size()+"种摆法");
        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println("");
        }

    }

    /**
     * 排列的方法与之前的方法一致，简单化这个题目
     */
    private ArrayList<int[]> sortArray(int[] numArray, int count, int length, ArrayList<int[]> resultList) {
        if (count == length) {
            //判断这个数组是否满足要求
            boolean result = isResult(numArray);
            if (result) {
                resultList.add(numArray);
            }
            return resultList;
        }

        ArrayList<int[]> tempList = new ArrayList<>();
        for (int i = count; i <= length; i++) {
            int temp = numArray[count];
            numArray[count] = numArray[i] ;
            numArray[i] = temp;
            int[] tempArray = new int[8];
            System.arraycopy(numArray, 0, tempArray, 0, numArray.length);
            tempList.add(tempArray);
        }

        count++;
        for (int[] ints : tempList) {
            sortArray(ints, count, length, resultList);
        }

        return resultList;
    }

    private boolean isResult(int[] numArray) {
        boolean result = true;
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i+1; j < numArray.length; j++) {
                if (((i - j) == (numArray[i] - numArray[j])) || ((j - i) == (numArray[i] - numArray[j]))) {
                    result = false;
                }
            }
        }

        return result;
    }


}
