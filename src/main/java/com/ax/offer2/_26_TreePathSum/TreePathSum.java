package com.ax.offer2._26_TreePathSum;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 二叉树中和为某一值的路径
 * 输入一颗二叉树和一个整数,打印出二叉树中节点值的和为输入整数的所有路径。从树的根结点开始往下一直到叶节点所经过的节点形成一条路径
 */
public class TreePathSum {

    /**
     *  特点：前序遍历树，记录每次经过的节点，每次从子节点回到父节点时，删除子节点在路径中的值
     * */
    /**
     * 情况一：参数为null
     * 情况二; 正常情况
     */
    public void treePathSum(TwoTree treeRoot, int num) {

        if (treeRoot == null) {
            return;
        }
        ArrayList<Integer> path = new ArrayList<>();
        printPathSum(treeRoot, num, path);

    }

    private void printPathSum(TwoTree treeRoot, int num, ArrayList<Integer> path) {

        path.add(treeRoot.getValue());

        if (treeRoot.getLeftTree() == null && treeRoot.getRightTree() == null)
            if (sum(path) == num)
                printPath(path);

        if (treeRoot.getLeftTree() != null)
            printPathSum(treeRoot.getLeftTree(), num, path);
        if (treeRoot.getRightTree() != null)
            printPathSum(treeRoot.getRightTree(), num, path);

        path.remove(path.size() - 1);

    }

    private void printPath(ArrayList<Integer> path) {
        if (path != null && path.size() > 0)
            for (Integer integer : path) {
                System.out.print(integer + "\t\t");
            }
        System.out.println(" ");
    }

    private int sum(ArrayList<Integer> path) {

        int sum = 0;
        if (path != null && path.size() > 0)
            for (Integer integer : path) {
                sum += integer;
            }

        return sum;
    }

}
