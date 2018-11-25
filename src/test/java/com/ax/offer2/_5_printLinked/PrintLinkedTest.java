package com.ax.offer2._5_printLinked;


import org.junit.Test;

public class PrintLinkedTest {

    @Test
    public void printLinkedTest() {

        LinkedNode linkedNode2 = new LinkedNode(3,null);
        LinkedNode linkedNode1 = new LinkedNode(2,linkedNode2);
        LinkedNode linkedNode = new LinkedNode(1,linkedNode1);

        PrintLinked printLinked = new PrintLinked();

        System.out.println("打印前：");
        LinkedNode temp =linkedNode;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }

        System.out.println("打印后：");
        printLinked.printLinked(linkedNode);


    }


}
