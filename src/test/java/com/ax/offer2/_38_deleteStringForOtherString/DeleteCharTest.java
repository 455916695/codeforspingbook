package com.ax.offer2._38_deleteStringForOtherString;

import org.junit.Test;

public class DeleteCharTest {

    @Test
    public void test() {
        DeleteChar dc = new DeleteChar();

        String s = dc.deleteCharForStr("", "");
        System.out.println(s);

        s = dc.deleteCharForStr("1231234", "24");
        System.out.println(s);


    }


}
