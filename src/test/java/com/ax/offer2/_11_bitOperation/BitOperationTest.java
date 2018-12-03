package com.ax.offer2._11_bitOperation;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;

public class BitOperationTest {

    @Test
    public void  testWFY() {
        int i = BitOperation.counterOne(3);
        Assert.assertEquals(2,i);
    }

    @Test
    public void  testWFYForFS() {
        int i = BitOperation.counterOne(-1);

        Assert.assertEquals(31,i);
    }

    @Test
    public  void testLM() {

        int i = BitOperation.counterOneForLeftMove(1);
        System.out.println(i);
       i = BitOperation.counterOneForLeftMove(-1);
        System.out.println(i);

    }
    @Test
    public  void testJY() {

        int i = BitOperation.counterOneForJY(1);
        System.out.println(i);
        int i1 = BitOperation.counterOneForJY(-1);
        System.out.println(i1);
        int[] a = new int[10];

    }

    @Test
    public void  testBitSet() {

        BitSet bitSet = new BitSet(128);
        bitSet.set(1);
        bitSet.set(1);
        bitSet.set(100000);
        bitSet.set(1);
        System.out.println(bitSet);
        HashMap<Integer,Integer> hashMap = new HashMap();


    }

    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) {
            return null;
        }
        int num1Length = nums1.length;
        int num2Length = nums2.length;
        ArrayList<Integer> numList = new ArrayList<Integer>(num1Length < num1Length ? num1Length:num2Length);
        num1Length--;
        num2Length--;
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        while(num1Length >= 0 ){
            if(hashMap.containsKey(nums1[num1Length])){
                hashMap.put(nums1[num1Length],hashMap.get(nums1[num1Length])+1);
            }else{
                hashMap.put(nums1[num1Length],1);
            }
            num1Length--;
        }
        int count = 0;
        while(num2Length >= 0 ){
            if(hashMap.containsKey(nums2[num2Length])  ){
                if(hashMap.get(nums2[num2Length]) == 1) {
                    numList.add(nums2[num2Length]);
                    hashMap.remove(nums2[num2Length]);
                }else{
                    numList.add(nums2[num2Length]);
                    hashMap.put(nums2[num2Length],hashMap.get(nums2[num2Length])-1);
                }
                count++;
            }
            num2Length--;
        }
        int[] result = new int[count--];
        while(count >= 0) {
            result[count] = numList.get(count--);
        }
        return result;
    }
    @Test
    public void  test() {
//        int[] intersect = intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
//        for (int i : intersect) {
//            System.out.println(i);
//        }

       int[] intersect = intersect1(new int[]{-2147483648,1,2,3}, new int[]{1,-2147483648,-2147483648}); //不行
        for (int i : intersect) {
            System.out.println(i);
        }

        Arrays.sort(new int[]{1,2});
    }


    public int[] intersect1(int[] nums1, int[] nums2) {

        int[] r = getMaxAndMin(nums1,nums2);

        if(r == null) {
            return null;
        }

        int[] countArray = new int[r[0]- r[1] + 1];

        int length = countArray.length-1;

        for(int i = 0;i<nums1.length;i++) {

            int n = nums1[i] - r[1];
            if( n<=length && n>=0 ) {
                if(countArray[n] >0 ) {
                    countArray[n] = countArray[n]+1;
                }else{
                    countArray[n] = 1;
                }
            }
        }

        ArrayList<Integer> al = new ArrayList();

        for(int i = 0 ; i< nums2.length;i++) {
            int n = nums2[i] - r[1];
            if(n<=length && n>=0) {
                if(countArray[n] >0 ) {
                    al.add(nums2[i]);
                    countArray[n] = -- countArray[n];
                }
            }

        }

        int[] res = new int[al.size()];

        for(int i = 0 ;i<res.length;i++) {
            res[i] = al.get(i);
        }

        return res;
    }

    public int[] getMaxAndMin(int[] nums1,int[] nums2) {

        if(nums1 == null || nums2 == null) {
            return null;
        }
        int[] r1 = getMaxAndMin(nums1);
        int[] r2 = getMaxAndMin(nums2);

        if(r1 == null || r2 == null) {
            return null;
        }

        if(r1[0] >r2[0]) {
            r1[0] = r2[0];
        }

        if(r1[1] > r2[1]) {
            r1[1] = r2[1];
        }

        return r1;
    }

    public int[] getMaxAndMin(int[] num) {
        if(num == null || num.length <1){
            return null;
        }

        int[] result = new int[2];
        result[0] = num[0];
        result[1] = num[0];

        for(int i = 1 ;i<num.length;i++  ){
            if(num[i] > result[0]) {
                result[0] = num[i];
            }
            if(num[i] <result[1]) {
                result[1] = num[i];
            }
        }

        return result;
    }




}
