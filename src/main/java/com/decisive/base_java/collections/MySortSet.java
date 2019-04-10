package com.decisive.base_java.collections;

import java.util.*;

/**
 * 目标使用 LinkedList  实现 SortedSet
 * */
public class MySortSet<T> implements SortedSet<T> {

    private LinkedList<T> linkedList;
    private Comparator<? super T> comparator;
    private  TreeSet treeSet;

    @Override
    public Comparator<? super T> comparator() {
        return comparator;
    }

    @Override
    public SortedSet<T> subSet(T fromElement, T toElement) {
        // 判断指定元素是否存在于 LinkedHashSet 中
        boolean containsFrom = linkedList.contains(fromElement);
        boolean containsTo = linkedList.contains(toElement);
        if (!containsFrom || !containsTo)
            return null;

        SortedSet sortedSet = new MySortSet();
        for (T t : linkedList) {
            sortedSet.add(t);
        }

        //判断指定元素是否存在于 LinkedHaseSet 中
        return sortedSet;
    }

    @Override
    public SortedSet<T> headSet(T toElement) {

        Iterator<T> iterator = linkedList.iterator();
        if (iterator.hasNext())
            return (SortedSet<T>) iterator.next();
        return null;
    }

    @Override
    public SortedSet<T> tailSet(T fromElement) {
        return null;
    }

    @Override
    public T first() {
        return linkedList.getFirst();

    }

    @Override
    public T last() {
        return linkedList.getLast();

    }

    @Override
    public int size() {
        return linkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return linkedList.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return linkedList.iterator();
    }

    @Override
    public Object[] toArray() {
        return linkedList.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return linkedList.toArray(a);
    }

    @Override
    public boolean add(T t) {
        return linkedList.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return linkedList.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
