package com.ax.offer2._27_CopyComplexLinked;

public class ComplexLinked {

    private int value;

    private  ComplexLinked next;
    private  ComplexLinked sibling;

    public ComplexLinked() {
    }

    public ComplexLinked(int value, ComplexLinked next, ComplexLinked sibling) {
        this.value = value;
        this.next = next;
        this.sibling = sibling;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ComplexLinked getNext() {
        return next;
    }

    public void setNext(ComplexLinked next) {
        this.next = next;
    }

    public ComplexLinked getSibling() {
        return sibling;
    }

    public void setSibling(ComplexLinked sibling) {
        this.sibling = sibling;
    }
}
