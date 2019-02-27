package com.ax.offer2._27_CopyComplexLinked;

import org.junit.Assert;
import org.junit.Test;

public class CopyComplexLinkedTest {

    @Test
    public void testNull() {

        CopyComplexLinked ccl = new CopyComplexLinked();
        ComplexLinked complexLinked = ccl.CopyComplexLinked(null);
        Assert.assertNull(complexLinked);

    }

    @Test
    public void test() {

        CopyComplexLinked ccl = new CopyComplexLinked();
        ComplexLinked oldLinked = new ComplexLinked(1, null, null);
        ComplexLinked complexLinked = ccl.CopyComplexLinked(oldLinked);
        Assert.assertNotEquals(oldLinked, complexLinked);
        Assert.assertEquals(oldLinked.getValue(), complexLinked.getValue());

    }

    @Test
    public void test2() {

        CopyComplexLinked ccl = new CopyComplexLinked();
        ComplexLinked temp5 = new ComplexLinked(5, null, null);
        ComplexLinked temp4 = new ComplexLinked(4, temp5, null);
        ComplexLinked temp3 = new ComplexLinked(3, temp4, null);
        ComplexLinked temp2 = new ComplexLinked(2, temp3, null);
        ComplexLinked temp = new ComplexLinked(1, temp2, null);
        ComplexLinked oldLinked = new ComplexLinked(0, temp, null);
        ComplexLinked complexLinked = ccl.CopyComplexLinked(oldLinked);

        int count = 0;
        while (complexLinked != null) {
            Assert.assertEquals(count, complexLinked.getValue());
            count++;
            complexLinked = complexLinked.getNext();
        }

    }

    @Test
    public void test3() {

        CopyComplexLinked ccl = new CopyComplexLinked();
        ComplexLinked temp5 = new ComplexLinked(5, null, null);
        ComplexLinked temp4 = new ComplexLinked(4, temp5, null);
        ComplexLinked temp3 = new ComplexLinked(3, temp4, null);
        ComplexLinked temp2 = new ComplexLinked(2, temp3, temp5);
        ComplexLinked oldLinked = new ComplexLinked(1, temp2, temp3);

        temp4.setSibling(temp2);

        ComplexLinked complexLinked = ccl.CopyComplexLinked(oldLinked);

        int count = 0;
        while (complexLinked != null) {
            Assert.assertEquals(count, complexLinked.getValue());
            count++;
            complexLinked = complexLinked.getNext();
        }

    }

}
