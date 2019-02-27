package com.ax.offer2._46_ArraySumS;

/**
 * 和为 S 的两个数字
 * 题目：输入一个递增排序的数组和一个数字s,在数组中查找两个数,使得他们的和正好的是S
 * 如果有多对数字的和等于s，输出任意一对即可
 */

/**
 * 思路：
 * 一: 循环遍历找到符合条件的两个数，  O(n^2)
 * 二：一个外循环，在配合一个 二分查找， O(nlong n)
 * 三：双指针遍历，对向遍历找出符合条件的数字 O(n)
 */
public class ArraySumS {

    public int[] foundNum(int[] numArray, int target) {
        if (numArray == null) {
            return null;
        }

        if (numArray.length  <1 || numArray[0] > target) {
            return null;
        }

        int low = 0;
        int high = numArray.length-1;
        int[] result = new int[]{0, 0};

        while (low < high) {
            if ((numArray[low] + numArray[high]) == target) {   // 这里可能会存在问题
                result[0] = numArray[low];
                result[1] = numArray[high];
                return result;
            }else  if((numArray[low] + numArray[high]) > target) {
                high --;
            }else {
                low ++;
            }
        }
        return null;
    }


}
