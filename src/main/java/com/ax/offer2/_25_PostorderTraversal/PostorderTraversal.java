package com.ax.offer2._25_PostorderTraversal;

/**
 * 二叉搜索树的后序遍历序列
 * 输入一个序列，判断其是否是某一个二叉搜索树的后序遍历序列
 * 序列中不存在重复的数据
 */
public class PostorderTraversal {
        /**
         *  特点：比根节点小的连续排列   A，并在前面
         *        比根节点大的连续排列   B，在A后面，并在根节点前面
         * */

        /**
         *  情况一:参数为null
         *  情况二：参数不符合特点
         *  情况三：参数符合特点，但单调递增
         *  情况四：参数符合特点，非单调递增
         * */
    public static  boolean isPostorder(int[] numArray) {

        if(numArray == null) {
            throw  new RuntimeException("非法参数");
        }

        boolean result = isPostorder(numArray, 0, numArray.length - 1);
        return result;

    }

    private static boolean isPostorder(int[] numArray, int low, int hight) {

        if (low >= hight) {
            return true;
        }

        int count = low;
        while (numArray[hight] > numArray[count]) {
            count++;
        }

        for (int i = count; i < hight; i++) {
            if (numArray[i] < numArray[hight]) {
                return false;
            }
        }

        return isPostorder(numArray, low, count>=hight ? hight -1:count) & isPostorder(numArray, count + 1, hight - 1);
    }


}
