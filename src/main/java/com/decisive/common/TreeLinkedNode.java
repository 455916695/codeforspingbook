package com.decisive.common;

/**
 *  二叉树：包含父节点
 * */
public class TreeLinkedNode {

    private int data;
    private  TreeLinkedNode leftNode;
    private  TreeLinkedNode rightNode;
    private  TreeLinkedNode fatherNode;

    public TreeLinkedNode() {
    }

    public TreeLinkedNode(int data) {
        this.data = data;
    }

    public TreeLinkedNode(int data, TreeLinkedNode leftNode, TreeLinkedNode rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public TreeLinkedNode(int data, TreeLinkedNode leftNode, TreeLinkedNode rightNode, TreeLinkedNode fatherNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.fatherNode = fatherNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeLinkedNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeLinkedNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeLinkedNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeLinkedNode rightNode) {
        this.rightNode = rightNode;
    }

    public TreeLinkedNode getFatherNode() {
        return fatherNode;
    }

    public void setFatherNode(TreeLinkedNode fatherNode) {
        this.fatherNode = fatherNode;
    }
}
