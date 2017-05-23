package interviewsKdn251.Company.Google;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 08.05.2017.
 */
// Given a set of non-overlapping intervals, insert a new interval into the intervals (merge
// if necessary).

// You may assume that the intervals were initially sorted according to their start times.

// Example 1:
// Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].

// Example 2:
// Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].

// This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].

public class InsertInterval {

    public static List<Interval> insertInterval(List<Interval> intervals, Interval newInterval){
        List<Interval> toReturn = new ArrayList<>();

        if (intervals == null) return toReturn;

        int start = newInterval.start;
        int end = newInterval.end;
        int i = 0;

        while ( i < intervals.size() && intervals.get(i).start < newInterval.end){
            if ( intervals.get(i).end < newInterval.start ){
                toReturn.add( intervals.get(i) );
            }else{
                start = Math.min(start, intervals.get(i).start);
                end = Math.max(end, intervals.get(i).end);
            }
            i++;
        }

        toReturn.add(new Interval(start, end));

        while (i < intervals.size()){
            toReturn.add(intervals.get(i));
            i++;
        }

        return toReturn;
    }

    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {

        int i = 0;
        // fast forward to the place whre new interval intersects
        while(i < intervals.size() && intervals.get(i).end < newInterval.start) i++;
        // checking only intervals that intersect with the new one
        while(i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            // update new interval in place with new borders if the borders are wider
            newInterval = new Interval(Math.min(intervals.get(i).start, newInterval.start), Math.max(intervals.get(i).end, newInterval.end));
            // remove old interval
            intervals.remove(i);

        }
        // add new interval
        intervals.add(i, newInterval);
        // all the rest of intervals to the left remain in the list
        return intervals;

    }
}
