package com.ax.offer2._18_MergeLinked;

import com.ax.offer2._17_ReverseLinked.LinkedNode;

/**
 *    合并两个有序数列，合并后仍然是有序的
 * */
public class MergedLinked {

    /**
     *  情况一: 两个头节点存在 null
     *  情况二：对于两个链表长度不同的处理
     * */
    public LinkedNode mergedLinked(LinkedNode leftNode,LinkedNode rightNode) {
        if(leftNode == null ) {
            return rightNode;
        }
        if (rightNode == null){
            return leftNode;
        }
        LinkedNode resultNode = new LinkedNode();
        LinkedNode tempNode = resultNode;
        while (leftNode != null && rightNode != null){
            if ( comparTo(leftNode.getValue(),rightNode.getValue()) <= 0 ) {  //这里是否需要修改
                tempNode.setNext( leftNode);
                leftNode = leftNode.getNext();
            }else {
                tempNode.setNext(rightNode);
                rightNode = rightNode.getNext();
            }
            tempNode = tempNode.getNext();
        }
        if(leftNode != null) {
            tempNode.setNext(leftNode);
        }
        if(rightNode != null) {
            tempNode.setNext(rightNode);
        }
        return  resultNode.getNext();
    }

    private int comparTo(int value, int value1) {
        if(value > value1 ) {
            return  1;
        }
        if(value < value1){
            return -1;
        }
        return 0;
    }


}
