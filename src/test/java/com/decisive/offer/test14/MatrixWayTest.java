package com.decisive.offer.test14;


import org.junit.Assert;
import org.junit.Test;

public class MatrixWayTest {

    @Test
    public void test() {

        MatrixWay mw = new MatrixWay();

        boolean way = mw.findWay(new char[][]{{'a', 'b', 't', 'g'}, {'c', 'f', 'c', 's'}, {'j', 'd', 'e', 'h'}}, new char[]{'b', 'f', 'c', 'e'});

        Assert.assertTrue(way);

        way = mw.findWay(new char[][]{{'a', 'b', 't', 'g'}, {'c', 'f', 'c', 's'}, {'j', 'd', 'e', 'h'}}, new char[]{'b', 'f', 'c', 'E'});

        Assert.assertFalse(way);

    }

}
