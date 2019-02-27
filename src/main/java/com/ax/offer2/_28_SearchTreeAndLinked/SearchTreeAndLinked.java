package com.ax.offer2._28_SearchTreeAndLinked;

/**
 * 二叉搜索树 与 双向链表
 */
public class SearchTreeAndLinked {

    public TwoTree treeToLinked(TwoTree root) {
        if (root == null) {
            return null;
        }
        //第一步：将左子树转化为链表
        TwoTree[] twoTreesL = treeToLinkeds(root.getLeftTree());
        //第二步：将右子树转化为链表
        TwoTree[] twoTreesR = treeToLinkeds(root.getRightTree());
        //第三步:将root 转化为链表
        if(twoTreesL != null && twoTreesR != null) {
            toLinked(root, twoTreesL[1], twoTreesR[0]);
        }else if (twoTreesL == null &&twoTreesR != null){
            toLinked(root, null, twoTreesR[0]);
        }if (twoTreesL != null &&twoTreesR == null){
            toLinked(root, null,null);
        }
        if(twoTreesL == null) {
            return root;
        }else {
            return twoTreesL[0];
        }

    }

    private TwoTree[] toLinked(TwoTree root, TwoTree twoTreesL, TwoTree twoTreesR) {
        if (root == null) {
            return null;
        }
        TwoTree[] result = new TwoTree[2];
        if (twoTreesL != null) {
            root.setLeftTree(twoTreesL);
            twoTreesL.setRightTree(root);
            result[0] = twoTreesL;
        } else {
            result[0] = root;
        }
        if (twoTreesR != null) {
            root.setRightTree(twoTreesR);
            twoTreesR.setLeftTree(root);
            result[1] = twoTreesR;
        } else {
            result[1] = root;
        }

        return result;
    }

    private TwoTree[] treeToLinkeds(TwoTree root) {
        if (root == null) {
            return null;
        }
        if(isChildNull(root)) {
            return  toLinked(root,root.getLeftTree(),root.getRightTree());
        }

        TwoTree[] twoTreesLeft = null;
        TwoTree[] twoTreesRight = null;
        if (root.getLeftTree() != null) {
            twoTreesLeft = treeToLinkeds(root.getLeftTree());
        }
        if (root.getRightTree() != null) {
            twoTreesRight = treeToLinkeds(root.getRightTree());
        }

        TwoTree[] result = new TwoTree[2];
        if (twoTreesLeft != null) {
            result[0] = twoTreesLeft[1];
        } else {
            result[0] = root;
        }
        if (twoTreesRight != null) {
            result[1] = twoTreesRight[0];
        } else {
            result[1] = root;
        }

        return result;
    }

    private boolean isChildNull(TwoTree root) {
        boolean result = true;
        if(root.getLeftTree() != null ) {
            TwoTree temp = root.getLeftTree();
            if(temp.getLeftTree() != null || temp.getRightTree() != null) {
                return  false;
            }
        }
        if(root.getRightTree() != null ) {
            TwoTree temp = root.getRightTree();
            if(temp.getLeftTree() != null || temp.getRightTree() != null) {
                return  false;
            }
        }

        return result;

    }

}
