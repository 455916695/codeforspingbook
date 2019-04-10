package com.decisive.offer.test21;


import com.decisive.common.LinkedNode;
import org.junit.Before;
import org.junit.Test;

public class DeleteRepetitionLinkedNodeTest {

    LinkedNode root = null;

    @Before
    public void testBefore() {
        root = new LinkedNode(1);
        LinkedNode target1 = new LinkedNode(1);
        root.setNext(target1);
        LinkedNode target2 = new LinkedNode(2);
        target1.setNext(target2);
        LinkedNode target3 = new LinkedNode(3);
        target2.setNext(target3);
        LinkedNode target4 = new LinkedNode(3);
        target3.setNext(target4);
        LinkedNode target5 = new LinkedNode(4);
        target4.setNext(target5);
        LinkedNode target6 = new LinkedNode(5);
        target5.setNext(target6);
        LinkedNode target7 = new LinkedNode(5);
        target6.setNext(target7);

    }

    @Test
    public void test() {

        DeleteRepetitionLinkedNode drln = new DeleteRepetitionLinkedNode();

        LinkedNode delete = drln.delete(root);

        delete.print();


    }


}
