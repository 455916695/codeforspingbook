package com.ax.offer2._6_rebuildTree;

/**
 *  重建二叉树
 *      根据前序遍历的结果，与中序遍历的结果，重建二叉树
 *
 *             缺点没有做：特殊输入测试
 * */
public class ReBuildTree {

    public  LinkedNode reBuildTree(int[] preArray,int[] midArray) {
        LinkedNode linkedNode = reBuildTree(0, preArray.length - 1, preArray, 0, midArray.length, midArray);

        return  linkedNode;
    }

    public  LinkedNode reBuildTree(int l1,int h1,int[] preArray,int l2,int h2,int[] midArray) {
        if(l1 > h1 ||  l2 > h2) {  //边界条件是否这么简单
            return  null;
        }
        //从前序遍历的数组中获取根节点的值
        int rootValue = preArray[l1]; //根节点的值
        LinkedNode linkedNode = new LinkedNode(rootValue,null,null);
        //从中序遍历的数组中找到，根节点值的索引
        int midIndex = -1;
        for (int i = l2;i<=h2;i++){
            if(midArray[i] ==rootValue) {
                midIndex = i;
                break;
            }
        }
        linkedNode.setLeftNext(reBuildTree(l1+1,l1+(midIndex-l2),preArray,l2,midIndex-1,midArray));
        linkedNode.setRightNext(reBuildTree(l1+(midIndex-l2)+1,h1,preArray,(midIndex+1),h2,midArray));
        return  linkedNode;
    }

}
