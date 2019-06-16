package com.applicationContextTest;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

public class ApplicationContextTest {


//    @Test
//    public void propertiesTest() {
//
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/*.xml");
//
//        while (true) {
//
//        }
//
//
//    }

    @Test
    public void test() {

        List list = new ArrayList();

        Te t1 = new Te("1");
        Te t2 = new Te("2");
        Te t3 = new Te("3");

        list.add(t1);
        list.add(t2);
        list.add(t3);

        int index = list.indexOf(new Te("2"));

//        未实现 Equals
//        Assert.assertEquals(-1,index);

//        实现equals
        Assert.assertEquals(1,index);

        System.out.println(index);
    }

    class Te {
        String name;

        public Te() {
        }

        public Te(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Te te = (Te) o;

            return name != null ? name.equals(te.name) : te.name == null;
        }

        @Override
        public int hashCode() {
            return name != null ? name.hashCode() : 0;
        }
    }


    @Test
    public void testSystem(){
        try {
            System.arraycopy(null,1,null,1,11);
        }catch (Exception e){
        }
    }

}
