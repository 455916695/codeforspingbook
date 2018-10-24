package com.ax.offer.rebuildbinarytree;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RebuildBinaryTreeTest {


    @Test
    public void reBuildBinaryTreeTest() {
       Integer[] preorder = new Integer[] {3,9,20,15,7};
       Integer[] inorder = new   Integer[]{9,3,15,20,7};

        RebuildBinaryTree rebuildBinaryTree = new RebuildBinaryTree();
        TreeNode treeNode = rebuildBinaryTree.rebuildBinaryTree(preorder, inorder);

        Assert.assertNotNull(treeNode);
    }

}
