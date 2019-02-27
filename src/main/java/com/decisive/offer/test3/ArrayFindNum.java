package com.decisive.offer.test3;

/**
 * 问题：从二维数组中查询查找指定的数据
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class ArrayFindNum {
    /**
     * */
    public boolean findNum(int[][] nums, int target) {
//        检测是否出现非法参数
        if (nums == null || nums.length < 1 || nums[0].length < 1) {
           throw  new RuntimeException("非法参数");
        }

        //获取指定区域的长度
        int totalRow = nums.length - 1;
        int totalLine = nums[0].length - 1;
        int line = totalLine;
        int row = 0;
        while (target != nums[row][line]) {
            //判断是比目标值，还是比目标值小
            if (target < nums[row][line]) {
                line--;
            } else {
                row++;
            }
            if (line < 0 || row > totalRow) {
                return false;
            }
        }
        return true;
    }

}
