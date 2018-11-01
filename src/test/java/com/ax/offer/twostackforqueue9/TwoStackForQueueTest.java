package com.ax.offer.twostackforqueue9;

import org.junit.Test;

public class TwoStackForQueueTest {

    @Test
    public  void twoStackForQueueTest() {
        TwoStackForQueue twoStackForQueue = new TwoStackForQueue();
        twoStackForQueue.push(1);
        twoStackForQueue.push(2);
        twoStackForQueue.push(3);
        twoStackForQueue.push(4);
        twoStackForQueue.push(5);
        twoStackForQueue.push(6);

       StringBuilder stringBuilder = new StringBuilder(6);
        stringBuilder.append(twoStackForQueue.pop());
        stringBuilder.append(twoStackForQueue.pop());
        stringBuilder.append(twoStackForQueue.pop());
        stringBuilder.append(twoStackForQueue.pop());
        stringBuilder.append(twoStackForQueue.pop());
        stringBuilder.append(twoStackForQueue.pop());

        System.out.println(stringBuilder.toString());
    }




}
