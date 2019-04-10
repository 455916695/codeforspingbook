package com.decisive.leetCode._3_tree;

import com.decisive.leetCode._2_math.RomanToInt;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 查询二叉搜索树中  第k个最小值
 */
public class KthSmallest {
    List<Integer> result = null;

    int resultInteger = 0;
    int flag = 0;

    /**
     * 查询二叉搜索树中，第k个最小值
     */
    public int kthSmallest(TreeNode root, int k) {
        //二叉搜索树的特点： 左边都比根节点小  右边都比根节点大
        //对二叉搜索树进行 中序遍历

        //判断参数是否合法
        if (root == null || k < 0) {
            return -1;
        }
//        result = new ArrayList();
        //中序遍历二叉树
//        kthSmallest(root, result);
//        return result.get(k - 1);
        flag = k;
        kthSmallestD(root);
        return resultInteger;
    }

    private void kthSmallestD(TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                kthSmallestD(root.left);
            }
            if (flag == 0) {
                return;
            } else if (flag > 1) {
                flag -= 1;
            } else if (flag == 1) {
                resultInteger = root.val;
                flag = 0;
                return;
            }

            if (root.right != null) {
                kthSmallestD(root.right);
            }
        }
    }

    private void kthSmallest(TreeNode root, List<Integer> result) {
        if (root != null) {
            if (root.left != null) {
                kthSmallest(root.left, result);
            }
            result.add(root.val);
            if (root.right != null) {
                kthSmallest(root.right, result);
            }
        }
    }


    @Test
    public void test_kthSmallest() {
        TreeNode root = new TreeNode(5);
        TreeNode root_3 = new TreeNode(3);
        TreeNode root_6 = new TreeNode(6);
        TreeNode root_2 = new TreeNode(2);
        TreeNode root_4 = new TreeNode(4);
        TreeNode root_1 = new TreeNode(1);

        root.left = root_3;
        root.right = root_6;

        root_3.left = root_2;
        root_3.right = root_4;

        root_2.left = root_1;

        List<Integer> result = new ArrayList(6);
        kthSmallest(root, result);
        print(result);

        int i = kthSmallest(root, 1);

        System.out.println(i);
        Assert.assertEquals(1, i);
    }

    @Test
    public void test_kthSmallestD() {
        TreeNode root = new TreeNode(5);
        TreeNode root_3 = new TreeNode(3);
        TreeNode root_6 = new TreeNode(6);
        TreeNode root_2 = new TreeNode(2);
        TreeNode root_4 = new TreeNode(4);
        TreeNode root_1 = new TreeNode(1);

        root.left = root_3;
        root.right = root_6;

        root_3.left = root_2;
        root_3.right = root_4;

        root_2.left = root_1;

        flag = 2;
        kthSmallestD(root);

        System.out.println(resultInteger);
        Assert.assertEquals(resultInteger, 1);
    }


    private void print(List<Integer> list) {
        if (list != null) {
            for (Integer integer : list) {
                System.out.println(integer);
            }
        } else {
            System.out.println("指定列表为null");
        }

    }

}
