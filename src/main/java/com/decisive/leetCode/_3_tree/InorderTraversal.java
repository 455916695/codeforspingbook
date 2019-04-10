package com.decisive.leetCode._3_tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 中序遍历二叉树
 * 给定一个二叉树，返回它的中序 遍历。
 */
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        //使用栈
        //判断参数是否合法
        List<Integer> result = new ArrayList();
        if (root == null) {
            return result;
        }
        //使用栈辅助实现先进后出
        LinkedList<TreeNode> stack = new LinkedList();

        while (root != null || !stack.isEmpty()) {  //此处存在细节需要处理
            if (root != null) { //遍历节点,如果遍历的节点不为null,将节点存放到 栈中，
                stack.push(root);
                root = root.left;
            } else {  //如果等于 null,弹出中间节点，（相当于回退一级）并将其值存放到集合中
                root = stack.pop();
                result.add(root.val);
                root = root.right;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        InorderTraversal it = new InorderTraversal();

        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNodeL1 = new TreeNode(2);
        TreeNode treeNodeL1L1 = new TreeNode(4);
        TreeNode treeNodeL1R1 = new TreeNode(5);
        TreeNode treeNodeR1 = new TreeNode(3);
        TreeNode treeNodeR1RL = new TreeNode(6);
        TreeNode treeNodeR1RR = new TreeNode(7);


        treeNode.left = treeNodeL1;
        treeNode.right = treeNodeR1;

        treeNodeL1.left = treeNodeL1L1;
        treeNodeL1.right = treeNodeL1R1;

        treeNodeR1.left = treeNodeR1RL;
        treeNodeR1.right = treeNodeR1RR;

        List<Integer> list = it.inorderTraversal(treeNode);

        print(list);
    }

    public static void print(List<Integer> list) {
        if (list != null)
            for (Integer integer : list) {
                System.out.println(integer);
            }

    }
}
