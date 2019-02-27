package com.ax.leetCode._3_inversion;

import org.junit.Test;

public class RotateTest {

    @Test
    public void test() {
        Rotate rotate = new Rotate();

        int[][] nums = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] nums2 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate.rotate(nums);
        rotate.rotate(nums2);


        System.out.println(nums+""+nums2);
    }


}
