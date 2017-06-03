package interviewsKdn251.Company.coursera_algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by user on 28.05.2017.
 * Intersection of two sets. Given two arrays a[] and b[], each containing n distinct 2D points
 * in the plane, design a subquadratic algorithm to count the number of points that are contained both
 * in array a[] and array b[].
 */
public class IntersectSets {
    public static List<Point> getIntersectioin(List<Point> setA, List<Point> setB){
        Set<Point> set = new HashSet<>(setA);
        List<Point> toReturn = new ArrayList<>();

        for (Point p : setB){
            if (set.contains(p)){
                toReturn.add(p);
            }
        }
        return toReturn;
    }
}
