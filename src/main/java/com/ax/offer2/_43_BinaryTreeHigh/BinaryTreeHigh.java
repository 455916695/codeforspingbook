package com.ax.offer2._43_BinaryTreeHigh;

/**
 * 二叉树的深度
 * 输入一颗二叉树的根节点，求该树的深度。
 * 从根节点到叶节点一次经过的结点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度
 */
public class BinaryTreeHigh {

    /**
     * 情况一：null
     * 情况二：不为null，但没有child节点
     * 情况三：具有child节点
     */
    public int foundTreeHigh(TwoTree root) {
        if (root == null) {
            return 0;
        }

        int leftHigh = foundTreeHigh(root.getLeftTree());
        int rightHigh = foundTreeHigh(root.getRightTree());

        return leftHigh > rightHigh ? leftHigh + 1 : rightHigh + 1;
    }

}
