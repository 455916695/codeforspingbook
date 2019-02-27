package com.ax.offer2._45_ArrayCountOneNum;

/**
 * 数组中只出现一次的数字
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次
 * 请写出程序找出这两个只出现一次的数字。
 * 要求时间复杂度是O(n),空间复杂度为O(1)
 * <p>
 * <p>
 * 特点：
 * 如果一个数组中，只有一个数字出现一次，其他数字都出现两次，那么 可以 采用 异或 运算 得到这个数字
 * <p>
 * 如果一个数组中，有两个出现一次，其他数字都出现两次，那么可以采用 一定的方式将数组分为两个数组，
 * 每个数组中包含一个只出现一次的数字，在分别采取异或的方式，解决问题
 * <p>
 * 特点：
 * 如果一个数组中，只有一个数字出现一次，其他数字都出现两次，那么 可以 采用 异或 运算 得到这个数字
 * <p>
 * 如果一个数组中，有两个出现一次，其他数字都出现两次，那么可以采用 一定的方式将数组分为两个数组，
 * 每个数组中包含一个只出现一次的数字，在分别采取异或的方式，解决问题
 */
/**
 *  特点：
 *      如果一个数组中，只有一个数字出现一次，其他数字都出现两次，那么 可以 采用 异或 运算 得到这个数字
 *
 *      如果一个数组中，有两个出现一次，其他数字都出现两次，那么可以采用 一定的方式将数组分为两个数组，
 *      每个数组中包含一个只出现一次的数字，在分别采取异或的方式，解决问题
 * */

/**
 *   思考： 如何将一个数组分为两个数组？
 *         特点： 如果两个数字不相等，其异或的结果必然不为 0  ，及 异或结果的二进制表示中必然会存在  1
 *         如果 以 出现  1  的位置，进行划分， 在该位上是 1 分为一组， 在该位是 0 分为一组
 *
 *         这样就可以分为两个数组，每个数组只包含一个只出现一次的数字了
 * */
public class ArrayCountOneNum {

    /**
     *  问题：如何校验所传参数是合法参数  在时间
     *
     * */
    public int[] foundCountOneNum(int[] numArray) {

        if (numArray == null || numArray.length % 2 != 0) {
            return null;
        }
        //找都出现一的位置
        int splitNum = foundOneIndex(numArray);

        if(splitNum < 0) {
            throw  new RuntimeException("非法参数");
        }

        int[] result = new int[]{0, 0};
        for (int i : numArray) {
            if((splitNum & i ) == 1) {
                result[1] ^= i;
            }else {
                result[0] ^= i;
            }
        }

        //如何进行校验
        boolean[] resultCheck = new boolean[]{false,false};
        for (int i : numArray) {
            if((splitNum & i ) == 1 && i == result[1]) {
                resultCheck[1] = true;
            }else if ((splitNum & i ) == 0 && i == result[0]){
                resultCheck[0] = true;
            }
        }

        if(resultCheck[0] && resultCheck[1]) {
            return result;
        }
        throw  new RuntimeException("非法参数");
    }

    private int foundOneIndex(int[] numArray) {

        int temp = 0;

        for (int i : numArray) {
            temp ^= i;
        }

        if(temp == 0) {
            return -1;
        }

        int result = 1;
        while ((result & temp) != 1) {
            result <<= 1;
        }

        return result;
    }


}
