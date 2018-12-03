package com.ax.offer2._16_backwardsCountLinked;

import org.junit.Assert;
import org.junit.Test;

public class BackwardsLinkedTest {

    @Test
    public  void test() {
        // 情况一：root 为 null
        // 情况二：参数k不合法
        // 情况三：参数k大于链表长度
        BackwardsLinked backwardsLinked = new BackwardsLinked();
        LinkedNode backwardLinked = backwardsLinked.getBackwardLinked(null, 0);
        Assert.assertNull(backwardLinked);
        System.out.println("--------------------1-----------------------------------");
        backwardsLinked.getBackwardLinked(null,1);
        Assert.assertNull(backwardLinked);
        System.out.println("--------------------2-----------------------------------");
        try {
            backwardsLinked.getBackwardLinked(new LinkedNode(1,null),-1);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("--------------------3-----------------------------------");
        try {
            backwardsLinked.getBackwardLinked(new LinkedNode(1,new LinkedNode(2,new LinkedNode(3,new LinkedNode(4,new LinkedNode(5,new LinkedNode(6,null)))))),7);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("--------------------4-----------------------------------");
        backwardLinked = backwardsLinked.getBackwardLinked(new LinkedNode(1, new LinkedNode(2, new LinkedNode(3, new LinkedNode(4, new LinkedNode(5, new LinkedNode(6, null)))))), 3);
        Assert.assertEquals(4,backwardLinked.getValue());
        System.out.println("--------------------5-----------------------------------");
        backwardLinked = backwardsLinked.getBackwardLinked(new LinkedNode(1, new LinkedNode(2, new LinkedNode(3, null))), 3);
        Assert.assertEquals(1,backwardLinked.getValue());

    }

    @Test
    public  void test2() {
        // 情况一：root 为 null
        // 情况二：参数k不合法
        // 情况三：参数k大于链表长度
        BackwardsLinked backwardsLinked = new BackwardsLinked();
        LinkedNode backwardLinked = backwardsLinked.getBackwardLinked2(null, 0);
        Assert.assertNull(backwardLinked);
        System.out.println("--------------------1-----------------------------------");
        backwardsLinked.getBackwardLinked2(null,1);
        Assert.assertNull(backwardLinked);
        System.out.println("--------------------2-----------------------------------");
        try {
            backwardsLinked.getBackwardLinked2(new LinkedNode(1,null),-1);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("--------------------3-----------------------------------");
        try {
            backwardsLinked.getBackwardLinked2(new LinkedNode(1,new LinkedNode(2,new LinkedNode(3,new LinkedNode(4,new LinkedNode(5,new LinkedNode(6,null)))))),7);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("--------------------4-----------------------------------");
        backwardLinked = backwardsLinked.getBackwardLinked2(new LinkedNode(1, new LinkedNode(2, new LinkedNode(3, new LinkedNode(4, new LinkedNode(5, new LinkedNode(6, null)))))), 3);
        Assert.assertEquals(4,backwardLinked.getValue());
        System.out.println("--------------------5-----------------------------------");
        backwardLinked = backwardsLinked.getBackwardLinked2(new LinkedNode(1, new LinkedNode(2, new LinkedNode(3, null))), 3);
        Assert.assertEquals(1,backwardLinked.getValue());

    }

}
