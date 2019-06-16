package com.decisive.common;

/**
 * 表示区间
 */
public class Interval {
    public int start;
    public int end;

    Interval() {
        start = 0;
        end = 0;
    }

    public Interval(int s, int e) {
        start = s;
        end = e;
    }
}
