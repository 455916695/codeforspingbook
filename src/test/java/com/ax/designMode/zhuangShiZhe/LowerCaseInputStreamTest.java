package com.ax.designMode.zhuangShiZhe;

import org.junit.Test;
import java.io.*;

public class LowerCaseInputStreamTest {

    @Test
    public void test() throws IOException {

        InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("D:\\develop\\IDEA\\NewCode\\codeforspingbook\\src\\test\\java\\com\\ax\\designMode\\zhuangShiZhe\\test.txt")));
        int c ;
        while ((c = in.read()) >0){
            System.out.print((char) c);
        }
        Integer i = 0;
        boolean equals = i.equals(i);
    }


}
