package com.ax.offer2._14_deleteLinked;


import org.junit.Test;

public class DeleteNodeTest {

    @Test
    public  void testForNull() {
        DeleteNode deleteNode = new DeleteNode();
        try {
            deleteNode.deleteNode(null,null);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        try {
            deleteNode.deleteNode(null,new LinkedNode());
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        try {
            deleteNode.deleteNode(new LinkedNode(),null);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    @Test
    public void test() {

        LinkedNode root = new LinkedNode(1,null);
        LinkedNode linkedNode = DeleteNode.deleteNode(root, root);
        printLinked(linkedNode);

        System.out.println("------------------------------");

        LinkedNode deleteNode = new LinkedNode(2,null);
        try {
            linkedNode = DeleteNode.deleteNode(root,deleteNode);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("------------------------------");
        root.setNext(deleteNode);
        linkedNode = DeleteNode.deleteNode(root, deleteNode);
        printLinked(linkedNode);
        System.out.println("------------------------------");
        LinkedNode afterNode = new LinkedNode(3,null);
        deleteNode.setNext(afterNode);
        linkedNode = DeleteNode.deleteNode(root, deleteNode);
        printLinked(linkedNode);
    }

    private void printLinked(LinkedNode linkedNode) {
        while (linkedNode != null) {
            System.out.println(linkedNode.getValue());
            linkedNode = linkedNode.getNext();
        }
        System.out.println("打印结束");
    }


}
