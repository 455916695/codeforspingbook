package com.ax.offer2._19_SubstructureQuery;

import org.junit.Assert;
import org.junit.Test;

public class TreeSubstructureQueryTest {

    @Test
    public void test() {
        TreeSubstructureQuery tsq = new TreeSubstructureQuery();

        boolean substructur = tsq.isSubstructur(null, null);
        Assert.assertTrue(substructur);

        substructur = tsq.isSubstructur(null, new TwoTree());
        Assert.assertFalse(substructur);

        substructur = tsq.isSubstructur(new TwoTree(), null);
        Assert.assertTrue(substructur);

        TwoTree treeB = new TwoTree(1, new TwoTree(2, null, null), new TwoTree(3, null, null));
        TwoTree treeA = new TwoTree(-1, new TwoTree(1, new TwoTree(2, new TwoTree(4, null, null), new TwoTree(5, null, null)), new TwoTree(3, null, null)), new TwoTree(8,null,null));
        substructur = tsq.isSubstructur(treeA, treeB);
        Assert.assertTrue(substructur);
    }
}
