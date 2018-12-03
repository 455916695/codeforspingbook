package com.ax.offer2._17_ReverseLinked;


import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedTest {

    @Test
    public void test() {

        ReverseLinked reverseLinked = new ReverseLinked();

        LinkedNode linkedNode = reverseLinked.reverseLinked(null);
        Assert.assertNull(linkedNode);
        linkedNode = reverseLinked.reverseLinked(new LinkedNode(1,null));
        Assert.assertEquals(1,linkedNode.getValue());

        linkedNode = reverseLinked.reverseLinked(new LinkedNode(1,new LinkedNode(2,new LinkedNode(3,new LinkedNode(4,new LinkedNode(5,new LinkedNode(6,null ) ) ) ) )));

        while (linkedNode != null){
            System.out.println(linkedNode.getValue());
            linkedNode = linkedNode.getNext();
        }

    }


}
