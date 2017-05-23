package interviewsKdn251.Company.Facebook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 19.04.2017.
 */
// Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

// You may assume that the intervals were initially sorted according to their start times.

// Example 1:
// Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].

// Example 2:
// Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].

// This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
public class InsertInterval {

    public static List<Interval> intsertInterval(ArrayList<Interval> intervals, Interval newInterval){
        if (intervals == null || newInterval == null){
            return null;
        }

        int i = 0;

        while (i < intervals.size() && intervals.get(i).end < newInterval.start)
            i++;

        int minStart = newInterval.start;
        int maxEnd = newInterval.end;

        while (i < intervals.size() && intervals.get(i).start <= newInterval.end){
            minStart = Math.min(intervals.get(i).start, minStart);
            maxEnd = Math.max(intervals.get(i).end, maxEnd);

            intervals.remove(i);
        }

        intervals.add(i, new Interval(minStart, maxEnd));

        return intervals;
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
            return "[" + start + "," + end + "]";
        }
    }
}
