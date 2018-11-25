package com.ax.test.enumTest;

public enum MyEnum {

    ONLYONE;

    private static  Person person = null;

    private MyEnum() {

        System.out.println(" ONLYONE  被创建了");
        setPerson();
    }

    private void setPerson() {
        person = new Person();
    }

}
