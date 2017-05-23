package interviewsKdn251.Company.Google;

/**
 * Created by user on 15.05.2017.
 */
// Given two 1d vectors, implement an iterator to return their elements alternately.

// For example, given two 1d vectors:

// v1 = [1, 2]
// v2 = [3, 4, 5, 6]
// By calling next repeatedly until hasNext returns false, the order of elements returned by next should
// be: [1, 3, 2, 4, 5, 6].

// Follow up: What if you are given k 1d vectors? How well can your code be extended to such cases?

import java.util.Iterator;
import java.util.List;

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */

public class ZigzagIterator {
    Iterator<Integer> itOne;
    Iterator<Integer> itTwo;

    public ZigzagIterator(List<Integer> listOne, List<Integer> listTwo) {
        this.itOne = listOne.iterator();
        this.itTwo = listTwo.iterator();
    }

    boolean hasNext(){
        return itOne.hasNext() || itTwo.hasNext();
    }

    Integer next(){
        if (itOne.hasNext()){

            Iterator<Integer> tmp = itTwo;
            itTwo = itOne;
            itOne = tmp;
        }

        return itTwo.next();
    }


}
