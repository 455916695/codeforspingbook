package com.ax.offer2._41_LinkedPublicNode;


import org.junit.Assert;
import org.junit.Test;

public class LinkedPublicNodeTest {

    @Test
    public void testNull() {
        LinkedPublicNode lpn = new LinkedPublicNode();

        LinkedNode linkedNode = lpn.foundPublicNode(null, null);
        Assert.assertNull(linkedNode);

    }

    @Test
    public void test() {
        LinkedPublicNode lpn = new LinkedPublicNode();

        LinkedNode  node6 = new LinkedNode(6,null);
        LinkedNode  node5 = new LinkedNode(5,null);
        LinkedNode  node4 = new LinkedNode(4,null);
        LinkedNode  node3 = new LinkedNode(3,null);

        LinkedNode  node2 = new LinkedNode(2,null);
        LinkedNode  node1 = new LinkedNode(1,null);
        LinkedNode  node0 = new LinkedNode(0,null);

        node0.setNext(node1);
        node1.setNext(node3);

        node2.setNext(node3);

        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);

        LinkedNode linkedNode = lpn.foundPublicNode(node0, node2);
        Assert.assertEquals(3,linkedNode.getValue());

    }

}
