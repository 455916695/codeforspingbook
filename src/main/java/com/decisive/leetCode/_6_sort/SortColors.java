package com.decisive.leetCode._6_sort;

import org.junit.Test;

/**
 * 颜色分类
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 注意:
 * 不能使用代码库中的排序函数来解决这道题。
 * 进阶：
 * 一个直观的解决方案是使用计数排序的两趟扫描算法。
 * 首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。
 * 你能想出一个仅使用常数空间的一趟扫描算法吗？
 */
public class SortColors {
    /**
     * 思考：借助 计数排序的思路
     * 我们依然记录 0 1 2 ，但是不是记录数量，而是记录索引
     * 例如修改前面的数据 每改变一次索引，就会修改 指定索引上对应的值
     */
    public void sortColors(int[] nums) {
        //判断参数是否合法
        if (nums == null || nums.length <= 1) {
            return;
        }
        //循环数组，遍历其中的结果
        int redIndex = -1;
        int whiteIndex = -1;
        int blueIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            //判断遍历出来的数据是几
            //如果是 0
            //表示红色，修改redIndex 索引值，并修改对应位置上值，以及修改 whiteIndex  blueIndex
            //1
            //以及修改 whiteIndex  blueIndex
            //2
            //修改blueIndex
            //其他就抛出异常
            switch (nums[i]) {
                case 0:
                    //第一次出现0
                    nums[++redIndex] = 0;
                    //说明没有出现 white
                    if (whiteIndex != -1) {
                        nums[++whiteIndex] = 1;
                    }
                    if (blueIndex != -1) {
                        nums[++blueIndex] = 2;
                    }
                    //第二次，及以上出现
                    break;
                case 1:
                    //第一次出现1
                    if (whiteIndex == -1) {
                        whiteIndex = redIndex + 1;
                    } else {
                        whiteIndex++;
                    }
                    nums[whiteIndex] = 1;
                    //第二次及以上出现
                    if (blueIndex != -1) {
                        nums[++blueIndex] = 2;
                    }
                    break;
                case 2:
                    //第一次出现2
                    if (blueIndex == -1) {
                        if (whiteIndex != -1) {
                            blueIndex = whiteIndex + 1;
                        } else {
                            blueIndex = redIndex + 1;
                        }
                    } else {
                        blueIndex++;
                    }
                    //第二次及以上出现
                    break;
                default:
                    throw new RuntimeException("非法参数");
            }
        }
    }


    @Test
    public void test_sortColors() {
        int[] colors = new int[]{0, 1, 2, 1, 0, 2};
        sortColors(colors);

        print(colors);
    }

    private void print(int[] colors) {
        if (colors != null) {
            for (int color : colors) {
                System.out.print(color);
                System.out.print(",");
            }
        } else {
            System.out.println("colors is null");
        }
    }

}
