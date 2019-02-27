package com.ax.offer2._41_LinkedPublicNode;

import java.io.Serializable;

/**
 * 链表的第一个公共节点
 */
public class LinkedPublicNode {

    /**
     *   分析链表具有公共节点时的特点
     *      从第一个公共节点开时，后面的节点都相同

     遍历出 A链表的长度,遍历出  B链表的长度

     让长的链表先遍历几步，在每次遍历时，进行比较，相等着返回
     * */

    /**
     * 情况一：存在null
     * 情况二：所传参数不存在公共节点
     * 情况三：正常情况
     */
    public LinkedNode foundPublicNode(LinkedNode nodeA, LinkedNode nodeB) {
        LinkedNode result = null;

        int lengthA = length(nodeA);
        int lengthB = length(nodeB);

        if (lengthA > lengthB) {
            nodeA = serLinked(nodeA, lengthA, lengthB);
        } else {
            nodeB = serLinked(nodeB, lengthB, lengthA);
        }

        while (nodeA != null && nodeB != null && nodeA != nodeB) {
            nodeA = nodeA.getNext();
            nodeB = nodeB.getNext();
        }
        if (nodeA != null && nodeB != null) {
            result = nodeA;
        }
        return result;
    }

    private LinkedNode serLinked(LinkedNode node, int maxLen, int minLen) {
        int count = maxLen - minLen;
        while (count-- > 0) {
            node = node.getNext();
        }
        return node;
    }

    private int length(LinkedNode node) {
        if (node == null) {
            return 0;
        }
        int length = 0;
        while (node != null) {
            length++;
            node = node.getNext();
        }
        return length;
    }

}
