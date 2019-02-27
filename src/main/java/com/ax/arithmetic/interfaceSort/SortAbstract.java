package com.ax.arithmetic.interfaceSort;

public abstract class SortAbstract implements ISort {

    @Override
    public boolean less(Comparable s, Comparable b) {
        if (s == null || b == null) {
            throw new RuntimeException("parameter is null");
        }

        if (s.compareTo(b) < 0) {
            return true;
        }
        return false;
    }

    @Override
    public void exch(Comparable[] elements, int f, int t) {
        if (elements == null || elements.length < f || elements.length < t) {
            return;
        }

        Comparable temp = elements[f];
        elements[f] = elements[t];
        elements[t] = temp;

    }

    @Override
    public boolean isSorted(Comparable[] elements) {
        if (elements == null)
            throw new RuntimeException("parameter is null");

        for (int i = 1; i < elements.length; i++) {
            if (less(elements[i], elements[i - 1])) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void show(Comparable[] elements) {

        if (elements == null) throw new RuntimeException("parameter is null");

        for (Comparable element : elements) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }
}
