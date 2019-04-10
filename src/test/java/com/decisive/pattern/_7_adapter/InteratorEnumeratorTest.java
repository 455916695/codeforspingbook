package com.decisive.pattern._7_adapter;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class InteratorEnumeratorTest {

    @Test
    public void test() {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        Iterator<Integer> iterator = arrayList.iterator();
        traversal(iterator);
    }

    private void traversal(Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
            System.out.println((int) iterator.next());
        }
    }


    @Test
    public void testEnum() {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        Iterator<Integer> iterator = arrayList.iterator();

        InteratorEnumerator ie = new InteratorEnumerator(iterator);

        traversal(ie);
    }

    private void traversal(Enumeration<Integer> enumeration) {
        while (enumeration.hasMoreElements()) {
            System.out.println((int) enumeration.nextElement());
        }
    }

}
