package com.decisive.base_java;

public interface ClassInInterface {

    void howdy();  // public abstract

    class Test implements ClassInInterface {  //这个内部类  ，默认是  public static

        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }

    }

}
class OutTest implements ClassInInterface{

    public void howdy() {
        System.out.println("H");
        Test test = new Test();
        test.howdy();
    }
    public static void main(String[] args) {
        new OutTest().howdy();
    }

}