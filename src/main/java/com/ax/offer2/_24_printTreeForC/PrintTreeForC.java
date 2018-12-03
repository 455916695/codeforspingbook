package com.ax.offer2._24_printTreeForC;

import java.util.ArrayList;

/**
 * 从上到下打印二叉树；
 * 一层一层的打印二叉树
 */
public class PrintTreeForC {

    /**
     * 情况一： 参数为null
     * 情况二：正常
     */
    public void printTree(TwoTree treeNode) {

        if (treeNode == null) {
            return;
        }
        ArrayList<TwoTree> treeList = new ArrayList<>();
        treeList.add(treeNode);
        while (!treeList.isEmpty()) {
            TwoTree twoTree = treeList.get(0);
            treeList.remove(0);

            operation(twoTree);

            if (twoTree.getLeftTree() != null) {
                treeList.add(twoTree.getLeftTree());
            }
            if (twoTree.getRightTree() != null) {
                treeList.add(twoTree.getRightTree());
            }
        }

    }

    private void operation(TwoTree twoTree) {
        System.out.println(twoTree.getValue());
    }


}
