package com.decisive.offer.test13;

/**
 * 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组 {3, 4, 5, 1, 2} 为 {1, 2, 3, 4, 5} 的一个旋转，该数组的最小值为 1。
 * NOTE：给出的所有元素都大于 0，若数组大小为 0，请返回 0。
 */
public class RotateArrayFindMin {  //有序 就要想到二分法 注意思考各种情况，进行各种尝试

    /**
     * 使用二分的变形
     */
    public int findMin(int[] nums) {
        //此处应该存在参数校验,暂时省略
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int l = 0;
        int h = nums.length - 1;
        int m = 0;
        while (l < h) {
            m = l + (h - l) / 2;
            if (nums[m] < nums[h]) {
                h = m;
            } else if (nums[m] > nums[h]) {
                l = m + 1;
            } else {
                return findMin(nums, l, h);
            }
        }
        return nums[h];
    }

    private int findMin(int[] nums, int l, int h) {

        int min = nums[l];

        for (int i = l + 1; i <= h; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }

}
