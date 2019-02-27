package com.ax.offer2._51_straight;

/**
 * 判断扑克牌的顺子
 * 从扑克牌中随机抽取5张牌，判断是不会一个顺子，即这5张牌是不是连续的。
 * 2~10为数字本身，A为1，J为11，Q为12，K为13，而 大、小王可以看成任意数字
 */
public class Straight {


    /**
     * 是否是顺子的规则
     * 1.5张牌是连续的
     * 2.非大小王牌不允许出现重复
     * 3.大小王牌可以看成任意数字
     */

    public boolean isStraight() {
        int[] pk = new int[]{2, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        //1.随机抽取五张牌
        int[] pkArray = randomPK(pk);
        //2.对牌进行排序
        sort(pkArray);
        //2.对这五张牌进行统计
        int[] resultArr = statistics(pkArray);  //0 存放次数  1 存放缺了几张牌  2 存放是否出现非王牌重复
        //1.统计  王牌出现的次数
        //2.统计  统计与连续相比缺了几张牌
        //3.统计  是否出现非王牌重复
        //3.计算出是否是顺子
        boolean re = true;
        if (resultArr[2] == 1 || resultArr[0] < resultArr[1]) {
            re = false;
        }
        for (int p : pkArray) {
            System.out.print(p+" ");
        }
        return re;
    }

    public int[] statistics(int[] pkArray) {
        int[] resutl = new int[3];
        int index = 0;
        while (pkArray[index] == 0) {
            resutl[0] += 1;
            index += 1;
        }
        int temp = pkArray[index]; //第一个不为 0 的数
        for (index++; index < pkArray.length; index++) {
            if (temp == pkArray[index]) {
                resutl[2] = 1;
                return resutl;
            } else {
                resutl[1] += pkArray[index] - temp - 1;
                temp = pkArray[index];
            }
        }
        return resutl;
    }

    /**
     * 对扑克牌进行排序
     */
    public void sort(int[] pkArray) {  //这里使用计数排序
        int[] tj = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] fz = new int[pkArray.length];
        for (int i : pkArray) {
            tj[i] += 1;
        }
        for (int i = 1; i < tj.length; i++) {
            tj[i] = tj[i] + tj[i - 1];
        }
        for (int i : pkArray) {
            fz[tj[i] - 1] = i;
            tj[i]--;
        }
        for (int i = 0; i < fz.length; i++) {
            pkArray[i] = fz[i];
        }
    }

    /**
     * 随机抽取扑克牌
     */
    public int[] randomPK(int[] pk) {
        int[] pArray = new int[5];  //存放随机生成的五张 牌
        int index = 0;
        while (index <= 4) {  //注意此处的范围
            int p = (int) (Math.random() * pk.length);
            if (pk[p] > 1) {
                pk[p]--;
                pArray[index] = p;
                index++;
            }
        }
        return pArray;
    }


}
