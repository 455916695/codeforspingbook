package com.decisive.pattern._7_adapter.classAdapter;

/**
 * 鸭
 */
public class Duck implements DuckInterface {
    @Override
    public void call() {
        System.out.println("鸭叫了");
    }
}
