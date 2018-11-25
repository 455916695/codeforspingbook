package com.ax.offer2._9_binarySearch;

import org.junit.Assert;
import org.junit.Test;

/**
 *   旋转数组 查找最小值
 *
 * */
public class BinarySearchTest {
    /**
     *  分析：
     *      情况1：普通情况，最小值在中间
     *      情况2：特殊情况1，最小值是第一个（即旋转后数组仍然是有序数组）√
     *      情况3：特殊情况2，存在数据重复，且中间值与前后两个值相等  √
     *      情况4：非法情况, 传入的数组参数为null   √
     * */

    @Test
    public void testNull() {
        int result = BinarySearch.min(null);
        Assert.assertEquals(-1,result);
    }

    @Test
    public void testT1() {
        int[] numArray = {1,2,3,4,5};
        int result = BinarySearch.min(numArray);
        Assert.assertEquals(0,result);
    }

    @Test
    public void testT2() {
        int[] numArray = {1,1,0,1,1,1,1,1,1,1};

        int result = BinarySearch.min(numArray);
        Assert.assertEquals(2,result);

    }

    @Test
    public  void  testP() {

        int[] numArray = {3,4,5,1,1,2,2};

        int result = BinarySearch.min(numArray);
        System.out.println(result + "= >" +numArray[result]);
    }

    @Test
    public  void  testT3() {

        int[] numArray = {3,3,3,3,3,3,3};

        int result = BinarySearch.min(numArray);
        System.out.println(result + "= >" +numArray[result]);
    }


}
