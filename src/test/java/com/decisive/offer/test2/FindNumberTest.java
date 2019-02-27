package com.decisive.offer.test2;

import org.junit.Assert;
import org.junit.Test;

public class FindNumberTest {

    @Test
    public void test() {
        //测试
        FindNumber findNumber = new FindNumber();
        int i = findNumber.find(new int[]{2, 1, 4, 3, 5, 2});
        Assert.assertEquals(i, 2);

        findNumber.find(new int[]{0,1, 4, 3, 5, 2});
    }

}
