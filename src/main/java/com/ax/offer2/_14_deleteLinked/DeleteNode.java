package com.ax.offer2._14_deleteLinked;

/**
 *  给定一个链表，和一个Node对象，在O（1） 内删除链表
 *
 * */
public class DeleteNode {

    public static LinkedNode deleteNode(LinkedNode root,LinkedNode deleteNode ) {
        //情况一：为null的非法情况
        //情况二：非正常情况，deleteNode为尾节点，不是头节点
        //情况三：非正常情况,deleteNode,为尾节点且是头节点
        //情况四：被删除的节点不是尾节点,为头节点时后面还有节点
        if(root == null) {  //非法输入
             throw  new RuntimeException("非法参数,根节点不能为null");
        }else {
            if (deleteNode == null){
               throw new RuntimeException("非法参数,被删除的节点不能为null");
            }
        }

        if(deleteNode.getNext() == null) {  //要被删除的节点时尾节点
            //说明deleteNode是尾节点
            if (root == deleteNode ){
                return null;
            }
            LinkedNode temp = root;
            while ( temp != null && temp.getNext() != deleteNode ) {
                temp = temp.getNext();
            }
            if(temp == null){
                throw new RuntimeException("非法参数，要被删除的节点不在指定链表中");
            }
            temp.setNext(null);
            return root;
        }

        LinkedNode temp = deleteNode.getNext();
        deleteNode.setValue(temp.getValue());
        deleteNode.setNext(temp.getNext());
        temp.setNext(null);
        return root;
    }

}
