package com.decisive.leetCode._2_math;

import com.decisive.sort.SelectionSort;
import com.decisive.sort.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和：
 */
public class ThreeSum {

    private List<List<Integer>> result = null;

    public List<List<Integer>> threeSum(int[] nums) {
        //思路：先排序，排序后，遍历
        if (nums == null || nums.length < 3) return null;

        Arrays.sort(nums);

        result = new ArrayList();
        for (int i = 0; i < nums.length - 2; i++) {

            if (i == 0) {
                findNum(nums, i);
            } else if (nums[i] != nums[i - 1]) {
                findNum(nums, i);
            }
        }
        return result;
    }

    private List<Integer> findNum(int[] nums, int i) {
        int temp = -1 * nums[i];  //就是要找到两个数字之和等于其相反数
        List<Integer> tempList = null;
        int low = i + 1;
        int high = nums.length - 1;
        while (low < high) {
            if ((nums[low] + nums[high]) == temp) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[low]);
                list.add(nums[high]);
                if (tempList != null) {
                    if ((tempList.get(0) != nums[i]) || (tempList.get(1) != nums[low]) || (tempList.get(2) != nums[high])) {
                        tempList = list;
                        result.add(list);
                    }
                } else {
                    tempList = list;
                    result.add(list);
                }

                low++;
            } else if ((nums[low] + nums[high]) < temp) {
                low++;
            } else {
                high--;
            }
        }
        return null;
    }

    //复习 选择排序 插入排序 冒泡排序 归并排序 快速排序  堆排序
    private void sort(int[] nums) {
        //选择排序
        Sort sort = new SelectionSort();  //选择排序
        sort.sort(nums); //每趟从后面选出一个最小值，安放到前面
    }


    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();

        List<List<Integer>> lists = threeSum.threeSum(new int[]{0, 0, 0, 0});

        threeSum.print(lists);
    }

    void print(List<List<Integer>> lists) {
        if (lists != null) {
            for (List<Integer> list : lists) {
                if (list != null) {
                    for (Integer integer : list) {
                        System.out.print(integer);
                        System.out.print(" , ");
                    }
                    System.out.println("");
                }
            }

        }
    }
}
