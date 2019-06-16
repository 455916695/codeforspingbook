package com.decisive.leetCode._3_tree;

import com.ax.leetCode._3_inversion.Rotate;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的序列化与反序列化
 * <p>
 * 序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。
 * <p>
 * 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 * <p>
 * 示例:
 * <p>
 * 你可以将以下二叉树：
 * <p>
 * 序列化为 "[1,2,3,null,null,4,5]"
 * <p>
 * 提示: 这与 LeetCode 目前使用的方式一致，详情请参阅 LeetCode 序列化二叉树的格式。你并非必须采取这种方式，你也可以采用其他的方法解决这个问题。
 * <p>
 * 说明: 不要使用类的成员 / 全局 / 静态变量来存储状态，你的序列化和反序列化算法应该是无状态的。
 */
public class Serialize {

    /**
     * 思考： 为了构建二叉树的方便，对二叉树进行广度优先遍历，并以，分
     */

    // Encodes a tree to a single string.   遍历指定二叉树，构建成 以  , 为 分隔符的数组
    public String serialize(TreeNode root) {
        //判断参数合法性
        if (root == null) {
            return "";
        }

        //广度优先遍历二叉树

        StringBuffer sb = new StringBuffer();

        List<TreeNode> list = new ArrayList();
        list.add(root);

        while (list.size() > 0) {

            TreeNode treeNode = list.get(0);

            if (treeNode != null) {

                //保存值
                sb.append(treeNode.val);

                //将子节点保存到list中
                list.add(treeNode.left);
                list.add(treeNode.right);
            } else {
                //如果当前节点是 null  就保存 null
                sb.append("null");
            }

            //移除掉list 中的第一个节点
            list.remove(0);

            if (list.size() != 0) {
                sb.append(",");
            }
        }

        //返回结果
        return sb.toString();
    }

    // Decodes your encoded data to tree.  //遍历字符串，将读出来的值
    public TreeNode deserialize(String data) {

        TreeNode root = null;

        if (StringUtils.isEmpty(data)) {
            return root;
        }

        //第一 我们需要上一层的节点
        List<TreeNode> list = new ArrayList();

        String[] split = data.split(",");

        //数组遍历的索引
        int index = 0;

        //初始化根节点
        if (!"null".equals(split[index])) {
            root = new TreeNode(Integer.parseInt(split[index]));
            list.add(root);
            index++;
        } else {
            //root  为 null
            return null;
        }

        //第二 我们需要遍历字符串，并将其中的值创建成节点
        while (index < split.length) {

            TreeNode treeNode = list.get(0);

            if (treeNode == null) {
                list.remove(0);
                continue;
            }

            //从数组中遍历出两个节点
            String leftValue = split[index];
            String rightValue = split[++index];

            TreeNode leftNode = null;
            TreeNode rightNode = null;

            //判断是否为null
            if (!"null".equals(leftValue)) {
                leftNode = new TreeNode(Integer.parseInt(leftValue));
            }
            if (!"null".equals(rightValue)) {
                rightNode = new TreeNode(Integer.parseInt(rightValue));
            }

            //第三 将创建出的节点，赋值给上一层节点的对应属性
            treeNode.left = leftNode;
            treeNode.right = rightNode;

            list.add(leftNode);
            list.add(rightNode);

            list.remove(0);

            index += 1;
        }


        //返回结果
        return root;
    }

    @Test
    public void test_serialize() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);

        root.left = node1;
        root.right = node2;
        node1.left = node3;

        String serialize = serialize(root);

        System.out.println(serialize);
    }


    @Test
    public void test_deserialize() {
        TreeNode deserialize = deserialize("");

        print(deserialize);

        deserialize = deserialize("1,2,3,4,null,null,null,null,null");

        print(deserialize);
    }

    private void print(TreeNode deserialize) {

        if (deserialize == null) {
            System.out.println("deserialize  is  null");
        } else {
            System.out.println(deserialize.toString());
        }

    }
}
