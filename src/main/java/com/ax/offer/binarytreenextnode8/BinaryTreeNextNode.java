package com.ax.offer.binarytreenextnode8;

/**
 *  二叉树的下一个结点
 *      题目描述
            给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
            注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * */
public class BinaryTreeNextNode {

    public TreeLinkNode getNext (TreeLinkNode pNode){

        // 判断该节点的右节点是否为null
        if(pNode.right != null) {
            //如果不为空，就找到该节点的最左字子节点
            TreeLinkNode node = pNode.right;
            while (node.left != null)
                node = node.left;
            return node;
        }else {
            //就是该节点的右节点为null  的情况
            while (pNode.next != null){
                TreeLinkNode parent = pNode.next;
                if(parent.left == pNode)
                    return  parent;
                pNode = pNode.next;
            }
        }

        return  null;

    }


}
