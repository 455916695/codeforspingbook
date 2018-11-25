package com.ax.offer2._6_rebuildTree;

public class LinkedNode {

     private  int value ;

     private LinkedNode  leftNext;

     private LinkedNode rightNext;

    public LinkedNode() {
    }

    public LinkedNode(int value, LinkedNode leftNext, LinkedNode rightNext) {
        this.value = value;
        this.leftNext = leftNext;
        this.rightNext = rightNext;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedNode getLeftNext() {
        return leftNext;
    }

    public void setLeftNext(LinkedNode leftNext) {
        this.leftNext = leftNext;
    }

    public LinkedNode getRightNext() {
        return rightNext;
    }

    public void setRightNext(LinkedNode rightNext) {
        this.rightNext = rightNext;
    }
}
