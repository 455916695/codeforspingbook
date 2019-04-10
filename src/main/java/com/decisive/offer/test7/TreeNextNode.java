package com.decisive.offer.test7;

import com.decisive.common.TreeLinkedNode;

/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * <p>
 * 前提: 一定还可以遍历下一个节点
 */
public class TreeNextNode {   //分析中序遍历方式，以及分析当前节点可能所存在的位置，从而编写代码

    /**
     * 情况一: 指定节点存在右节点  (寻找右的左)
     * 情况二：指定节点不存在右节点，且为该节点父节点的左子节点 （该遍历中了）
     * 情况三：指定节点不存在右节点，且为该节点父节点的右子节点  ( 说明左子树遍历完毕)
     */
    public TreeLinkedNode findNextNode(TreeLinkedNode root, TreeLinkedNode unKnowNode) {

        //非法参数判断， 理论上还得判断 unKnowNode 是否是root 中的某一节点
        if (unKnowNode == null || root == null) {
            return null;
        }
        //如果该节点存在右节点
        TreeLinkedNode rightNode = unKnowNode.getRightNode();
        if (rightNode != null) {
            //存在
            TreeLinkedNode tempNode = rightNode;
            //寻找其右节点的左节点
            while (tempNode.getLeftNode() != null) {
                tempNode = tempNode.getLeftNode();
            }
            return tempNode;
        }
        // 不存在
        //判断该节点是否是其父节点的左节点
        TreeLinkedNode fatherNode = unKnowNode.getFatherNode();
        if (fatherNode.getLeftNode() == unKnowNode) {
            //是左节点
            return fatherNode;
        }
        //是右节点
        while (fatherNode.getFatherNode() != null) {
            fatherNode = fatherNode.getFatherNode();
        }
        return fatherNode;
    }
}
