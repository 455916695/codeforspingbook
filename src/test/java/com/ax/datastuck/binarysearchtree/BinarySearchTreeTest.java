package com.ax.datastuck.binarysearchtree;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {


    @Test
    public void findNullTest() {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.setRoot(null);

        BinarySearchTree.Node nodeForKey = binarySearchTree.findNodeForKey(1);

        assertNull(nodeForKey);

    }

    @Test
    public  void putTest() {
        long l1 = System.currentTimeMillis();
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.put(6,"Hello 6");
        binarySearchTree.put(2,"Hello 2");
        binarySearchTree.put(3,"Hello 3");
        binarySearchTree.put(4,"Hello 4");
        binarySearchTree.put(6,"Hello 6");
        binarySearchTree.put(2,"Hello 2");
        binarySearchTree.put(3,"Hello 3");
        binarySearchTree.put(4,"Hello 4");
        binarySearchTree.put(6,"Hello 6");
        binarySearchTree.put(2,"Hello 2");
        binarySearchTree.put(3,"Hello 3");
        binarySearchTree.put(4,"Hello 4");
        binarySearchTree.put(6,"Hello 6");
        binarySearchTree.put(2,"Hello 2");
        binarySearchTree.put(3,"Hello 3");
        binarySearchTree.put(4,"Hello 4");

        int number = binarySearchTree.getRoot().getNumber();
        long l2 = System.currentTimeMillis();
        System.out.println(l2 -l1);
        Assert.assertEquals(4,number);
    }

    @Test
    public  void put2Test() {
        long l1 = System.currentTimeMillis();
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.put(6,"Hello 6");
        binarySearchTree.put(2,"Hello 2");
        binarySearchTree.put(3,"Hello 3");
        binarySearchTree.put(4,"Hello 4");
        binarySearchTree.put(6,"Hello 6");
        binarySearchTree.put(2,"Hello 2");
        binarySearchTree.put(3,"Hello 3");
        binarySearchTree.put(4,"Hello 4");
        binarySearchTree.put(6,"Hello 6");
        binarySearchTree.put(2,"Hello 2");
        binarySearchTree.put(3,"Hello 3");
        binarySearchTree.put(4,"Hello 4");
        binarySearchTree.put(6,"Hello 6");
        binarySearchTree.put(2,"Hello 2");
        binarySearchTree.put(3,"Hello 3");
        binarySearchTree.put(4,"Hello 4");

        int number = binarySearchTree.getRoot().getNumber();
        long l2 = System.currentTimeMillis();
        System.out.println(l2 -l1);
        Assert.assertEquals(4,number);
    }

    @Test
    public void findNodeForKeyTest() {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.put(6,"Hello 6");
        binarySearchTree.put(2,"Hello 2");
        binarySearchTree.put(3,"Hello 3");
        binarySearchTree.put(4,"Hello 4");
        binarySearchTree.put(6,"Hello 6");
        binarySearchTree.put(2,"Hello 2");
        binarySearchTree.put(3,"Hello 3");
        binarySearchTree.put(4,"Hello 4");
        binarySearchTree.put(6,"Hello 6");
        binarySearchTree.put(2,"Hello 2");
        binarySearchTree.put(3,"Hello 3");
        binarySearchTree.put(4,"Hello 4");
        binarySearchTree.put(6,"Hello 6");
        binarySearchTree.put(2,"Hello 2");
        binarySearchTree.put(3,"Hello 3");
        binarySearchTree.put(4,"Hello 4");

        BinarySearchTree.Node nodeForKey = binarySearchTree.findNodeForKey(3);

        Assert.assertEquals("Hello 3",nodeForKey.getValue());
    }

}
