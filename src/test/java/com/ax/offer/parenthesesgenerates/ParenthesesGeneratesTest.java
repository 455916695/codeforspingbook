package com.ax.offer.parenthesesgenerates;

import org.junit.Test;

import java.util.ArrayList;

public class ParenthesesGeneratesTest {


    @Test
    public void parenthesesGeneratesTest() {
        ParenthesesGenerates parenthesesGenerates = new ParenthesesGenerates();

        ArrayList<String> arrayList = new ArrayList<>();
        parenthesesGenerates.parenthesesGenerates(3,3,"",arrayList);

        System.out.println(arrayList);

    }

}
