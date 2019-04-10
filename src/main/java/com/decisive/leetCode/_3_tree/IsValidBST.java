package com.decisive.leetCode._3_tree;

public class IsValidBST {
    private int MIN = Integer.MIN_VALUE;
    private int MAX = Integer.MAX_VALUE;

    public boolean isValidBST(TreeNode root) {
        //第一次尝试：问题一： 如果保证
        //第二次尝试： 中序遍历，  记录左子树最大值， 记录右子树最小值
        if (root == null) return true;
        boolean result = isValidBST(root.left);
        if (result && (MAX < root.val)) {
            result = true;
        } else {
            return false;
        }
        result = isValidBST(root.left);
        if (result && (MIN > root.val))
            return result;

        MIN = (MIN == Integer.MIN_VALUE) || MIN > root.left.val ? MIN = root.left.val : MIN;
        MAX = (MAX == Integer.MAX_VALUE) || MAX < root.right.val ? MAX = root.right.val : MAX;
        return false;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        System.out.println(val);
        if (left != null) {
            left.toString();
        }
        if (right != null) {
            right.toString();
        }
        return null;
    }
}