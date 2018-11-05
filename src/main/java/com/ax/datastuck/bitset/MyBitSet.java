package com.ax.datastuck.bitset;

import org.junit.Test;

import java.util.BitSet;

public class MyBitSet {

    @Test
    public void test() {
        BitSet bitSet = new BitSet( );
        bitSet.set(5); //将指定位数  设置为
        bitSet.set(1);
        bitSet.set(200);
        bitSet.set(600);
        bitSet.set(10000);
        bitSet.set(1000000000);
        bitSet.set(2147483647);


        System.out.println(bitSet);
    }

}
