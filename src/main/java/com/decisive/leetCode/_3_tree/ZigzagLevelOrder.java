package com.decisive.leetCode._3_tree;

import org.junit.Test;

import java.util.*;

/**
 * 二叉树的锯齿形层次遍历
 * 给定一个二叉树，返回其节点值的锯齿形层次遍历。
 * （即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 */
public class ZigzagLevelOrder {
    //表示该方法已经被弃用
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //判断参数是否合法
        if (root == null) {
            return new ArrayList();
        }

        //设置标志位
        boolean flag = true;

        List<List<Integer>> result = new ArrayList();
        //层次遍历二叉树
        List<TreeNode> runList = new ArrayList();
        runList.add(root);
        while (runList != null && runList.size() > 0) {
            List<TreeNode> tempList = new ArrayList();
            List<Integer> tempResult = new ArrayList();
            Iterator<TreeNode> iterator = runList.iterator();

            while (iterator.hasNext()) {
                TreeNode next = iterator.next();
                //处理结果
                tempResult.add(next.val);
                if (next.left != null) {
                    tempList.add(next.left);
                }
                if (next.right != null) {
                    tempList.add(next.right);
                }
            }
            //此处还存在着对结果处理
            if (!flag) {
                //反转
                Collections.reverse(tempResult);
            }
            flag = !flag;

            runList = tempList;
            result.add(tempResult);
        }
        //记录结果
        //按标志位决定是否要反转结果
        //返回结果

        return result;
    }


    public void print(List<List<Integer>> lists) {

        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer);
            }
            System.out.println("");
        }


    }

    @Test
    public void test() {
        TreeNode treeNode = new TreeNode(0);
        TreeNode treeNode_1 = new TreeNode(1);
        TreeNode treeNode_2 = new TreeNode(2);
        TreeNode treeNode_3 = new TreeNode(3);
        TreeNode treeNode_4 = new TreeNode(4);
        TreeNode treeNode_5 = new TreeNode(5);
        TreeNode treeNode_6 = new TreeNode(6);
        TreeNode treeNode_7 = new TreeNode(7);

        treeNode.left = treeNode_1;
        treeNode.right = treeNode_2;

        treeNode_1.left = treeNode_3;
        treeNode_1.right = treeNode_4;

        treeNode_2.left = treeNode_5;
        treeNode_2.right = treeNode_6;

        treeNode_3.left = treeNode_7;


        ZigzagLevelOrder z = new ZigzagLevelOrder();
        List<List<Integer>> lists = z.zigzagLevelOrder(treeNode);
        print(lists);
    }

}
