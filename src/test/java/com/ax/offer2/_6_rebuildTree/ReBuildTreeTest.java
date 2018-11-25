package com.ax.offer2._6_rebuildTree;


import org.junit.Test;

public class ReBuildTreeTest {

    @Test
    public void  reBuildTree() {

        ReBuildTree reBuildTree = new ReBuildTree();

        LinkedNode linkedNode = reBuildTree.reBuildTree(new int[]{1,2,4,7,3,5,6,8}, new int[]{4,7,2,1,5,3,8,6});

        System.out.println(linkedNode);

    }


}
