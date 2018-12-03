package com.ax.offer2._16_backwardsCountLinked;



/**
 *  链表中倒数第 k 个节点
 *      输入一个链表，输出该链表中倒数第K个节点，为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点的倒数第1个节点。
 *      例如一个链表有6个节点，从头节点开始他们的值一次是1,2,3,4,5,6. 这个链表的倒数第3个节点是值为4的节点
 *
 * */
public class BackwardsLinked {

    public LinkedNode getBackwardLinked(LinkedNode root,int k) {
        // 情况一：root 为 null
        // 情况二：参数k不合法
        // 情况三：参数k大于链表长度
        // 情况四：正常情况
        if(root == null || k == 0 ) {
            return root;
        }
        if(k < 0) {
            throw new RuntimeException("非法参数，参数k不能为负数");
        }
        LinkedNode tempBefore = root;
        LinkedNode tempAfter = root;
        while ( tempBefore != null ){
            tempBefore = tempBefore.getNext();
            if(--k >= 1 || tempBefore == null) {
                continue;
            }
            tempAfter = tempAfter.getNext();
        }
        if( k <= 1) {
            return tempAfter;
        }
        throw  new RuntimeException("非法参数，参数k大于链表长度");
    }


    public static  LinkedNode getBackwardLinked2(LinkedNode root,int k){
        if(root == null || k == 0 ) {
            return root;
        }
        if(k < 0) {
            throw new RuntimeException("非法参数，参数k不能为负数");
        }
        LinkedNode tempBefore = root;
        LinkedNode tempAfter = root;
        for (int i = 1;i<=k-1 && tempBefore != null ;i++){
            tempBefore = tempBefore.getNext();
        }
        if(tempBefore == null) {
            throw  new RuntimeException("非法参数，参数k大于链表长度");
        }
        while (tempBefore.getNext() != null){
            tempBefore = tempBefore.getNext();
            tempAfter = tempAfter.getNext();
        }
        return tempAfter;
    }

}
