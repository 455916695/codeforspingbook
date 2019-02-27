package com.ax.datastuck._1_tree;

import org.junit.Assert;
import org.junit.Test;

public class TwoCTreeTest {

    @Test
    public  void  twoCTreeTest() {
        TwoCTree twoCTree = new TwoCTree();


        twoCTree.insert(16);
        twoCTree.insert(1);
        twoCTree.insert(10);
        twoCTree.insert(11);
        twoCTree.insert(15);
        twoCTree.insert(12);
        twoCTree.insert(6);
        twoCTree.insert(198);
        twoCTree.insert(198);

    }

    @Test
    public  void  twoCTreeFindTest() {
        TwoCTree twoCTree = new TwoCTree();

        Node node = twoCTree.find(15);

        Assert.assertNull(node);


        twoCTree.insert(16);
        twoCTree.insert(1);
        twoCTree.insert(10);
        twoCTree.insert(11);
        twoCTree.insert(15);
        twoCTree.insert(12);
        twoCTree.insert(6);
        twoCTree.insert(198);
        twoCTree.insert(198);

        node = twoCTree.find(15);

        Assert.assertEquals(15,node.getData());
    }

}
