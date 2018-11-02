package com.ax.offer._103_JuZenFuGai;

import org.junit.Assert;
import org.junit.Test;

/**
 *  矩形覆盖的测试
 * */
public class JuZenFuGaiTest {

    @Test
    public void meansTest() {

        JuZenFuGai juZenFuGai = new JuZenFuGai();
        int means = juZenFuGai.means(1);
        int means1 = juZenFuGai.means(3);
        Assert.assertEquals(1,means);
        Assert.assertEquals(3,means1);

    }

}
