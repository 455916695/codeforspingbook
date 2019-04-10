package com.decisive.sort;


import com.decisive.common.CommonUtils;
import org.junit.Test;

public class HeapSortTest {
    @Test
    public void test() {

        HeapSort hs = new HeapSort();

        int[] nums = new int[]{4, 6, 8, 5, 9};
        CommonUtils.print(nums);
        hs.sort(nums);
        CommonUtils.print(nums);
    }
}
