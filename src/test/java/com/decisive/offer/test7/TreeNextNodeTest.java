package com.decisive.offer.test7;


import com.decisive.common.TreeLinkedNode;
import org.junit.Assert;
import org.junit.Test;

public class TreeNextNodeTest {

    @Test
    public void test() {
        TreeNextNode tnn = new TreeNextNode();

        TreeLinkedNode root1 = new TreeLinkedNode(1);
        TreeLinkedNode root2 = new TreeLinkedNode(2);
        TreeLinkedNode root3 = new TreeLinkedNode(3);
        TreeLinkedNode root4 = new TreeLinkedNode(4);
        TreeLinkedNode root5 = new TreeLinkedNode(5);
        TreeLinkedNode root6 = new TreeLinkedNode(6);
        TreeLinkedNode root7 = new TreeLinkedNode(7);
        TreeLinkedNode root8 = new TreeLinkedNode(8);
        root1.setLeftNode(root2);
        root1.setRightNode(root3);
        root2.setFatherNode(root1);
        root3.setFatherNode(root1);
        root2.setLeftNode(root4);
        root2.setRightNode(root5);
        root4.setFatherNode(root2);
        root5.setFatherNode(root2);
        root3.setRightNode(root6);
        root6.setFatherNode(root3);
        root5.setLeftNode(root7);
        root5.setRightNode(root8);
        root7.setFatherNode(root5);
        root8.setFatherNode(root5);
        TreeLinkedNode nextNode = tnn.findNextNode(root1, root7);

        Assert.assertEquals(5,nextNode.getData());
    }


}
