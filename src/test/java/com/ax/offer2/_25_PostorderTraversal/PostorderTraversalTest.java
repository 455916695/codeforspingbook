package com.ax.offer2._25_PostorderTraversal;

import org.junit.Assert;
import org.junit.Test;

public class PostorderTraversalTest {

    @Test
    public void test() {

        try {
            PostorderTraversal.isPostorder(null);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        boolean postorder = PostorderTraversal.isPostorder(new int[]{1, 2, 6, 4, 5});
        Assert.assertFalse(postorder);

        postorder = PostorderTraversal.isPostorder(new int[]{1});
        Assert.assertTrue(postorder);

        postorder = PostorderTraversal.isPostorder(new int[]{1, 2, 3, 4, 5});
        Assert.assertTrue(postorder);


        postorder = PostorderTraversal.isPostorder(new int[]{6, 7, 8, 9, 5});
        Assert.assertTrue(postorder);


        postorder = PostorderTraversal.isPostorder(new int[]{5, 7, 6, 9, 11, 10, 8});
        Assert.assertTrue(postorder);
    }

}
