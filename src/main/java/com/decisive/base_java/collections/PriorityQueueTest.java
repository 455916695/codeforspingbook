package com.decisive.base_java.collections;

import javax.swing.*;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue<IntegerTest> pq = new PriorityQueue();

        pq.add(new IntegerTest(2));
        pq.add(new IntegerTest(1));
        pq.add(new IntegerTest(5));
        pq.add(new IntegerTest(6));

        IntegerTest poll = pq.poll();
        System.out.println(poll.getInteger());

        for (IntegerTest o : pq) {

            System.out.println(o.getInteger());
        }

    }

}

class IntegerTest implements Comparable<IntegerTest> {

    private Integer integer;

    public IntegerTest(Integer integer) {
        this.integer = integer;
    }

    public Integer getInteger() {
        return integer;
    }

    @Override
    public int compareTo(IntegerTest o) {
        return integer.compareTo(o.getInteger());
    }
}