package com.ax.offer2._26_TreePathSum;

import org.junit.Test;

public class TreePathSumTest {

    @Test
    public  void  test() {

        TreePathSum treePathSum = new TreePathSum();
        treePathSum.treePathSum(null,0);

        treePathSum.treePathSum(new TwoTree(1,null,null),1);

        treePathSum.treePathSum(new TwoTree(10,new TwoTree(5,new TwoTree(4,null,null),new TwoTree(7,null,null)),new TwoTree(12,null,null)),220);


    }

}
