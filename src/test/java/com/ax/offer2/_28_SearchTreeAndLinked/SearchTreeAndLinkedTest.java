package com.ax.offer2._28_SearchTreeAndLinked;

import org.junit.Assert;
import org.junit.Test;

public class SearchTreeAndLinkedTest {

    @Test
    public void testNull() {

        SearchTreeAndLinked searchTreeAndLinked = new SearchTreeAndLinked();

        TwoTree twoTree = searchTreeAndLinked.treeToLinked(null);

        Assert.assertNull(twoTree);

    }

    @Test
    public void testOne() {

        SearchTreeAndLinked searchTreeAndLinked = new SearchTreeAndLinked();
        TwoTree twoTree = searchTreeAndLinked.treeToLinked(new TwoTree(1, null, null));
        Assert.assertEquals(1, twoTree.getValue());
        Assert.assertNull(twoTree.getLeftTree());
        Assert.assertNull(twoTree.getRightTree());

    }

    @Test
    public void testZ() {

        SearchTreeAndLinked searchTreeAndLinked = new SearchTreeAndLinked();

        TwoTree twoTree = searchTreeAndLinked.treeToLinked(new TwoTree(10, new TwoTree(6, null, null), new TwoTree(6, null, null)));

        Assert.assertEquals(1, twoTree.getValue());
        Assert.assertNull(twoTree.getLeftTree());
        Assert.assertNull(twoTree.getRightTree());

    }

    @Test
    public void testS() {

        SearchTreeAndLinked searchTreeAndLinked = new SearchTreeAndLinked();
        TwoTree twoTree = searchTreeAndLinked.treeToLinked(new TwoTree(10, new TwoTree(6, new TwoTree(4, null, null), new TwoTree(8, null, null)), new TwoTree(14, new TwoTree(12, null, null), new TwoTree(16, null, null))));

        Assert.assertEquals(4, twoTree.getValue());


    }


}
