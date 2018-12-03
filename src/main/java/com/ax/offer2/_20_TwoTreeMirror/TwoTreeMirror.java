package com.ax.offer2._20_TwoTreeMirror;

import java.util.ArrayList;

/**
 * 输入一个 二叉树，输出该二叉树的镜像
 */
public class TwoTreeMirror  {

    /**
     * 判断是否为null
     */
    public TwoTree makeMirror(TwoTree root) {
        if (root == null || (root.getLeftTree() == null && root.getRightTree() == null)) {
            return root;
        }
        exchangeSub(root);
        makeMirror(root.getLeftTree());
        makeMirror(root.getRightTree());
        return root;
    }

    private void exchangeSub(TwoTree root) {
        TwoTree leftTree = root.getLeftTree();
        TwoTree rightTree = root.getRightTree();
        root.setLeftTree(rightTree);
        root.setRightTree(leftTree);
    }

    public TwoTree makeMirrorXH(TwoTree root) {
        if (root == null || (root.getLeftTree() == null && root.getRightTree() == null)) {
            return root;
        }
        ArrayList<TwoTree> subList = new ArrayList<>();
        subList.add(root);
        while (!subList.isEmpty()) {
            TwoTree temp = subList.get(0);
            exchangeSub(temp);
            if (temp.getLeftTree() != null) {
                subList.add(temp.getLeftTree());
            }
            if (temp.getRightTree() != null) {
                subList.add(temp.getRightTree());
            }
            subList.remove(0);
        }
        return root;
    }

}
