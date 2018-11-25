package com.ax.offer2._9_binarySearch;

/**
 *    将有序数组经过旋转后，得到旋转数组
 *          从旋转数组中查询出最小的数字
 * */
public class BinarySearch {
    /**
     *  分析：
     *      情况1：普通情况，最小值在中间
     *      情况2：特殊情况1，最小值是第一个（即旋转后数组仍然是有序数组）
     *      情况3：特殊情况2，存在数据重复，且中间值与前后两个值相等
     *      情况4：非法情况, 传入的数组参数为null
     *      情况5：最小值 重复
     * */
    public static  int min(int[] numArray) {  //查询到最小值的索引值
        int result = -1;

        if(numArray == null || numArray.length <1) {
            return  result;
        }

        int lowIndex = 0;
        int highIndex = numArray.length-1;

        if(numArray[lowIndex]  < numArray[highIndex]) {
            return lowIndex;
        }

        int mid = lowIndex + (highIndex - lowIndex)/2;
        if(numArray[mid] == numArray[lowIndex] && numArray[mid] == numArray[highIndex] ) {
            return minInOrder(numArray);
        }

        //普通情况
        while (lowIndex < highIndex){
            mid = lowIndex + (highIndex - lowIndex)/2;
//         3,4,5,1,2
            if(numArray[lowIndex] < numArray[mid]) {
                lowIndex = mid + 1;
                continue;
            }
            if(numArray[lowIndex] > numArray[mid]) {
                highIndex = mid;
                continue;
            }
            if(numArray[lowIndex] == numArray[mid]) {  //解决出现重复的情况
                if (numArray[lowIndex] <= numArray[highIndex]){
                    break;
                }else {
                    lowIndex = mid + 1;
                }
            }
        }

        return  lowIndex;
    }

    private static int minInOrder(int[] numArray) {
        int resultIndex = 0;
        for (int i = 1 ; i < numArray.length;i++) {
            if(numArray[resultIndex]>numArray[i]){
                resultIndex = i;
            }
        }
        return resultIndex;
    }

}
