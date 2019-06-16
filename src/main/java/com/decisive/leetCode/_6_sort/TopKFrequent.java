package com.decisive.leetCode._6_sort;

import org.junit.Test;

import java.util.*;

public class TopKFrequent {
    //或者直接对 数组进行排序
    //再遍历数组，寻找 k 个不重复的值
    public List<Integer> topKFrequent(int[] nums, int k) {
        //
        //TODO 待续

        return  null;
    }

    

    @Test
    public void test_topKFrequentTree() {
        List<Integer> list = topKFrequent(new int[]{1, 1, 1, 2, 2, 2, 3}, 2);
        print(list);
    }

    private void print(List<Integer> list) {
        if (list != null) {
            for (Integer integer : list) {
                System.out.print(integer);
                System.out.print(",");
            }
        } else {
            System.out.println("list is null");
        }

    }

}
