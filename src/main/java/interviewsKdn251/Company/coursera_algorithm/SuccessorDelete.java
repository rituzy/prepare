package interviewsKdn251.Company.coursera_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by user on 28.05.2017.
 * Successor with delete. Given a set of N integers S={0,1,...,N−1} and a sequence of requests of the
 * following form:

 Remove x from S
 Find the successor of x: the smallest y in S such that y≥x.
 design a data type so that all operations (except construction) should take logarithmic time or better.
 */
public class SuccessorDelete {

    private static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3 , 4, 9, 11, 89, 0, -1, -58));

    public static int remove(int x){

        List<Integer> sorted = new ArrayList<>(numbers);
        Collections.sort(sorted);

        int midInd = binarySearch(sorted, x, 0, sorted.size() - 1);

        numbers.remove(Integer.valueOf(x));

        return midInd + 1 >= sorted.size() || midInd == -1 ? -1 : sorted.get(midInd + 1);
    }

    private static int binarySearch(List<Integer> lst, int x, int left, int right){

        if (left > right) return -1;
        int mid = left + (right - left) / 2;

        if (lst.get(mid) == x) return mid;

        if (lst.get(mid) < x){
            return binarySearch(lst, x, mid + 1, right);
        }else{
            return binarySearch(lst, x, left, mid - 1);
        }

    }






}
