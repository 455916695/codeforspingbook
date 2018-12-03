package com.ax.offer2._17_ReverseLinked;

public class LinkedNode {

    private int value;
    private LinkedNode next;

    public LinkedNode() {
    }

    public LinkedNode(int value, LinkedNode next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }
}
