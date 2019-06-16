package com.decisive.leetCode._7_set;

import com.decisive.leetCode._3_tree.Node;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;
import org.omg.PortableInterceptor.NON_EXISTENT;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import sun.security.util.Length;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Insert Delete GetRandom O(1)
 * <p>
 * 设计一个支持在平均 时间复杂度 O(1) 下，执行以下操作的数据结构。
 * <p>
 * insert(val)：当元素 val 不存在时，向集合中插入该项。   //隐含着 查找
 * remove(val)：元素 val 存在时，从集合中移除该项。
 * getRandom：随机返回现有集合中的一项。每个元素应该有相同的概率被返回。
 */
public class RandomizedSet {

    /**
     * 未完成
     */

    private Hash hash;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        hash = new Hash();

        hash.length = 64;
        hash.nodes = new Node[64];
        hash.nodeArray = new ArrayList();
    }

    public RandomizedSet(int length) {
        hash = new Hash();

        hash.length = length;
        //此处需要改善
        hash.nodes = new Node[length];
        hash.nodeArray = new ArrayList();
    }


    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        boolean insert = insert(val, hash.nodes);

        return insert;
    }

    private boolean insert(int val, Node[] nodes) {
        int[] index = findIndex(val);

        if (index[2] == 1) {
            return false;
        }
        if (index[2] == -1) {
            //判断指定行是否满了
            if (nodes[index[0]].length == 8) {
                //需要扩张
                extendHash(hash);
                insert(val, hash.nodes);
            } else {
                //不需要扩张，直接赋值
                nodes[index[0]].nexts[index[1]] = new Node();
                nodes[index[0]].nexts[index[1]].val = val;
                nodes[index[0]].length++;
                hash.nodeArray.add(nodes[index[0]].nexts[index[1]]);
            }
            return true;
        } else {
            return false;
        }
    }


    private boolean extendHash(Hash hash) {

        int length = hash.length << 1;
        if (length > 0) {
            hash.oldNodes = new Node[length];

            //遍历集合
            for (Node node : hash.nodeArray) {

                boolean insert = insert(node.val, hash.oldNodes);
            }

            hash.nodes = hash.oldNodes;
            hash.oldNodes = null;
            hash.length = length;
            return true;
        } else {
            return false;
        }
    }


    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        int[] index = findIndex(val);

        if (index[2] == -1) {
            return false;
        }

        Node next = hash.nodes[index[0]].nexts[index[1]];

        hash.nodes[index[0]].nexts[index[1]] = null;
        hash.nodes[index[0]].length--;

        int index1 = hash.nodeArray.indexOf(next);
        hash.nodeArray.remove(index1);

        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        return 0;
    }

    class Hash {

        int length;

        //用于保存新的数据
        Node[] nodes;

        //用于扩张时使用
        Node[] oldNodes;

        //线性存储
        ArrayList<Node> nodeArray;
    }

    class Node {
        //值
        int val;

        //下一个  如果创建，固定长度为 8
        Node[] nexts;

        //该链表的实际长度
        int length;

    }

    /**
     * 充当计算hashCode的
     */
    public int hashCode(int val) {

        if (val < 0) {
            val = -val;
        }

        return val;
    }

    /**
     * 计算出索引
     */
    public int getIndex(int val, int length) {

        int hashCode = hashCode(val);

        int index = hashCode & (length - 1);

        return index;
    }

    /**
     * 判断一个数据是否存在
     */
    public int[] findIndex(int val) {
        //计算出在 nodes  中的索引
        int row = getIndex(val, hash.length);
        int col = getIndex(val, 8);

        if (hash.nodes[row] == null) {
            //指定行不存在
            hash.nodes[row] = new Node();
            hash.nodes[row].nexts = new Node[8];
            return new int[]{row, col, -1};
        } else {
            Node nodeHead = hash.nodes[row];

            //指定列不存在
            if (nodeHead.nexts[col] == null) {
                return new int[]{row, col, -1};
            } else {
                if (nodeHead.nexts[col].val == val) {
                    return new int[]{row, col, 1};
                }
                int tempIndex = (col + 1) & 7;
                while (tempIndex != col) {
                    if (nodeHead.nexts[tempIndex] == null) {
                        return new int[]{row, tempIndex, -1};
                    }
                    if (nodeHead.nexts[tempIndex].val == val) {
                        return new int[]{row, tempIndex, 1};
                    } else {
                        tempIndex = (tempIndex + 1) & 7;
                    }
                }
                return new int[]{row, col, -1};
            }
        }

    }

}

