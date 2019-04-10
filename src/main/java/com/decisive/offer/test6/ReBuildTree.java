package com.decisive.offer.test6;

import com.decisive.common.TreeNode;

import java.util.HashMap;

/**
 * 重建二叉树
 * 根据二叉树的前序遍历和中序遍历的结果，重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。（如果含有重复的数据，确实不太好计算）
 * preorder = [3,9,20,15,7]             // 前序遍历
 * inorder  = [9,3,15,20,7]             //  通过前序遍历与中序遍历的结果，与规律构建出 二叉树
 *                                           不断划分成子数组，并创建出相应的节点，递归
 */
public class ReBuildTree {

    /**
     * 递归的方式 ，重构二叉树
     */
    public TreeNode reBuildTree(int[] preorder, int[] inorder) {
        //判断参数是否合法
        //判断是否为null //判断是否长度不一样 //判断内容是否不一样
        if (preorder == null || inorder == null || preorder.length != inorder.length) return null;
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i],i);
        }
        TreeNode treeNode = reBuildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1,indexMap);
        return treeNode;
    }

    private TreeNode reBuildTree(int[] preorder, int pL, int pR, int[] inorder, int iL, int iR, HashMap<Integer, Integer> indexMap) {
        if (pL > pR) {
            return null;
        }
        TreeNode treeNode = new TreeNode(preorder[pL]);
        //找到preorder 中的第 pL 个数据，  在 inorder 中排第几
        Integer index = indexMap.get(preorder[pL]);  //找到了在 inorder中排第几的序号
        TreeNode treeLeft = reBuildTree(preorder,pL+1,pL+index-iL,inorder,iL,index-1,indexMap);  //具体实现细节
        TreeNode treeRight = reBuildTree(preorder,pL+index-iL+1,pR,inorder,index+1,iL,indexMap);

        treeNode.setLeftChild(treeLeft);
        treeNode.setRightChild(treeRight);

        return treeNode;
    }

}
