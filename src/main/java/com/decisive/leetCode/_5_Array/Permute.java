package com.decisive.leetCode._5_Array;

import org.junit.Test;

import java.util.*;


/**
 * 全排列  (回溯算法)
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。
 */
public class Permute {
    List<List<Integer>> result = null;

    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList();
        //判断参数是否合法
        if (nums == null || nums.length < 1) {
            return result;
        }
        //使用递归对结果树进行深度遍历
        BitSet bitSet = new BitSet(nums.length); //状态标志位 表示对应数组上的位置已经被访问了
        int index = 0;   //记录 遍历的深度，
        List<Integer> temp = null;  // 记录深度遍历的结果
        recall(nums, bitSet, index, temp);
        //返回结果
        return result;
    }

    private void recall(int[] nums, BitSet bitSet, int index, List<Integer> temp) {
        //递归 进行深度遍历
        //判断是否超出遍历范围
        if (index == nums.length) {
            //换一个集合
            result.add(new ArrayList(temp));
            return;
        }
        if (index == 0) {
            temp = new ArrayList();
        }
        //从数组中获取一个没有被取过的值
        for (int i = 0; i < nums.length; i++) {  //从中间进行选取是不是可以考究一下
            //将取出的值添加到临时集合中
            if (!bitSet.get(i)) {
                temp.add(nums[i]);
                bitSet.set(i, true); // 将指定位置的数字标记为已使用
                //进入下一层遍历
                recall(nums, bitSet, index + 1, temp);
                //移除包括自己这一层的值
                temp.remove(temp.size() - 1);
                bitSet.set(i, false);
            }
        }
    }

    @Test
    public void test_permute() {
//
        List<List<Integer>> permute = permute(new int[]{1, 2, 3, 4});
//
        print(permute);

    }

    private void print(BitSet bitSet) {
        for (int i = 0; i < bitSet.size(); i++) {
            System.out.println(bitSet.get(i) + " " + i);
        }
    }


    /**
     * 打印输出结果
     */
    private void print(List<List<Integer>> permute) {

        if (permute != null) {
            for (List<Integer> list : permute) {
                if (list != null) {
                    for (Integer integer : list) {
                        System.out.print(integer);
                        System.out.print(",");
                    }
                    System.out.println();
                } else {
                    System.out.println("list is null");
                }
            }
        } else {
            System.out.println(" permute is null");
        }

    }


}


class New {

    List<List<Integer>> result = null;

    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList();
        //判断参数是否合法
        if (nums == null || nums.length < 1) {
            return result;
        }
        //使用递归对结果树进行深度遍历
        List<Integer> numList = arrayToList(nums);  //记录当前可以遍历的结果
        int index = 0;   //记录 遍历的深度，
        List<Integer> temp = null;  // 记录深度遍历的结果
        recall(nums, numList, index, temp);
        //返回结果
        return result;
    }

    private List<Integer> arrayToList(int[] nums) {
        List<Integer> res = new ArrayList();

        for (int num : nums) {
            res.add(num);
        }
        return res;
    }

    private void recall(int[] nums, List<Integer> numList, int index, List<Integer> temp) {
        if (index == nums.length) {
            result.add(new ArrayList(temp));
        }

        if (index == 0) {
            temp = new ArrayList();
        }

        int size = numList.size();

        while (size >= 1) {
            //获取第一个值
            Integer integer = numList.get(0);
            //添加到集合中
            temp.add(integer);
            //从集合移除第一个元素，递归
            numList.remove(0);
            recall(nums, numList, index + 1, temp);
            //将元素添加会集合中
            numList.add(integer);
            //从临时数据移除上一个数据
            temp.remove(temp.size() - 1);
            size --;
        }
    }


    public static void main(String[] args) {
        New n = new New();

        List<List<Integer>> permute = n.permute(new int[]{1, 2, 3, 4});
//
        n.print(permute);
    }

    /**
     * 打印输出结果
     */
    private void print(List<List<Integer>> permute) {

        if (permute != null) {
            for (List<Integer> list : permute) {
                if (list != null) {
                    for (Integer integer : list) {
                        System.out.print(integer);
                        System.out.print(",");
                    }
                    System.out.println();
                } else {
                    System.out.println("list is null");
                }
            }
        } else {
            System.out.println(" permute is null");
        }

    }
}