package interviewsKdn251.Company.LinkedIn;

/**
 * Created by user on 20.05.2017.
 */
// Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
// (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
// You are given a target value to search. If found in the array return its index, otherwise return -1.
// You may assume no duplicate exists in the array.

public class SearchInRotatedSortedArray {
    public static int find(int[] numbers, int toFind){
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (numbers[mid] == toFind) return mid;

            if (numbers[mid] >= numbers[start]){
                if ( toFind >= numbers[start] && toFind < numbers[mid] ){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

            if (numbers[mid] <= numbers[end]){
                if (toFind <= numbers[end] && toFind > numbers[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
