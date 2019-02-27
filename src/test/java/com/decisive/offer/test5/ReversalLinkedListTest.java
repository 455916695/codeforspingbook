package com.decisive.offer.test5;


import com.decisive.offer.common.LinkedNode;
import org.junit.Test;

import java.util.ArrayList;

public class ReversalLinkedListTest {

    @Test
    public void testStack() {

        ReversalLinkedList rll = new ReversalLinkedList();
        LinkedNode linkedNode = new LinkedNode(1, new LinkedNode(2, new LinkedNode(3, new LinkedNode(4))));
        for (Integer i : rll.reversalPrint(linkedNode)) {
            System.out.println(i);
        }
    }

    @Test
    public void testRecursion() {

        ReversalLinkedList rll = new ReversalLinkedList();
        LinkedNode linkedNode = new LinkedNode(1, new LinkedNode(2, new LinkedNode(3, new LinkedNode(4))));
        for (Integer i : rll.reversalPrint(linkedNode,new ArrayList<Integer>())) {
            System.out.println(i);
        }
    }


}
