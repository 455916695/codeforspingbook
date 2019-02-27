package com.ax.offer2._31_CountArray;

/**
 * 找到数组出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如：输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2
 */
public class CountArray {

    /**
     *  分析：
     *        一：从位置的角度分析
     *             数组中出现次数超过一半的数字，那么如果数组是排好序的，中间的数字一定是出现次数超过一半的数字
     *              以最快的速度找到中间的数字，快速排序的方式可以提供参考，如果找到的数字的下标 属于  n/2 ,就返回这个结果
     *
     *        二：从数量的角度分析
     *              循环遍历数组，使用两个变量统计，一个变量记录统计的数据一个变量统计次数
     *              如果遍历的数据与记录的数据相同  次数+1
     *              不同 次数就减一
     *              如果次数为0，就记录下一次出现的数字
     *            由于改变量出现的次数其他所有数据出现的次数所以，最后统计的数据就是我们要找的数据
     *
     *        三：从数据校验的角度分析
     *              1.使用HashMap   记录每种数据出现的次数
     *              2.找到出现次数最多的数据，如果其出现次数没有超过一半说明，参数数组非法
     * */

    /**
     * 分析：
     * 情况一：null
     * 情况二:数组不符合条件    //上述两个方法都很难完成数组的校验
     */
    public int findNum(int[] numArray) {  //返回出现的索引

        if (numArray == null) {
            throw new RuntimeException("非法参数，数组不可为null");
        }

        int length = numArray.length - 1;
        int midden = length >> 1;
        int index = Partition.partition(numArray, 0, length, length); //使用partition方法找寻中间值

        while (index != midden) {
            if (index > midden) {
                index = Partition.partition(numArray, 0, index - 1, length);
            } else {
                index = Partition.partition(numArray, index + 1, length, length);
            }
        }

        //校验
        boolean flag = checkNum(numArray, index);
        if (!flag) {
            throw new RuntimeException("非法参数，参数数组不符合条件");
        }
        return index;
    }

    private boolean checkNum(int[] numArray, int index) {
        int num = numArray[index];
        int count = 0;
        for (int i : numArray) {
            if (num == i) {
                count++;
            }
        }
        if ((numArray.length >> 1) <= count) {
            return true;
        }
        return false;
    }



    private void change(int[] numArray, int low, int target) {
        int temp = numArray[low];

        numArray[low] = numArray[target];

        numArray[target] = temp;

    }


    //方法二：统计方式
    public int countNum(int[] numArray) {
        if (numArray == null || numArray.length < 1) {
            throw new RuntimeException("非法参数,数组不能为null");
        }

        int num = numArray[0];
        int count = 1;
        for (int i : numArray) {
            if (num != i) {
                if (count > 0) {
                    count--;
                } else {
                    num = i;
                    count = 1;
                }
            } else {
                count++;
            }
        }

        if (count > 1 && check(numArray, num)) {
            return num;
        }

        throw new RuntimeException("非法参数数组，不符合要求");
    }

    private boolean check(int[] numArray, int num) {

        int count = 0;
        for (int i : numArray) {
            if (i == num) {
                count++;
            }
        }

        if (count >= (numArray.length >> 1)) {
            return true;
        }
        return false;

    }


}
