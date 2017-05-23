package interviewsKdn251.Company.Google;

import interviewsKdn251.Company.Facebook.*;
import interviewsKdn251.Company.Facebook.InsertInterval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 08.05.2017.
 */
// Given a collection of intervals, merge all overlapping intervals.

// For example,
// Given [1,3],[2,6],[8,10],[15,18],
// return [1,6],[8,10],[15,18].
public class MergeIntervals {

    public static List<Interval> mergeIntervals(List<Interval> intervalList){

        if (intervalList == null || intervalList.size() == 0){
            return null;
        }

        Collections.sort(intervalList, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start < o2.start) return -1;
                if (o1.start == o2.start) return 0;
                return 1;
            }
        });

        List<Interval> toReturn = new ArrayList<>();

        int start = intervalList.get(0).start;
        int end = intervalList.get(0).end;

        for (int i = 1; i <  intervalList.size(); i++){
            if (intervalList.get(i).start < end){
                end = intervalList.get(i).end;
            }else{
                toReturn.add(new Interval(start, end));
                start = intervalList.get(i).start;
                end = intervalList.get(i).end;
            }
        }

        toReturn.add(new Interval(start, end));

        return toReturn;

    }

}
