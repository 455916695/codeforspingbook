package com.ax.leetCode._8_List;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        return new AbstractList<String>() {
            @Override
            public String get(int index) {
                index++;

                if (index % 3 == 0) {
                    if (index % 5 == 0) {
                        return "FizzBuzz";
                    }
                    return "Fizz";
                }
                if (index % 5 == 0) {
                    return "Buzz";
                }
                return index + "";
            }

            @Override
            public int size() {
                return n;
            }
        };
    }
}
