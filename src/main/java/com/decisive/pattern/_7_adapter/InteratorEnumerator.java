package com.decisive.pattern._7_adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * 目的： 让ArrayList 兼容 Enumeration
 */
public class InteratorEnumerator implements Enumeration {

    Iterator iterator;

    public InteratorEnumerator(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
