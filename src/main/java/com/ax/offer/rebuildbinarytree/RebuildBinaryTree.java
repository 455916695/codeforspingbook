package com.ax.offer.rebuildbinarytree;

import java.util.HashMap;
import java.util.Map;

/**
 *  重建二叉树
 *      题目描述
 *
 *        根据二叉树的前序遍历和中序遍历的结果，重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 *       preorder = [3,9,20,15,7]
 *      inorder =  [9,3,15,20,7]
 *
 * */
public class RebuildBinaryTree {
// TODO 此题不会写
//     丝毫没有头绪
//    定义一个Map
    private Map<Integer,Integer>  indexOfInOrders = new HashMap<>();

    public TreeNode rebuildBinaryTree(Integer[] preorder,Integer[] inorder) {

//        循环遍历 中序数组，将 索引 与 值 封装在 Map 中
        for (int i=0;i< inorder.length;i++){
            indexOfInOrders.put(inorder[i],i);
        }

        return rebuildBinaryTree(preorder,0,preorder.length-1,0);
    }

    /**
     *  该方法没有太看懂
     * */
    private  TreeNode rebuildBinaryTree(Integer[] pre,int preL,int preR,int inL) {
        if(preL > preR)
            return  null;
        TreeNode root = new TreeNode(pre[preL]);   // 由于前序数组，是由树前序遍历得到的，所以，可以用同样的方式，恢复二叉树
        Integer inIndex = indexOfInOrders.get(root.val);  //从 Map 中拿到 根节点的索引值
        Integer leftTreeSize = inIndex - inL;                   //不是很清楚其意图
        root.left = rebuildBinaryTree(pre,preL+1,preL+leftTreeSize,inL); //递归 ，恢复左节点 //不是很清楚其意图
        root.right = rebuildBinaryTree(pre,preL+leftTreeSize+1,preR,inL+leftTreeSize+1); //递归，恢复右节点 //不是很清楚其意图
        return root;
    }

}
