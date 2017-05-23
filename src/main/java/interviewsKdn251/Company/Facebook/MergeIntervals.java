package interviewsKdn251.Company.Facebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 20.04.2017.
 */
// Given a collection of intervals, merge all overlapping intervals.

// For example,
// Given [1,3],[2,6],[8,10],[15,18],
// return [1,6],[8,10],[15,18].
public class MergeIntervals {

    public static List<Interval> getMergetIntervals(List<Interval> intervals){
        List<Interval> toReturn = new ArrayList<>();

        if (intervals == null || intervals.size() == 0) return toReturn;

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        int start = intervals.get(0).start, end = intervals.get(0).end;

        for (Interval i : intervals){
            if (i.start <= end){
                end = Math.max(end, i.end);
            }else{
                toReturn.add(new Interval(start, end));
                start = i.start;
                end = i.end;
            }
        }

        toReturn.add(new Interval(start, end));
        return toReturn;
    }

    public static class Interval{
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public Interval() {
            this(0,0);
        }

        @Override
        public String toString() {
            return "[" + start +", " + end + "]";
        }
    }
}
