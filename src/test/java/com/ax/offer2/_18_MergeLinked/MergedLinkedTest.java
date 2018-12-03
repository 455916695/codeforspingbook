package com.ax.offer2._18_MergeLinked;


import com.ax.offer2._17_ReverseLinked.LinkedNode;
import org.junit.Assert;
import org.junit.Test;

public class MergedLinkedTest {

    @Test
    public void test() {
        LinkedNode leftNode = null;
        LinkedNode rightNode = null;
        MergedLinked mergedLinked = new MergedLinked();
        LinkedNode linkedNode = mergedLinked.mergedLinked(leftNode, rightNode);
        Assert.assertNull(linkedNode);

        rightNode = new LinkedNode();
        linkedNode = mergedLinked.mergedLinked(leftNode,rightNode);
        Assert.assertEquals(rightNode,linkedNode);

        leftNode = new LinkedNode();
        rightNode = null;
        linkedNode = mergedLinked.mergedLinked(leftNode,rightNode);
        Assert.assertEquals(leftNode,linkedNode);

        leftNode = new LinkedNode();
        rightNode = new LinkedNode();
        linkedNode = mergedLinked.mergedLinked(leftNode,rightNode);
        printLinked(linkedNode);

        leftNode = new LinkedNode(1,new LinkedNode(3,new LinkedNode(5,new LinkedNode(7,null))));
        rightNode = new LinkedNode(1,new LinkedNode(2,new LinkedNode(4,new LinkedNode(6,null))));
        linkedNode = mergedLinked.mergedLinked(leftNode,rightNode);
        printLinked(linkedNode);

        leftNode = new LinkedNode(1,new LinkedNode(3,new LinkedNode(5,new LinkedNode(7,null))));
        rightNode = new LinkedNode(1,null);
        linkedNode = mergedLinked.mergedLinked(leftNode,rightNode);
        printLinked(linkedNode);


    }

    private void printLinked(LinkedNode linkedNode) {
        while (linkedNode != null){
            System.out.println(linkedNode.getValue());
            linkedNode = linkedNode.getNext();
        }
    }


}
