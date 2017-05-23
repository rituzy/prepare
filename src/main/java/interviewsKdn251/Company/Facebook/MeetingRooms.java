package interviewsKdn251.Company.Facebook;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 20.04.2017.
 */
// Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...]
// (si < ei), determine if a person could attend all meetings.

// For example,
// Given [[0, 30],[5, 10],[15, 20]],
// return false.
public class MeetingRooms {

    public static boolean isAttend(Interval[] intervals){

        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start < o2.start) return -1;
                if (o1.start == o2.start) return 0;
                return 1;
            }
        });

        for (int i = 0; i < intervals.length - 1; i++){
            if (intervals[i].end > intervals[i + 1].start){
                return false;
            }
        }

        return true;

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
    }

}
