package com.ax.datastuck.hashSetEr;

import java.util.Random;

public class Person {

    private String  name;
    private int age;

    private int hashCod=0;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        return  false;
    }

    @Override
    public int hashCode() {
//        return new Random(System.currentTimeMillis()).nextInt();
        return hashCod++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
