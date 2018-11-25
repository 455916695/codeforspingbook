package com.ax.dataStuck2._1_tree;

public class TwoCTree {

   private  Node root;


   /**
    *  向二叉树中插入数据  ,此处存在一个问题，如果数据相同存放在哪里？？？
    * */
   public void insert (int num){
        //判断root 是否为空
       if (root == null) {
           root = new Node(num,null,null);
            return;
       }
        Node temp = root;
        while (true){
            if( num  > temp.getData() ) {
                if(temp.getRightChild() == null) {
                    temp.setRightChild(new Node(num,null,null));
                    break;
                }else {
                    temp = temp.getRightChild();
                }
            }else {
                if(temp.getLeftChild() == null) {
                    temp.setLeftChild(new Node(num,null,null));
                    break;
                }else {
                    temp = temp.getLeftChild();
                }
            }
        }
   }


   public  Node  find (int key) {
        if(root == null) {
            return null;
        }

        Node temp = root;
        while (true) {
            if( key > temp.getData()) {
                temp = temp.getRightChild();
                if(temp == null) {
                   break;
                }
                continue;
            }else if (key < temp.getData()) {
                temp = temp.getLeftChild();
                if(temp == null) {
                    break;
                }
                continue;
            }else
            return  temp;
        }

        return  null;

   }


}


