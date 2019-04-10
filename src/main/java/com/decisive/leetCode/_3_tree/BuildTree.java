package com.decisive.leetCode._3_tree;

import org.junit.Assert;
import org.junit.Test;

/**
 * 从前序与中序遍历序列构造二叉树
 * <p>
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 * <p>
 * 注意:
 * 你可以假设树中没有重复的元素。  //这条假设很重要
 * <p>
 * 例如，给出
 * <p>
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 */
public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) {
            return null;
        }
        int preLow = 0;
        int preHight = preorder.length - 1;
        int inoLow = 0;
        int inoHight = inorder.length - 1;

        TreeNode result = buildTree(preorder, inorder, preLow, preHight, inoLow, inoHight);

        return result;
    }

    /**
     * 递归实现结果
     */
    private TreeNode buildTree(int[] preorder, int[] inorder, int preLow, int preHight, int inoLow, int inoHight) {
        if (preLow > preHight || inoLow > inoHight) {
            return null;
        }

        //构建根节点
        TreeNode root = new TreeNode(preorder[preLow]);
        //寻找根节点，在中序遍历数组中的索引
        int index = findIndex(inorder, preorder[preLow], inoLow, inoHight);

        int leftLength = index - inoLow;
        //构建左子树
        TreeNode left = buildTree(preorder, inorder, preLow + 1, preLow + leftLength, inoLow, index - 1);
        //构建右子树
        TreeNode right = buildTree(preorder, inorder, preLow + leftLength + 1, preHight, index + 1, inoHight);
        //赋值
        root.left = left;
        root.right = right;
        //返回结果
        return root;
    }

    /**
     * 查询 vaule   在 inorder 中的索引
     */
    private int findIndex(int[] inorder, int vaule, int inoLow, int inoHight) {
        for (int j = inoLow; j <= inoHight; j++) {
            if (inorder[j] == vaule) {
                return j;
            }
        }
        return -1;
    }


    @Test
    public void test_findIndex() {
        int index = findIndex(new int[]{1, 2, 3}, 2, 0, 2);
        Assert.assertEquals(1, index);
    }


    @Test
    public void test_buildTree() {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        TreeNode treeNode = buildTree(preorder, inorder);

        treeNode.toString();
    }

}
