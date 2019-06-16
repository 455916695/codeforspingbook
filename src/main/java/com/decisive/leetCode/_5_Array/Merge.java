package com.decisive.leetCode._5_Array;

import com.decisive.common.Interval;
import org.junit.Test;

import java.util.*;

/**
 * 合并区间
 * 给出一个区间的集合，请合并所有重叠的区间。
 * 示例 1:
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例 2:
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 */
public class Merge {

    //问题一：输入的集合是否是有序的
    //问题二：输出的集合是否需要有序的

    //假设区间集合是无序的
    public List<Interval> merge(List<Interval> intervals) {
        //对集合进行排序
        Collections.sort(intervals, new MyComparator());

        List<Interval> result = mergeList(intervals);

        return result;
    }

    /**
     * 合并区间有序的集合
     */
    private List<Interval> mergeList(List<Interval> intervals) {

        if (intervals.size() < 1) {
            return intervals;
        }

        List<Interval> result = new ArrayList();

        Interval temp = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {

            Interval interval = intervals.get(i);

            //判断当前区间是否可以与temp合并
            if (interval.start >= temp.start && interval.start <= temp.end) {
                if (interval.end > temp.end) {
                    temp.end = interval.end;
                }
            } else {
                //如果不能和并，就添加到result中
                result.add(temp);
                //并将该区间赋值给temp
                temp = interval;
            }
        }

        result.add(temp);

        return result;
    }

    /**
     * 排序器
     */
    class MyComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval o1, Interval o2) {
            Integer o1Start = o1.start;
            Integer o2Start = o2.start;
            return o1Start.compareTo(o2Start);
        }
    }


    @Test
    public void test_merge() {

        List<Interval> list = new ArrayList();
//[[1,3],[2,6],[8,10],[15,18]]
        Interval interval = new Interval(1, 3);
        Interval interval1 = new Interval(2, 6);
        Interval interval2 = new Interval(8, 10);
        Interval interval3 = new Interval(15, 18);

        list.add(interval);
        list.add(interval1);
        list.add(interval2);
        list.add(interval3);

        List<Interval> merge = merge(list);

        print(merge);
    }

    private void print(List<Interval> merge) {

        System.out.print("[");
        for (Interval interval : merge) {
            System.out.print("[" + interval.start + "," + interval.end + "]");
            System.out.print(",");
        }
        System.out.print("]");

    }

}
