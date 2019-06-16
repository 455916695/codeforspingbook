package com.decisive.leetCode._5_Array;

import com.ax.offer2._21_printArray.PrintArray;
import com.sun.org.apache.bcel.internal.generic.SWAP;
import org.junit.Test;

/**
 * 从未排序的数组中，挑选出第k 个最大的值
 */
public class FindKthLargest {

    //思路：使用快排， 不过要对快排进行改造，我们不需要对整个数组都进行排序
    public int findKthLargest(int[] nums, int k) {
        //判断参数是否合法 此处省略
        k = nums.length - k + 1;
        int num = quickSort(nums, k, 0, nums.length - 1);
        return num;
    }

    /**
     * 通过简化快速排序进行寻找对应的值
     */
    private int quickSort(int[] nums, int k, int left, int right) {

        int result = Integer.MIN_VALUE;  //结果

        //判断参数是否合法
        if (left > right) {
            return result;  //表示不存在第 k 个大小的值
        }

        //寻找一个基值
        int baseIndex = findBaseIndex(left, right);

        //将基值与left值进行交换
        swap(nums, baseIndex, left);
        baseIndex = left;

        int leftIndex = left;
        int rightIndex = right;

        //对该基值进行排序
        while (leftIndex < rightIndex) {
            //从右边寻找一个比基值小的数
            while (rightIndex > leftIndex && nums[rightIndex] >= nums[baseIndex]) {
                rightIndex--;
            }
            //从左边寻找一个比基值大的数
            while (leftIndex < rightIndex && nums[leftIndex] < nums[baseIndex]) {
                leftIndex++;
            }
            //交换
            swap(nums, leftIndex, rightIndex);
            rightIndex--;
        }
        //判断该基值的索引是否满足  index =  k - 1；
        if (leftIndex == (k - 1)) {
            result = nums[baseIndex];
        } else {
            swap(nums, leftIndex, baseIndex);
            if (leftIndex < (k - 1)) {
                result = quickSort(nums, k, leftIndex + 1, right);
            } else {
                result = quickSort(nums, k, left, leftIndex - 1);
            }
        }

        return result;
    }

    /**
     * 参数指定范围内的一个索引
     */
    private int findBaseIndex(int left, int right) {
        return (int) (Math.random() * (right - left) + left);
    }

    /**
     * 交换
     */
    private void swap(int[] nums, int baseIndex, int left) {
        int temp = nums[baseIndex];
        nums[baseIndex] = nums[left];
        nums[left] = temp;
    }


    @Test
    public void test_findBaseIndex() {

        for (int i = 0; i < 10; i++) {
            int baseIndex = findBaseIndex(0, 5);
            System.out.println(baseIndex);
        }
    }


    @Test
    public void test_swap() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        swap(nums, 0, 4);

        printArray(nums);
    }

    private void printArray(int[] nums) {
        if (nums != null) {
            for (int num : nums) {
                System.out.print(num);
                System.out.print(",");
            }
            System.out.println();
        } else {
            System.out.println("nums is null");
        }

    }

    @Test
    public void test_quickSort() {
        int i = quickSort(new int[]{1, 2, 8, 5, 3}, 5, 0, 4);

        System.out.println(i);
    }

    @Test
    public void test_findKthLargest() {
        int kthLargest = findKthLargest(new int[]{1, 2, 8, 5, 3}, 1);
        System.out.println(kthLargest);
    }

}
