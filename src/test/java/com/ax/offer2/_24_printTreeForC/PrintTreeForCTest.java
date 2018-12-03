package com.ax.offer2._24_printTreeForC;

import org.junit.Test;

public class PrintTreeForCTest {

    @Test
    public void test() {

        PrintTreeForC ptfc = new PrintTreeForC();

        ptfc.printTree(null);

        ptfc.printTree(new TwoTree(1, null, null));

        ptfc.printTree(new TwoTree(1, new TwoTree(2, new TwoTree(4, null, null), new TwoTree(5, null, null)), new TwoTree(3, new TwoTree(6, null, null), new TwoTree(7, null, null))));


    }

}
