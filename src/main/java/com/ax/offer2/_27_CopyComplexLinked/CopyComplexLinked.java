package com.ax.offer2._27_CopyComplexLinked;


/**
 * 复制复杂的链表
 * 复制一个复杂链表，在复杂链表中，
 * 每个节点除了有一个 m_pNext指针指向下一个节点外，
 * 还有一个m_pSibling 指向链表中任意节点或者NULL
 */
public class CopyComplexLinked {
    /**
     *  方式一：
     *  分析：
     *      一：优先复制 本身与 m_pNext指针所指的节点
     *      二：再复制 m_pSibling 指针所指的内容
     *          空间复杂度 O（n）
     *          时间复杂度 O(n^2)   // n 的 平方
     * */
    /**
     *  方式二：方式一需要优化的地方，再第二步寻找的时候，消耗的大量的时间，需要改进
     *  分析：
     *      一：优先复制 本身与 m_pNext指针所指的节点，同时将 原始节点与新节点，以键值对的形式保存在 HashMap 中
     *      二：再复制 m_pSibling 指针所指的内容，不需要第一步中形成的链表中寻找，直接去HashMap中寻找
     *          空间复杂度  O(n)   //2n
     *          时间复杂度  O(n)   //2n
     * */
    /**
     * 方式三：方式二中使用了额外的辅助空间，可以进一步进行改进
     * 分析：
     * 一：复制节点本身，并保存在原始节点的后面，这样就形成一份，原始节点与 新节点的相间的新链表
     * 二：复制 m_pString 指针所指的内容，只要遍历原始节点，就能知道对应的新节点的位置，并且知道该复制那个节点的地址
     * 三：分离原始节点与新节点，形成两个链表
     * 空间复杂度 O(n)    //n
     * 时间复杂度 O（n）  //3n
     */

    public ComplexLinked CopyComplexLinked(ComplexLinked oldLinked) {
        if(oldLinked == null) {
            return  null;
        }
        //第一步 ：复制节点本身
        oldLinked = copyLinked(oldLinked);  //再原地复制了一份 新旧相间的链表
        //第二步 ：复制m_pString 引用关系
        oldLinked = copySibling(oldLinked);
        //第三步 ：分离节点
        return splitLinked(oldLinked);  //将新旧相间的节点分开
    }

    /**
     * 分离新旧节点
     */
    private ComplexLinked splitLinked(ComplexLinked oldLinked) {

        if (oldLinked == null) {
            return oldLinked;
        }

        ComplexLinked result = oldLinked.getNext();

        while (oldLinked != null) {
            ComplexLinked temp = oldLinked.getNext();
            oldLinked.setNext(temp.getNext());
            if (oldLinked.getNext() != null) {
                temp.setNext(oldLinked.getNext().getNext());
            } else {
                temp.setNext(null);
            }
            oldLinked = oldLinked.getNext();
        }

        return result;

    }

    /**
     * 复制节点的  Sibling
     */
    private ComplexLinked copySibling(ComplexLinked oldLinked) {
        ComplexLinked result = oldLinked;
        while (oldLinked != null) {
            ComplexLinked temp = oldLinked.getNext();
            if (oldLinked.getSibling() != null) {
                temp.setSibling(oldLinked.getSibling().getNext());
            } else {
                temp.setSibling(null);
            }
            oldLinked = temp.getNext();
        }

        return result;
    }

    /**
     * 复制节点本身
     */
    private ComplexLinked copyLinked(ComplexLinked oldLinked) {
        ComplexLinked result = oldLinked;
        while (oldLinked != null) {
            ComplexLinked temp = new ComplexLinked(oldLinked.getValue(), oldLinked.getNext(), null);
            oldLinked.setNext(temp);
            oldLinked = temp.getNext();
        }
        return result;
    }

}




















































