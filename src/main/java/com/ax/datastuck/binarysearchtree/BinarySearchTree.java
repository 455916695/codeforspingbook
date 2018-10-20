package com.ax.datastuck.binarysearchtree;
/**
 *  二叉查找树 类
 * */
public class BinarySearchTree {

    /**
     * 在实现中，我们需要定义一个内部类Node，
     * 它包含两个分别指向左右节点的Node，
     * 一个用于排序的Key，以及该节点包含的值Value，
     * 还有一个记录该节点及所有子节点个数的值Number。
     * */

    private Node root;   // 根节点

    /**
     *  查找，递归版   通过   ： 测试没有问题
     * */
    public BinarySearchTree.Node findNodeForKey(Integer key){

        Node node = root;

        while (node != null){
            if(key > node.key) {   //判断
                node = node.rightNode;
            }else  if(key < node.key) {
                node = node.leftNode;
            }else {
                return  node;
            }
        }

        return node;
    }

    /**
     *  根据键查找数据  ：  迭代版
     * */
    public BinarySearchTree.Node findNodeByKeyRecursion(Integer key){
        return  getValue(this.root,key);
    }

    public  Node getValue(Node root ,Integer key) {

        if(root == null) return root;

        if( key < root.key ) {
            return getValue(root.leftNode,key);
        }else  if(key >root.key) {
            return getValue(root.rightNode,key);
        }else {
            return root;
        }

    }

    /**
     *  插入数据
     * */
    public boolean put(Integer key,Object value) {

        root = insertNodeData(root, key, value);

        return true;
    }
    public Node insertNodeData(Node node, Integer key , Object value) {

        // 如果节点为 null
        if(node == null) return  new Node(key,value,1);
        //如果节点不为空
        //修改节点值，并修改数量
        if(key <  node.key) {
            node.leftNode = insertNodeData(node.leftNode,key,value);
            node.setNumber(node.size(node.rightNode)+node.size(node.leftNode)+1);
        }else  if(key > node.key) {
            node.rightNode = insertNodeData(node.rightNode,key,value);
            node.setNumber(node.size(node.rightNode)+node.size(node.leftNode)+1);
        }else {
            node.setValue(value);
        }
        //修改节点数量
//        node.setNumber(node.size(node.rightNode)+node.size(node.leftNode)+1);
        return  node;
    }



//    由于插入时，又要管理 节点的数量，所以不推荐使用 迭代版
//    public boolean put2 (Integer key,Object value){
//        insertNodeData(key, value);
//        return true;
//    }

    /**
     * 迭代版
     * */
//    public void insertNodeData( Integer key , Object value ){
//            Node  node = root ;
//            if(node == null) {
//                root  = new Node(key,value,1);
//                return;
//            }
//
//            while (true){
//                if(key <node.key ){
//                       if(node.leftNode == null) {
//                            node.leftNode = new Node(key,value,1);
//                            break;
//                       }
//                       node = node.leftNode;
//                }else  if(key > node.key){
//                        if(node.rightNode == null) {
//                            node.rightNode = new Node(key,value,1);
//                            break;
//                        }
//                       node = node.rightNode;
//                }else{
//                       node.setValue(value);
//                        break;
//                }
//            }
//
//            root.setNumber(root.size2(root.leftNode)+root.size2(root.rightNode)+1);
////            return  node;
//    }








    public class Node{    //内部类

        private Integer key;    //键
        private Object value; // 值
        private Integer number; //子节点个数

        private  Node rightNode;  //右子节点
        private  Node leftNode;   //左子节点

        public Node() {
        }

        public Node(Integer key, Object value, Integer number) {
            this.key = key;
            this.value = value;
            this.number = number;
        }

        public Node(Integer key, Object value, Integer number, Node rightNode, Node leftNode) {
            this.key = key;
            this.value = value;
            this.number = number;
            this.rightNode = rightNode;
            this.leftNode = leftNode;
        }

        public Integer getKey() {
            return key;
        }

        public void setKey(Integer key) {
            this.key = key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public Node getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(Node leftNode) {
            this.leftNode = leftNode;
        }

        public Node getRightNode() {
            return rightNode;
        }

        public void setRightNode(Node rightNode) {
            this.rightNode = rightNode;
        }

        public Integer size(Node node) {
            if (node == null) return 0;
            return  node.number;
        }

        public Integer size2(Node node) {

            if(node == null) {
                return 0;
            }
            if ( node.leftNode == null){
                if(node.rightNode != null) {
                    node.setNumber(node.size2(node.rightNode)+1);
                }
                return node.getNumber();
            }else {
                if(node.rightNode != null) {
                    node.setNumber(node.size2(node.leftNode)+node.size2(node.rightNode)+1);
                    return node.getNumber();
                }
                node.setNumber(node.size2(node.leftNode)+1);
                return node.getNumber();
            }

        }


    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
