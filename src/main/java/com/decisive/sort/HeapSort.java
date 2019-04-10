package com.decisive.sort;

/**
 * 堆排序
 * 思路：利用大顶堆与小顶堆  的规律，对 数据进行排序
 * 每次从大顶堆中找出最大值
 * 或者每次从小顶堆中找到最小值
 * a[i] >= a[2i+1]  a[i] >= a[2i+2]
 * a[i] <= a[2i+1]  a[i] <= a[2i+2]
 */
public class HeapSort {  //TODO 初步测试，   但对于一些特殊情况都还没有考虑，只能算初步实现

    public void sort(int[] nums) {
//        1.初始化构建堆  （初步构建大顶堆，是需要从下往上构建）     从下往上构建堆
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            adjustHeadp(nums, i, nums.length);
        }
//        2.交换堆顶与末尾元素 + 重构堆                              从上往下构建堆
        for (int i = nums.length - 1; i >= 0; i--) {
            swap(nums, 0, i);
            adjustHeadp(nums, 0, i);
        }
    }

    /**
     * 从数组指定位置开始构建堆
     */
    public void adjustHeadp(int[] nums, int i, int length) {
        int temp = nums[i];
//从指定节点的左子树开始
        for (int k = 2 * i + 1; k < length; k++) {
            //判断是否存在右子树
            if (k + 1 < length && nums[k] < nums[k + 1]) {   //判断左右子树谁大
                k++;  //将k切换到 右子树
            }
            if (nums[k] > nums[i]) {   //判断子树 是否比父大
                nums[i] = nums[k];  //将子节点的值，直接赋值给父节点
                i = k;
            } else {
                break;     //如果左右子树都比父节点小，直接退出循环
            }
        }
        nums[i] = temp;  //这个值什么时候赋
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


}
