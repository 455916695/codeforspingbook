package com.decisive.offer.test6;


import com.decisive.common.TreeNode;
import org.junit.Test;

public class RebuildTreeTest {

    @Test
    public void test(){

        ReBuildTree rbt = new ReBuildTree();

        TreeNode treeNode = rbt.reBuildTree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7});

        int value = treeNode.getData();
    }

}
