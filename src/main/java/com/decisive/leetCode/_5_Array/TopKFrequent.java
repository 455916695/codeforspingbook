package com.decisive.leetCode._5_Array;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 前K个高频元素
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 * 示例 1:
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 示例 2:
 * 输入: nums = [1], k = 1
 * 输出: [1]
 * 说明：
 * 你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
 * 你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
 */
public class TopKFrequent {

    public List<Integer> topKFrequent(int[] nums, int k) {
        //对数组进行排序
        Arrays.sort(nums);

        //遍历数组，统计出每种数字出现的次数，并以键值对的形式存放到集合中
        List<KeyValue> keyValues = arrayToKVList(nums);

        //对统计后的集合再次进行排序
        Collections.sort(keyValues);

        //访问集合中的前 k-1 个元素
        int size = keyValues.size() - 1;
        List<Integer> result = new ArrayList();
        for (int i = 0; i < k; i++) {
            result.add(keyValues.get(size - i).key);
        }

        return result;
    }

    private List<KeyValue> arrayToKVList(int[] nums) {

        List<KeyValue> list = new ArrayList();

        if (nums == null || nums.length < 1) {
            return list;
        }

        KeyValue keyValue = null;

        for (int num : nums) {
            if (keyValue == null || keyValue.key != num) {
                if (keyValue != null) {
                    list.add(keyValue);
                }
                keyValue = new KeyValue(num, 1);
            } else {
                keyValue.add();
            }
        }
        list.add(keyValue);
        return list;
    }

    class KeyValue implements Comparable<KeyValue> {
        int key;  //存放的元素
        int value; //出现的次数

        public KeyValue(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public void add() {
            add(1);
        }

        public void add(int addNum) {
            value += addNum;
        }

        @Override
        public int compareTo(KeyValue o) {
            return value - o.value;
        }
    }


    @Test
    public void test_arrayToKVList() {

        int[] nums = new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        List<KeyValue> list = arrayToKVList(nums);

        print(list);
    }

    @Test
    public void test_topKFrequent() {

        int[] nums = new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        List<Integer> list = topKFrequent(nums, 2);

        printInt(list);
    }

    private void printInt(List<Integer> list) {
        if (list != null) {
            for (Integer integer : list) {
                System.out.print(integer);
                System.out.print(" , ");
            }
            System.out.println();
        } else {
            System.out.println("list is  null");
        }
    }

    private void print(List<KeyValue> list) {
        if (list != null) {
            for (KeyValue keyValue : list) {
                System.out.println(keyValue.key + " : " + keyValue.value);
            }
        } else {
            System.out.println("list is  null");
        }
    }

}
