package com.ax.offer2._19_SubstructureQuery;

/**
 * 输入两个棵树 A 、 B ，判断 B是否是 A的子结构
 */
public class TreeSubstructureQuery {

    /**
     * 情况一: treeA 、treeB 为null的情况
     * 情况二：正常情况
     */
    public boolean isSubstructur(TwoTree treeA, TwoTree treeB) {

        if (treeB == null)
            return true;

        if (treeA == null)
            return false;
        /**
         * 分析：
         *      第一: treeA 中是否存在节点与 treeB的节点相同
         *           若不相同，递归遍历寻找treeA中与treeB 根节点相同的节点,
         *           若相同，
         *      第二：递归判断treeA 的左右节点与 treeB 的左右节点是否相同
         * */
        boolean result = false;

        if (treeA.getValue() == treeB.getValue())  // 说明符合根节点
            result = hasTwoSub(treeA, treeB);  //判断两者子节点是否也相等

        if (!result)
            result = isSubstructur(treeA.getLeftTree(), treeB);

        if (!result)
            result = isSubstructur(treeA.getRightTree(), treeB);

        return result;
    }

    //  判断两者子节点是否相等
    private boolean hasTwoSub(TwoTree treeA, TwoTree treeB) {
        /**
         *  分析:
         *      第一步:分析treeB 是否到底，到底就返回true
         *      第二步:若treeB 没有到底，再判断 treeA 是否到底,若到底返回false
         *      第三步:若两者都没有到底，就判断两者是否相等，若不等返回false
         *      第四步:若两者相等，就递归调用方法继续判断 两者的 左右子节点是否相等
         *
         * */
        if (treeB == null)
            return true;
        if (treeA == null)
            return false;

        if (treeA.getValue() != treeB.getValue()) {
            return false;
        }

        return hasTwoSub(treeA.getRightTree(), treeB.getRightTree()) && hasTwoSub(treeA.getLeftTree(), treeB.getLeftTree());
    }

}
