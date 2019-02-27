package com.ax.offer2._42_CountNumForSortArray;

/**
 * 数字在排序数组中出现的次数
 * 统计一个数字在排序数组中出现的次数
 * 例如：输入排序数组{1,2,3，3,3,3,4,5}和数字3，由于3在这个数组中出现了4次，因此输出4。
 * <p>
 * 思考：
 * 一： 循环遍历数组，并统计相应数字出现的次数   O(n)
 * 二：方式一：经过了大量的不需要的比较，
 * 思考人类是如何寻找这样的结果的：
 * 我们首先找到第一次出现的位置，
 * 然后找到最后一次出现的位置，
 * 就可以知道该数字在这个数组中出现的次数
 */
public class CountNumForSortArray {
    /**
     *   问题一：如何确定所传的参数  是有序的
     * */
    /**
     * 情况一：参数为null √
     * 情况二：target 不在array 中 √
     * 情况三：target 在array 中，但只出现一次  (是否还需要对出现的位置进行分析，避免越界的问题)
     * 情况四：target 在array 中，出现多次   √
     */
    public int countNum(int[] array, int target) {
        if (array == null) {
            return 0;
        }

        int firstIndex = fountFirstIndex(array, target); //返回大于0，表示存在， 小于0 表示不存在
        int lastIndex = fountLastIndex(array, target);

        if (firstIndex < 0 || lastIndex < 0) {
            return 0;
        }

        return lastIndex - firstIndex + 1;

    }

    /**
     * 二分法
     */
    public int fountFirstIndex(int[] array, int target) {

        //如何实现 ... ...
        int low = 0;
        int high = array.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = low + ((high - low) >> 1);
            if (array[mid] == target) {
                if (low == mid || array[mid - 1] != target) {
                    return mid;
                }
                high = mid - 1;
            } else if (array[mid] > target) {
                //在 mid 的左边
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }

    public  int fountLastIndex(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = low + ((high - low) >> 1);
            if (array[mid] == target) {
                if (high == mid || array[mid + 1] != target) {
                    return mid;
                }
                low = mid + 1;
            } else if (array[mid] > target) {
                //在 mid 的左边
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


}
