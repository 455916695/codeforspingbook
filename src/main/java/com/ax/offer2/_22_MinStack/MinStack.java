package com.ax.offer2._22_MinStack;

/**
 *  具有min函数的栈
 *          即可以有提供获栈中最小值的栈
 *          O（1）
 * */
public class MinStack {
    private class  Node {
        private int data;
        private Node next;

        public Node() {
        }
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    Node dataNode;
    Node minNode;

    public  void push(int value) {
        Node data = new Node(value,dataNode);
        dataNode = data;
        if(minNode == null || minNode.getData() > value) {
            Node min = new Node(value,minNode);
            minNode = min;
        }else {
            Node min = new Node(min(),minNode);
            minNode = min;
        }
    }

    public int pop() throws RuntimeException {
        if(dataNode == null) {
            throw  new RuntimeException("越界");
        }
        Node temp = dataNode;
        dataNode = dataNode.getNext();
        minNode = minNode.getNext();
        return temp.getData();
    }

    public  int min() throws RuntimeException{
        if(minNode == null) {
            throw  new RuntimeException("栈中无数据");
        }
        return minNode.getData();
    }

}
