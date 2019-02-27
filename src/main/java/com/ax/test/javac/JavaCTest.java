package com.ax.test.javac;

public class JavaCTest {

    public static void main(String[] args){

        int a = 0;
        int b = 0;
        int c = 0;

        if(args.length >= 3) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        }
        if( a == b && b == c ){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}
