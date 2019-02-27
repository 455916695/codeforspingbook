package com.ax.offer2._44_BalancedBinaryTree;

import org.junit.Assert;
import org.junit.Test;

public class BalancedBinaryTreeTest {

    @Test
    public void test(){

        BalancedBinaryTree bbt = new BalancedBinaryTree();
        boolean balanced = bbt.isBalanced(null);
        Assert.assertTrue(balanced);

        balanced = bbt.isBalanced(new TwoTree(1,new TwoTree(),new TwoTree()));
        Assert.assertTrue(balanced);

        balanced = bbt.isBalanced(new TwoTree(1,new TwoTree(2,new  TwoTree(3,new TwoTree(),null),null),new TwoTree()));
        Assert.assertFalse(balanced);

    }



}
