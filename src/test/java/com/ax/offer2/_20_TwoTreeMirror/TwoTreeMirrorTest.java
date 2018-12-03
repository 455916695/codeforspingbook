package com.ax.offer2._20_TwoTreeMirror;

import org.junit.Assert;
import org.junit.Test;

public class TwoTreeMirrorTest {

    @Test
    public void test() {

        TwoTree root = null;
        TwoTreeMirror twoTreeMirror = new TwoTreeMirror();
        TwoTree twoTree = twoTreeMirror.makeMirror(root);
        Assert.assertNull(twoTree);

        root = new TwoTree(1, null, null);
        twoTree = twoTreeMirror.makeMirror(root);
        Assert.assertEquals(1, twoTree.getValue());

        root = new TwoTree(1, new TwoTree(2, new TwoTree(4, null, null), new TwoTree(5, null, null)), new TwoTree(3, new TwoTree(6, null, null), new TwoTree(7, null, null)));
        twoTree = twoTreeMirror.makeMirror(root);
        Assert.assertEquals(1, twoTree.getValue());

    }

    @Test
    public void test2() {

        TwoTree root = null;
        TwoTreeMirror twoTreeMirror = new TwoTreeMirror();
        TwoTree twoTree = twoTreeMirror.makeMirrorXH(root);
        Assert.assertNull(twoTree);

        root = new TwoTree(1, null, null);
        twoTree = twoTreeMirror.makeMirrorXH(root);
        Assert.assertEquals(1, twoTree.getValue());

        root = new TwoTree(1, new TwoTree(2, new TwoTree(4, null, null), new TwoTree(5, null, null)), new TwoTree(3, new TwoTree(6, null, null), new TwoTree(7, null, null)));
        twoTree = twoTreeMirror.makeMirrorXH(root);
        Assert.assertEquals(1, twoTree.getValue());

    }

}
