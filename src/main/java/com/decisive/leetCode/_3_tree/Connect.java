package com.decisive.leetCode._3_tree;


import org.junit.Test;

/**
 * 填充每个节点的下一个右侧节点指针
 * <p>
 * 给定一个完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 * <p>
 * struct Node {
 * int val;
 * Node *left;
 * Node *right;
 * Node *next;
 * }
 * <p>
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * <p>
 * 初始状态下，所有 next 指针都被设置为 NULL。
 */
public class Connect {

    //做一种层级遍历，由于是完美二叉树，每一层中 第一个节点必然存在
    public Node connect(Node root) {
        //思路三：做一种假的层级遍历
        Node tempRoot = root;  //用来遍历的

        //
        while (tempRoot != null) {
            Node temp = tempRoot;
            //让temp横向遍历
            while (temp != null) {
                //将子树关联起来
                connectNext(temp);
                temp = temp.next;
            }
            //进入下一层
            tempRoot = tempRoot.left;
        }
        return root;
    }

    private void connectNext(Node temp) {
        if (temp != null && temp.right != null) {
            temp.left.next = temp.right;
        }

        if (temp.next != null && temp.next.left != null) {
            temp.right.next = temp.next.left;
        }
    }


    @Test
    public void test_connectNext() {
        Node root = new Node(0);
        Node root_1 = new Node(1);
        Node root_2 = new Node(2);

        Node root_3 = new Node(3);
        Node root_4 = new Node(4);

        Node root_5 = new Node(5);
        Node root_6 = new Node(6);

        root.left = root_1;
        root.right = root_2;

        root_1.left = root_3;
        root_1.right = root_4;

        root_2.left = root_5;
        root_2.right = root_6;

        connectNext(root);

        System.out.println("");

    }

    @Test
    public void test_connect(){
        Node root = new Node(0);
        Node root_1 = new Node(1);
        Node root_2 = new Node(2);

        Node root_3 = new Node(3);
        Node root_4 = new Node(4);

        Node root_5 = new Node(5);
        Node root_6 = new Node(6);

        root.left = root_1;
        root.right = root_2;

        root_1.left = root_3;
        root_1.right = root_4;

        root_2.left = root_5;
        root_2.right = root_6;

        connect(root);

        System.out.println("");

    }
}
