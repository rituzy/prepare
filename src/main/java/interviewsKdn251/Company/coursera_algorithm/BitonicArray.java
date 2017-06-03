package interviewsKdn251.Company.coursera_algorithm;

/**
 * Created by user on 28.05.2017.
 *
  Search in a bitonic array. An array is bitonic if it is comprised of an increasing sequence of
 integers followed immediately by a decreasing sequence of integers. Write a program that, given a
 bitonic array of n distinct integer values, determines whether a given integer is in the array.

 Standard version: Use ∼3lgn compares in the worst case.
 Signing bonus: Use ∼2lgn compares in the worst case (and prove that no algorithm can guarantee
 to perform fewer than ∼2lgn compares in the worst case).
*/
public class BitonicArray {
    void findInBitonic(int[] a, int val)
    {
        int left = a[0];
        int right = a.length - 1;
        descending_binary_search(a, left,right,val);
    }
    void descending_binary_search(int [] a, int left, int right, int value)
    {
        // empty interval
        if (left == right) {
            return;
        }

        // look at the middle of the interval
        int mid = (right+left)/2;
        if (a[mid] == value) {
            System.out.println("value found");
            return;
        }

        // interval is not splittable
        if (left+1 == right) {
            return;
        }

        if (value < a[mid]) {
            descending_binary_search(a, mid+1, right, value);
        }
        else {
            descending_binary_search(a, left, mid, value);
        }
    }



}
