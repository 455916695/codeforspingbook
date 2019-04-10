package com.decisive.common;

public class LinkedNode {

    private int data;
    private LinkedNode next;

    public LinkedNode() {
    }

    public LinkedNode(int data) {
        this.data = data;
    }

    public LinkedNode(LinkedNode next) {
        this.next = next;
    }

    public LinkedNode(int data, LinkedNode next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }


    public void print() {
        System.out.println(data);
        LinkedNode temp = next;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}
