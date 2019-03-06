package com.decisive.offer.test20;


import com.decisive.offer.common.LinkedNode;
import org.junit.Before;
import org.junit.Test;

public class DeleteLinkedListTest {
    LinkedNode root = null;
    LinkedNode target = null;

    @Before
    public void testBefore() {
        root = new LinkedNode(1);
        LinkedNode target1 = new LinkedNode(2);
        root.setNext(target1);
        LinkedNode target2 = new LinkedNode(3);
        target1.setNext(target2);
        LinkedNode target3 = new LinkedNode(4);
        target2.setNext(target3);
        LinkedNode target4 = new LinkedNode(5);
        target3.setNext(target4);
        LinkedNode target5 = new LinkedNode(6);
        target4.setNext(target5);
        target = target5;
    }

    @Test
    public void test() {

        DeleteLinkedList dll = new DeleteLinkedList();

        LinkedNode delete = dll.delete(root, target);
        LinkedNode temp = delete;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }


}
