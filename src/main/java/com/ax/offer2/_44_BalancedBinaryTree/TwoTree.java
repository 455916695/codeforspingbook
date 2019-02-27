package com.ax.offer2._44_BalancedBinaryTree;


public class TwoTree {

    private int value;
    private TwoTree leftTree;
    private TwoTree rightTree;

    public TwoTree() {
    }

    public TwoTree(int value, TwoTree leftTree, TwoTree rightTree) {
        this.value = value;
        this.leftTree = leftTree;
        this.rightTree = rightTree;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TwoTree getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(TwoTree leftTree) {
        this.leftTree = leftTree;
    }

    public TwoTree getRightTree() {
        return rightTree;
    }

    public void setRightTree(TwoTree rightTree) {
        this.rightTree = rightTree;
    }
}
