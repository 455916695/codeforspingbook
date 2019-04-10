package com.decisive.offer.test22;


import org.junit.Assert;
import org.junit.Test;

public class RegexMatchTest {

    @Test
    public void test() {

        RegexMatch rm = new RegexMatch();

        boolean abbccd = rm.regexMatch("", ".");

        Assert.assertFalse(abbccd);

    }

}
