package com.ax.offer2._44_BalancedBinaryTree;

import javafx.scene.transform.Rotate;

/**
 * 平衡二叉树
 * 输入一颗二叉树的根节点，判断该树是不是平衡二叉树。
 * 如果某二叉树中任意节点的左右子树的深度相差不超过1,那么它就是一颗平衡二叉树
 */
public class BalancedBinaryTree {

    /**
     * 后序遍历二叉树，由叶到根的进行遍历
     */

    public boolean isBalanced(TwoTree root) {

        if (root == null) {
            return true;
        }
        int[] num = new int[]{0};
        return isBalanced(root, num);
    }

    /**
     * 后序遍历二叉树
     */
    private boolean isBalanced(TwoTree root, int[] num) {
        if (root == null) {
            num[0] = 0;
            return true;
        }
        int[] lNum = new int[]{0};
        int[] rNum = new int[]{0};
        if (isBalanced(root.getLeftTree(), lNum) && isBalanced(root.getRightTree(), rNum)) {
            int del = lNum[0] - rNum[0];
            if (del >= -1 && del <= 1) {
                num[0] = (del >= 0) ? lNum[0] + 1 : rNum[0] + 1;
                return true;
            }
        }
        return false;
    }

}
