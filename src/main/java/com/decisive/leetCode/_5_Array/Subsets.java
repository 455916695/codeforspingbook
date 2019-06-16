package com.decisive.leetCode._5_Array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 子集
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * 说明：解集不能包含重复的子集。
 */
public class Subsets {

    List<List<Integer>> result = null;

    /**
     *
     * */
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList();
        //判断参数是否合法
        if (nums == null || nums.length < 1) {
            return result;
        }
        //给数组排序
        Arrays.sort(nums);
        //递归，回溯算法
        List<Integer> temp = null; //存储临时的值
        int index = 0;     //访问数组的边界
        int length = nums.length;  //数组的长度
        recall(nums, length, index, temp);
        return result;
    }

    private void recall(int[] nums, int length, int index, List<Integer> temp) {
//        if (index == length) {
//            result.add(new ArrayList(temp));
//            return;
//        }

        if (index == 0) {
            temp = new ArrayList();
        }

        for (int i = index; i <= length; i++) {
            if (i == length) {
                result.add(new ArrayList(temp));
                return;
            }
            //添加值
            temp.add(nums[i]);
            //递归
            recall(nums, length, i + 1, temp);
            //移除值
            temp.remove(temp.size() - 1);
        }
    }


    @Test
    public void test_subsets() {
        List<List<Integer>> subsets = subsets(new int[]{1, 2, 3});

        print(subsets);
    }

    private void print(List<List<Integer>> subsets) {
        if (subsets != null) {
            for (List<Integer> subset : subsets) {
                if (subset != null) {
                    if (subset.size() == 0) {
                        System.out.print("[]");
                    }
                    for (Integer integer : subset) {
                        System.out.print(integer);
                        System.out.print(",");
                    }
                    System.out.println();
                } else {
                    System.out.println("subset is null");
                }
            }

        } else {
            System.out.println("subsets is null");
        }
    }
}


