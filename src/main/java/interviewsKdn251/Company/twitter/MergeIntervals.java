package interviewsKdn251.Company.twitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 21.05.2017.
 */
// Given a collection of intervals, merge all overlapping intervals.

// For example,
// Given [1,3],[2,6],[8,10],[15,18],
// return [1,6],[8,10],[15,18].

public class MergeIntervals {

    public static List<Interval> merge(List<Interval> intervalList){
        List<Interval> toReturn = new ArrayList<>();

        if (intervalList == null || intervalList.size() == 0){
            return toReturn;
        }

        int start = intervalList.get(0).start;
        int end = intervalList.get(0).end;

        for (Interval i : intervalList){
            if (i.start <= end ){
                end = Math.max(end, i.end);
            }else{
                toReturn.add(new Interval(start, end));
                start = i.start;
                end = i.end;
            }
        }
        toReturn.add(new Interval(start,end));

        return toReturn;
    }

}
